import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}


class JsonUser {
    @JsonField(name = "user_name")
    private String username;
    
    public JsonUser(String username) {
        this.username = username;
    }
    
    public String toJson() throws IllegalAccessException {
        StringBuilder json = new StringBuilder("{");
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField annotation = field.getAnnotation(JsonField.class);
                field.setAccessible(true);
                json.append("\"" + annotation.name() + "\": \"" + field.get(this) + "\",");
            }
        }
        return json.substring(0, json.length() - 1) + "}";
    }
}

public class JsonFieldMain {
    public static void main(String[] args) throws IllegalAccessException {
        JsonUser user = new JsonUser("JohnDoe");
        System.out.println(user.toJson());
    }
}

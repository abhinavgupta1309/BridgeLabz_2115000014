import java.lang.reflect.*;
import java.util.*;

class User {
    private String username;

    public User() {}

    public String getUsername() {
        return username;
    }
}

class ObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {
        T obj = clazz.getDeclaredConstructor().newInstance();
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            if (properties.containsKey(field.getName())) {
                field.set(obj, properties.get(field.getName()));
            }
        }
        return obj;
    }
}

class CustomObjectMapper {
    public static void main(String[] args) throws Exception {
        Map<String, Object> props = new HashMap<>();
        props.put("username", "Alice");
        User user = ObjectMapper.toObject(User.class, props);
        System.out.println("User: " + user.getUsername());
    }
}

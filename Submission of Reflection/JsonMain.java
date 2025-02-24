import java.lang.reflect.*;

class JsonSerializer {
    public static String toJson(Object obj) throws IllegalAccessException {
        StringBuilder json = new StringBuilder("{");
        for (Field field : obj.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            json.append("\"" + field.getName() + "\": \"" + field.get(obj) + "\", ");
        }
        return json.substring(0, json.length() - 2) + "}";
    }
}

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }
}

class JsonMain {
    public static void main(String[] args) throws IllegalAccessException {
        User user = new User("Bob");
        System.out.println(JsonSerializer.toJson(user));
    }
}


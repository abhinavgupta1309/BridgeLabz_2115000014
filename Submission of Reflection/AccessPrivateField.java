import java.lang.reflect.*;

class Person {
    private int age = 25;
}

class AccessPrivateField {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        Field field = Person.class.getDeclaredField("age");
        field.setAccessible(true);
        System.out.println("Age before: " + field.getInt(p));
        field.setInt(p, 30);
        System.out.println("Age after: " + field.getInt(p));
    }
}

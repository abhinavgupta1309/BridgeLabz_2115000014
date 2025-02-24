import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class Project {
    @Todo(task = "Implement login", assignedTo = "Alice", priority = "HIGH")
    public void loginFeature() {}
    
    @Todo(task = "Optimize database", assignedTo = "Bob")
    public void optimizeDB() {}
}

public class TodoMain {
    public static void main(String[] args) {
        Method[] methods = Project.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);
                System.out.println(method.getName() + " - Task: " + todo.task() + ", Assigned to: " + todo.assignedTo() + ", Priority: " + todo.priority());
            }
        }
    }
}

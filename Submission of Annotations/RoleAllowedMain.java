import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value();
}

class Security {
    @RoleAllowed("ADMIN")
    public void restrictedAction(String role) {
        if (!"ADMIN".equals(role)) {
            System.out.println("Access Denied!");
            return;
        }
        System.out.println("Admin action executed");
    }
}

public class RoleAllowedMain {
    public static void main(String[] args) {
        new Security().restrictedAction("USER");
    }
}

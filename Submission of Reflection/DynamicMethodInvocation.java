import java.lang.reflect.*;
import java.util.Scanner;


class MathOperations {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
}


class DynamicMethodInvocation {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter method name (add/subtract/multiply): ");
        String methodName = scanner.next();
        Method method = MathOperations.class.getDeclaredMethod(methodName, int.class, int.class);
        MathOperations math = new MathOperations();
        System.out.println("Result: " + method.invoke(math, 10, 5));
    }
}



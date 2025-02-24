public class ExceptionPropagationExample {
    public static void method1() {
        System.out.println("Executing method1...");
        int result = 10 / 0;
    }
    public static void method2() {
        System.out.println("Calling method1 from method2...");
        method1();
    }
    public static void main(String[] args) {
        try {
            System.out.println("Calling method2 from main...");
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}

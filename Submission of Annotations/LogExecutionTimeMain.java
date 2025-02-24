import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {}

class Execution {
    @LogExecutionTime
    public void compute() {
        long start = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++);
        long end = System.nanoTime();
        System.out.println("Execution Time: " + (end - start) + " ns");
    }
}

public class LogExecutionTimeMain {
    public static void main(String[] args) {
        new Execution().compute();
    }
}

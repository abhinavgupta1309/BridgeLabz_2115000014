import java.lang.reflect.Method;

class ExecutionTimer {
public void fastMethod() {
System.out.println("Fast method executed");
}
public void slowMethod() throws InterruptedException {
Thread.sleep(1000);
System.out.println("Slow method executed");
}
public static void measureExecutionTime(Object obj, String methodName) throws Exception {
Method method = obj.getClass().getMethod(methodName);
long start = System.nanoTime();
method.invoke(obj);
long end = System.nanoTime();
System.out.println("Execution time of " + methodName + ": " + (end - start) / 1_000_000 + " ms");
}
}

class ExecutionTimingMain {
public static void main(String[] args) throws Exception {
ExecutionTimer timer = new ExecutionTimer();
ExecutionTimer.measureExecutionTime(timer, "fastMethod");
ExecutionTimer.measureExecutionTime(timer, "slowMethod");
}
}

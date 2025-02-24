import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;


@Retention(RetentionPolicy.RUNTIME)
@interface Inject {}


class Service {
void execute() {
System.out.println("Service Executed");
}
}


class Client {
@Inject
private Service service;
public void run() {
service.execute();
}
}


class DependencyInjector {
public static void injectDependencies(Object obj) throws IllegalAccessException {
for (Field field : obj.getClass().getDeclaredFields()) {
if (field.isAnnotationPresent(Inject.class)) {
field.setAccessible(true);
field.set(obj, new Service());
}
}
}
}


class DependencyInjectionMain {
public static void main(String[] args) throws IllegalAccessException {
Client client = new Client();
DependencyInjector.injectDependencies(client);
client.run();
}
}



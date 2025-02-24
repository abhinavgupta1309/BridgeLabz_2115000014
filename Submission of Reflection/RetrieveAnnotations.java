import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
    String name();
}

@Author(name = "John Doe")
class Book {}

class RetrieveAnnotations {
    public static void main(String[] args) {
        Author author = Book.class.getAnnotation(Author.class);
        System.out.println("Author: " + author.name());
    }
}

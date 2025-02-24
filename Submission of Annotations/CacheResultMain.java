import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {}

class CachingSystem {
    private static final Map<Integer, Integer> cache = new HashMap<>();
    
    @CacheResult
    public int expensiveCalculation(int number) {
        if (cache.containsKey(number)) {
            return cache.get(number);
        }
        int result = number * number;
        cache.put(number, result);
        return result;
    }
}

public class CacheResultMain {
    public static void main(String[] args) {
        CachingSystem cs = new CachingSystem();
        System.out.println(cs.expensiveCalculation(5));
        System.out.println(cs.expensiveCalculation(5));
    }
}

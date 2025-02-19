import java.util.*;
import java.time.*;
class MergeMaps {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2);
        Map<String, Integer> map2 = Map.of("B", 3, "C", 4);
        Map<String, Integer> mergedMap = new HashMap<>(map1);
        map2.forEach((key, value) -> mergedMap.merge(key, value, Integer::sum));
        System.out.println(mergedMap);
    }
}

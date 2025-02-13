import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class SubarraysWithZeroSum {
private static List<int[]> findSubarrays(int[] nums) {
List<int[]> result = new ArrayList<>();
HashMap<Integer, List<Integer>> map = new HashMap<>();
int sum = 0;
map.put(0, new ArrayList<>());
map.get(0).add(-1);
for (int i = 0; i < nums.length; i++) {
sum += nums[i];
if (map.containsKey(sum)) {
for (int start : map.get(sum)) {
result.add(new int[]{start + 1, i});
}
}
map.putIfAbsent(sum, new ArrayList<>());
map.get(sum).add(i);
}
return result;
}

public static void main(String[] args) {
int[] nums = {4, 2, -3, 1, 6};
List<int[]> subarrays = findSubarrays(nums);
for (int[] subarray : subarrays) {
System.out.println("Subarray found from index " + subarray[0] + " to " + subarray[1]);
}
}
}


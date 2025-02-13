import java.util.HashSet;

public class PairWithGivenSum {
private static boolean hasPairWithSum(int[] nums, int target) {
HashSet<Integer> set = new HashSet<>();
for (int num : nums) {
if (set.contains(target - num)) {
return true;
}
set.add(num);
}
return false;
}

public static void main(String[] args) {
int[] nums = {1, 4, 45, 6, 10, 8};
int target = 16;
System.out.println(hasPairWithSum(nums, target));
}
}


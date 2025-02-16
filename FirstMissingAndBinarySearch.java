import java.util.Arrays;
public class FirstMissingAndBinarySearch {
    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int missing = 1;
        for (int num : nums) {
            if (num == missing) missing++;
        }
        return missing;
    }
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println("First Missing Positive: " + firstMissingPositive(arr));
        int[] sortedArr = {1, 2, 3, 4, 5, 6};
        System.out.println("Binary Search Index: " + binarySearch(sortedArr, 4));
    }
}

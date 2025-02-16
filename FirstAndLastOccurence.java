public class FirstAndLastOccurence {
    public static int[] searchRange(int[] arr, int target) {
        return new int[]{findBound(arr, target, true), findBound(arr, target, false)};
    }
    private static int findBound(int[] arr, int target, boolean first) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                if (first) right = mid - 1;
                else left = mid + 1;
            } else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int[] result = searchRange(arr, 2);
        System.out.println("First Occurrence: " + result[0] + ", Last Occurrence: " + result[1]);
    }
}

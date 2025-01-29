import java.util.Arrays;
import java.util.Scanner;
public class AnagramChecker {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        scanner.close();        
        boolean isAnagram = checkAnagram(str1, str2);
        System.out.println("Are anagrams: " + isAnagram);
}    
        public static boolean checkAnagram(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
}
}

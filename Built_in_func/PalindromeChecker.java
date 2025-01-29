import java.util.Scanner;
public class PalindromeChecker {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(isPalindrome(str) ? "Palindrome" : "Not a Palindrome");
        scanner.close();
}
        static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right)
        if (s.charAt(left++) != s.charAt(right--)) return false;
        return true;
}
}


import java.util.Scanner;
public class StringComparison {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        scanner.close();        
        int comparison = compareStrings(str1, str2);
        if (comparison < 0) {
        System.out.println(str1 + " comes before " + str2);
}else if (comparison > 0) {
        System.out.println(str1 + " comes after " + str2);
}else {
        System.out.println("Both strings are equal.");
}
}    
        public static int compareStrings(String str1, String str2) {
        int len = Math.min(str1.length(), str2.length());
        for (int i = 0; i < len; i++) {
        if (str1.charAt(i) != str2.charAt(i)) {
        return str1.charAt(i) - str2.charAt(i);
}
}
        return str1.length() - str2.length();
}
}

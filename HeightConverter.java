import java.util.Scanner;
public class HeightConverter{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
        double heightCm = sc.nextDouble();
        double cmPerInch = 2.54;
        int inchesPerFoot = 12;
        double totalInches = heightCm / cmPerInch;

        int feet = (int) (totalInches / inchesPerFoot);
        double inches = totalInches % inchesPerFoot;

        System.out.printf("Your Height in cm is "+heightCm+ " while in feet is "+feet+ " and inches is "+inches );
}
}

import java.util.Scanner;
public class StudentFeeCalculator{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int fee = sc.nextInt();
	int discountPercent = sc.nextInt();
	double discount = (fee * discountPercent) / 100;
	double discountedFee = fee - discount;
	System.out.println("The discount amount is INR " + discount +  " and final discounted fee is INR "+discountedFee);
}
}

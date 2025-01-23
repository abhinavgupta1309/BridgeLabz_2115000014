import java.util.Scanner;
public class LeapYear{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int Year = sc.nextInt();
	if(Year>=1582){
	if(Year%4==0  && Year%100!=00){
	System.out.println("The Year "+Year+ " is a Leap Year");
}
else if(Year%400==0){
	System.out.println("The Year "+Year+ " is a Leap Year");
}else {
	System.out.println("The Year "+Year+ " is not a Leap Year");
}
}
else{
	System.out.println("The LeapYear program only works for year >= 1582");
}
}
}

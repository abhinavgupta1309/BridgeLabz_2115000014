import java.util.Scanner;
public class HandshakeCalculator2{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int numberOfStudents = sc.nextInt();
	int possibleHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
	System.out.println("The maximum number of possible handshakes is: " + possibleHandshakes);
}
}

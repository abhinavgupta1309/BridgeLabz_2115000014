import java.util.Scanner;
public class HandshakeCalculator{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int maxHandshakes = calculateHandshakes(n);
	System.out.printf("The maximum number of handshakes among "+n+" students is: "+maxHandshakes);
}
	public static int calculateHandshakes(int n){
	return (n * (n-1))/2;
}
}

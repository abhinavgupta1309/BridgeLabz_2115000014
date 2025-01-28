import java.util.Scanner;
public class StudentVoteChecker{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int studentAges[] = new int[10];
	System.out.println("Enter the ages of 10 students:");
	for(int i = 0; i<10; i++){
	System.out.print("Enter age for student " + (i+1) + ": ");
	studentAges[i] = sc.nextInt();
}
	System.out.println("Voting eligibility results:");
	for (int i = 0; i < 10; i++) {
        boolean canVote = canStudentVote(studentAges[i]);
        if (canVote) {
        System.out.println("Student " + (i+1) + " with age " + studentAges[i] + " can vote.");
}	else {
        System.out.println("Student " + (i+1) + " with age " + studentAges[i] + " cannot vote.");
}
}
}
	public static boolean canStudentVote(int age) {
        if (age < 0) {
        return false;
}
        return age >= 18;
}
}

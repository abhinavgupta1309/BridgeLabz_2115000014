import java.util.Scanner;
public class IntOperation8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter the starting city: ");
        String fromCity = sc.nextLine();
        System.out.print("Enter the via city: ");
        String viaCity = sc.nextLine();
        System.out.print("Enter the destination city: ");
        String toCity = sc.nextLine();
        System.out.print("Enter distance from starting city to via city (in miles): ");
        int fromToVia = sc.nextInt();
        System.out.print("Enter distance from via city to destination city (in miles): ");
        int viaToFinalCity = sc.nextInt();
        System.out.print("Enter the total travel time (in hours): ");
        int timeTaken = sc.nextInt();
        int totalDistance = fromToVia + viaToFinalCity;
        int averageSpeed = totalDistance / timeTaken;
        int speedCalculation = totalDistance % timeTaken + fromToVia;
        System.out.println("The results of Int Operations are:");
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Average Speed: " + averageSpeed + " miles/hour");
        System.out.println("Speed Calculation: " + speedCalculation);
    }
}

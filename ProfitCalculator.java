public class ProfitCalculator{
public static void main(String args[]){
	int costPrice = 129;
	int sellingPrice = 191;
	int Profit = sellingPrice - costPrice;
	double ProfitPercentage =(double) Profit/costPrice * 100;
	System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " +sellingPrice + "\n" + "The Profit is INR "+Profit+ " and the Profit Percentage is "+ProfitPercentage );
}
}

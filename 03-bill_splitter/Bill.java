import java.util.*;

public class Bill{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Bill-Splitter");
		System.out.println("Enter the total, pre-tax: ");

		double total = input.nextDouble();
		System.out.println("What is the tax percentage? __%");

		int tax = input.nextInt();
		System.out.println("What is the tip percentage? __%");

		int tip = input.nextInt();
		System.out.println("How many people? ");

		int numPeople = input.nextInt();
		double perPerson = (total * (tax/100.0 + 1) * (tip/100.0 + 1)) / numPeople;

		System.out.println("Each person must pay $" + perPerson);

	}//end main method
}//end class

package currency_convert;
import java.util.Scanner;

public class currency_convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		convertSelection();
	}
	
	public static void convertSelection() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input the currency you want to transfer:");
		int userInput = scan.nextInt();
		System.out.println("please input the amount of money:");
		double amt = scan.nextDouble();
		switch(userInput) {
			case 1:
				CADconvert(amt);
				break;
			case 2:
				USDconvert(amt);
				break;
			default:
				System.out.println("Invalid choice");
		}
		
	}
	
	public static void CADconvert(double amt) {
		double result = amt / 5.02;
		System.out.println("CAD:"+result);
	}
	public static void USDconvert(double amt) {
		double result = amt / 6.77;
		System.out.println("USD:"+result);
	}

}

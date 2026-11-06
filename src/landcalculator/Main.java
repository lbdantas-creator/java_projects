package landcalculator;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double width, length, squaremeter, AREA, PRICE;
		
		System.out.println("Enter the width of the land:");
		width = sc.nextDouble();
		
		System.out.println("Enter the length of the land:");
		length = sc.nextDouble();
		
		System.out.println("Enter the price per square meter:");
		squaremeter = sc.nextDouble();

		AREA = width * length;
		PRICE = AREA * squaremeter;

		System.out.printf("Land area: %.2f meters².%n", AREA);
		System.out.printf("Land price: $ %.2f%n", PRICE);

		sc.close();
	}

}

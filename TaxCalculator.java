package finale;

import java.util.Scanner;

public class TaxCalculator {
	double price;
	double tax;
	double total;
	public void TaxJordan() {
		tax= price*8/100;
		total=tax+price;
		System.out.println("The price with tax= "+total);
	}public static void main(String[] args) {
		try (Scanner m = new Scanner(System.in)) {
			TaxCalculator tax=new TaxCalculator();
			System.out.println("Enter the price of the product you want to buy: ");
			tax.price=m.nextDouble();
			tax.TaxJordan();
		}
}}

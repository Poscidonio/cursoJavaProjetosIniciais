package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("What is the dollar price ?");
		double price = sc.nextDouble();
		System.out.println("How many dollars will be bought ?");
		double manyDollars = sc.nextDouble();
		
		double A = CurrencyConverter.amount(price, manyDollars);
		
		System.out.printf("Amount to be paid in reais = %.2f%n" , A);
	}

}

package util;

public class CurrencyConverter {

	
	public static double amount(double price, double manyDollars) {
		return manyDollars * ((0.06 * price) + price);
	}

}

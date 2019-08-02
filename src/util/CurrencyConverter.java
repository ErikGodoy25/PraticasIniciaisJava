package util;


public class CurrencyConverter {
	
	public static final double Iof = 0.06;
		
	public static double dollarToReal (double dollar, double cashQuantity) {
		return dollar * cashQuantity * (1.0 + Iof); 
		
	}
	
	
}

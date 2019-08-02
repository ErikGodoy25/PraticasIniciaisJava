package cap5Udemy;

import java.util.Locale;
import java.util.Scanner;
import entities.ProductVetores;

public class ProductVetores2 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ProductVetores vect[] = new ProductVetores [n];
		
		for (int i=0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ProductVetores(name, price);
			
		}
		
		double sum = 0.0;
		
		for (int i=0; i < vect.length; i++) {
			
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("Average Price this = %.2f%n", avg );
		
				
		sc.close();

	}

}

package exerciciosPraticos;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioEntDados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your full Name");
		String name = sc.nextLine();
		System.out.println("How many bedrooms are there is your house");
		int age = sc.nextInt();
		System.out.println("Enter product price:");
		double valor = sc.nextDouble();
		
		System.out.println("Enter your last name, age and height (same line)");
		String name2 = sc.next();
		int age2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		
		System.out.println(name);
		System.out.println(age);
		System.out.printf("%.2f%n" , valor);
		System.out.println(name2);
		System.out.println(age2);
		System.out.printf("%.2f%n",valor2);
		
		sc.close();
		

	}

}

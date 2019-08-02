package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class CalculoRectangle {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		
		System.out.println("Enter wiht width");
		System.out.print("Value Width:");
		
		rect.width = sc.nextDouble();
		
		System.out.println();
		System.out.println("Enter wiht height");
		System.out.print("Value height:");
		
		rect.heigth = sc.nextDouble();
		
		
		System.out.println();
		System.out.printf("Area = %.2f%n", rect.area());
		System.out.printf("Perimeter = %.2f%n", rect.parimeter());
		System.out.printf("Diagonal = %.2f%n", rect.diagonal());
		
		sc.close();

	}

}

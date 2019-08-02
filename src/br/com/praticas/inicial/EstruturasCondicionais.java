package br.com.praticas.inicial;

import java.util.Scanner;

public class EstruturasCondicionais {

	public static void main(String[] args) {
		
		System.out.println("Enter an integer number");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if (n % 2 ==0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
		
		
		sc.close();
	}

}

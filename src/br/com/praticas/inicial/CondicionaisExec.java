package br.com.praticas.inicial;

import java.util.Scanner;

public class CondicionaisExec {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o Valor A: ");
		int a = sc.nextInt();
		System.out.println("Informe o Valor B: ");
		int b = sc.nextInt();
		System.out.println("Informe o Valor C: ");
		int c = sc.nextInt();
		
		if (a > b && a > c) {
		System.out.println("Higher a: " + a);	
			
		}else if(b>a && b>c) {
			System.out.println("Higher b: " + b);	
		}else {
			System.out.println("Higher c: " + c);	
		}
		
		
		sc.close();

	}

}

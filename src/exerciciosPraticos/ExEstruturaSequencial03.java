package exerciciosPraticos;

import java.util.Scanner;

public class ExEstruturaSequencial03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, dif;
		
		System.out.println("Informe o valor a: ");
		a = sc.nextInt();
		System.out.println("Informe o valor b: ");
		b = sc.nextInt();
		System.out.println("Informe o valor c: ");
		c = sc.nextInt();
		System.out.println("Informe o valor d: ");
		d = sc.nextInt();
		
		dif = a * b - c * d ;
		
		System.out.println("Diferença é: " + dif);
		
		sc.close();
	}

}

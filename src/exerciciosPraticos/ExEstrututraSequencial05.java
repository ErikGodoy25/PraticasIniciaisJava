package exerciciosPraticos;

import java.util.Locale;
import java.util.Scanner;

public class ExEstrututraSequencial05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o produto 1: ");
		int produto1 = sc.nextInt();
		System.out.print("Quantidade de peças do produto1: ");
		int Qtproduto1 = sc.nextInt();
		System.out.print("Informe o Valor Unitário produto 1: ");
		double Vlproduto1 = sc.nextDouble();
		
		System.out.print("Informe o produto 2: ");
		int produto2 = sc.nextInt();
		System.out.print("Qauntidade de peças do produto2: ");
		int Qtproduto2 = sc.nextInt();
		System.out.print("Informe o Valor Unitário produto2: ");
		double Vlproduto2 = sc.nextDouble();
		
		double SomaProd1 = Qtproduto1 * Vlproduto1;
		
		double somaProd2 = Qtproduto2 * Vlproduto2;
		
		double total = SomaProd1 + somaProd2;
		
		System.out.println("Valor total Prod1 + Prod2 = " + total );
	
		
		sc.close();
	}

}

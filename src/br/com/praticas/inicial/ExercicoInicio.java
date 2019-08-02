package br.com.praticas.inicial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicoInicio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a largura do Terreno");
		double largura = sc.nextDouble();
		System.out.println("Digite o Comprimento");
		double comprimento = sc.nextDouble();
		System.out.println("Digite o valor do metro quadrado");
		double metroQuadrado = sc.nextDouble();
		
		
		
		double area = largura * comprimento;
		
		double preco = area * metroQuadrado;
			
	
		System.out.printf("AREA: %.2f%n" , area);
		System.out.printf("Preço: %.2f%n" ,preco);
		
		
		
		sc.close();

	}

}

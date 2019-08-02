package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CalculoAprovacao;

public class CalculoAvaliacao {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CalculoAprovacao student = new CalculoAprovacao();
		
		System.out.print("Informe o nome: ");
		student.nome = sc.nextLine();
		
		System.out.println("Informe a n1: ");
		student.tr1 = sc.nextDouble();
		
		System.out.println("Informe a n2: ");
		student.tr2 = sc.nextDouble();
		
		System.out.println("Informe a n3: ");
		student.tr3 = sc.nextDouble();
		
		System.out.printf("Nota Final: %.2f%n", student.somaNota());
		
		if(student.somaNota() > 60.0 ) {
			System.out.println("Aprovado ");
		} 
		else {
			System.out.println("Não aparovado");
			System.out.printf("Restou %.2f pontos%n", student.media());
		}
		
		sc.close();

	}

}
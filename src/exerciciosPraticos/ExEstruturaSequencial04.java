package exerciciosPraticos;

import java.util.Locale;
import java.util.Scanner;

public class ExEstruturaSequencial04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o código do funcionário: ");
		int cod = sc.nextInt();
		System.out.print("Informe o numero de horas: ");
		int horas = sc.nextInt();
		System.out.print("Valor de horas: ");
		double VLhoras = sc.nextDouble();
		
		double salario = VLhoras * horas;
		
		
		System.out.println("Cód funcionário: " + cod);
		System.out.println("Horas Trabalhadas: " + horas);
		System.out.println("Valor da Hora trabalhada: " + VLhoras);
		
		System.out.printf("Total Salário A + B (Horas x Hora trabalhada) %.2f%n: " , salario );
		
		sc.close();

	}

}

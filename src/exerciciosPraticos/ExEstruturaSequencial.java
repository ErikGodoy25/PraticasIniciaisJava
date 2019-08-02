package exerciciosPraticos;

import java.util.Locale;
import java.util.Scanner;

public class ExEstruturaSequencial {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o valor do Raio: ");
		double R, A, pi = 3.14159;
	    
	    R = sc.nextDouble();

	    A = pi * R * R;

	    System.out.printf("A=%.4f%n", A);

		sc.close();
	}

}

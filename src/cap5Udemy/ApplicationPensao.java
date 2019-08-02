package cap5Udemy;

import java.util.Scanner;

import entities.PensaoVector;

public class ApplicationPensao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PensaoVector vect [] = new PensaoVector[10];
				
		System.out.println("Quantos quartos você irá alugar ? ");
		int n = sc.nextInt();
		for (int i=1; i<=n ; i++) {		
			System.out.println();
			System.out.println("Quarto #" + i + ":");
			System.out.println("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("E-mail: ");
			String email = sc.nextLine();
			System.out.println("Quarto :");
			int quarto = sc.nextInt();
			vect[quarto] = new PensaoVector(name, email);
		}
		
		System.out.println();
		System.out.println("Quartos alugados: ");
		for( int i=0; i<10; i++) {
			
			if(vect[i] != null) {
				System.out.println( i + ": " + vect[i]);
			}
		}
		
		sc.close();

	}

}

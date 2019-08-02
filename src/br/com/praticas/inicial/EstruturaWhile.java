package br.com.praticas.inicial;

import java.util.Scanner;

public class EstruturaWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe a senha:");
		int n = sc.nextInt();
		
		
		while(n != 2002) {
			System.out.println("Senha incorreta, informe novamente a senha");
			n = sc.nextInt();
			
		}
			System.out.println("Senha Correta, Acesso Permitido");	
		
		sc.close();
		
	}

}

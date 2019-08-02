package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBanco;

public class BankLine {

	public static void main(String[] args) {
		
		ContaBanco conta;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Informe o numero da conta: ");
		int nconta = sc.nextInt();
		System.out.print("Informe o Titular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Irá realizar um deposito inicial? (y/n) ");
		char resposta = sc.next().charAt(0);
		
		if(resposta == 'y') {
			System.out.println("Informe o valor do depóstio inicial: ");
			double inicialDeposito = sc.nextDouble();
			conta = new ContaBanco(nconta, titular, inicialDeposito);
		} 
		else {
			conta = new ContaBanco(nconta, titular);
		}
		
		System.out.println();
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre com o um depósito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Saldo conta A+B: ");
		System.out.println(conta);
		
		
		System.out.println();
		System.out.print("Informe o valor do Saque: ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		System.out.println("Saldo conta A-B:");
		System.out.println(conta);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}
}
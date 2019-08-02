package entities;

public class ContaBanco {

	private int nconta;
	private String titular;
	private double saldo;
	
	
	public ContaBanco(int nconta, String titular) {
		this.nconta = nconta;
		this.titular = titular;
	}


	public ContaBanco(int nconta, String titular, double inicialDeposito) {
		this.nconta = nconta;
		this.titular = titular;
		deposito(inicialDeposito);
		
	}


	public int getNconta() {
		return nconta;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double contabanco) {
		
		saldo += contabanco;
	}
	
	public void saque (double ContaBanco) {
		
		saldo -= ContaBanco + 5.00;
	}
	
	public String toString() {
		
		return " Numero Conta:  "
				+ nconta
				+", Nome do Titular: "
				+ titular
				+", balance: $  "
				+String.format("%.2f", saldo);
				
				
	}


	
	
	
	
	

	
	
	
	
	
	
}

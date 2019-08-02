package entities;

public class CalculoAprovacao {
	
	public String nome;
	public double tr1;
	public double tr2;
	public double tr3;
		
	
	public double somaNota() {
		
		return tr1 + tr2 + tr3;
	}
	
	public double media() {
		
		if(somaNota() < 60.0) {
			return 60.0 - somaNota();
		}
		else {
			return 0.0;
		}
	}
	
	public String toString() {
		return nome
				+ String.format("Falta %.2f% pontos%n", somaNota() - media());		
	}
	
}

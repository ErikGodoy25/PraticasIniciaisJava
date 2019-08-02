package entities;

public class Employee {
	
	public String name;
	public double grossSalary;  // Sálario Bruto
	public double tax; // imposto
	

	public double netSalary() {
		
		return tax - grossSalary;
	}
	
	public void  IncreaseSalary(double percentage) {
		
		grossSalary += grossSalary * percentage / 100.0;
		
	}
	
	public String toString() {
		
		return name 
				+  ", $ " 
				+ String.format("%.2f", netSalary());
	}
}

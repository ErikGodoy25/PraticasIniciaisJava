package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class CalculeSalary {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	
	Employee emp = new Employee();
	System.out.print("Enter with name of Funcionary : ");
	emp.name = sc.nextLine();
	
	System.out.println("--------------------------");
	
	System.out.print("Enter with Gross Salary: ");
	emp.grossSalary = sc.nextDouble();

	System.out.print("Enter with Tax: ");
	emp.tax = sc.nextDouble();
	System.out.println("--------------------------");
	
	System.out.print("Employee: " + emp);
	System.out.println();
	
	System.out.print ("Which percentage to increase salary:");
	double percentage = sc.nextDouble();
	emp.IncreaseSalary(percentage);
	System.out.println("--------------------------");
	
	System.out.println();
	System.out.println("Update data :" + emp );
	
	
	sc.close();
	

	}

}

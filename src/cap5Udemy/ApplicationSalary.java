package cap5Udemy;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeFuncionary;

public class ApplicationSalary {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<EmployeeFuncionary> list = new ArrayList<>();

		System.out.println("Quantos funcionarios você vai registrar?");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.print("Funcionario #" + i + ": ");
			System.out.print("Informe o id:");
			int id = sc.nextInt();
			System.out.print("Informe o nome:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Informe o salário do funcionário: ");
			double salary = sc.nextDouble();
			list.add(new EmployeeFuncionary(id, name, salary));

		}
		System.out.println();
		System.out.print("Informe o id do funcionário a ser acrescentado aumento:");
		
		int id = sc.nextInt();
		EmployeeFuncionary func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (func == null) {
			System.out.println("Esse id não existe");
		} else {

			System.out.print("Informe a porcentagem:");
			double percentage = sc.nextDouble();
			func.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("Lista de Funcionários");
		
		for (EmployeeFuncionary obj : list) {
			System.out.println(obj);
		}

		sc.close();

	}

}

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.println("Enter Name, Gross Salary and Tax:");
		emp.name = sc.nextLine();
		emp.grossSalary = sc.nextDouble();
		emp.tax = sc.nextDouble();
		System.out.println();
		System.out.printf("Employee: %s, $%.2f%n", emp.name, emp.netSalary());
		System.out.println();
		System.out.print("Wich percentage to increase salary? ");
		System.out.println();
		double percentage = sc.nextDouble();
		System.out.println();
		emp.increaseSalary(percentage);
		System.out.println("Updated data: " + emp);
		System.out.println();
		
		sc.close();
	}

}

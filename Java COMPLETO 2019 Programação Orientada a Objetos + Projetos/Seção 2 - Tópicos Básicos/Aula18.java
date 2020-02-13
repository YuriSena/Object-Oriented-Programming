package course;

import java.util.Locale;
import java.util.Scanner;

public class Aula18 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name, lastName;
		int bedrooms, age;
		double price, height;
		
		System.out.println("Enter your full name:");
		name = sc.nextLine();
		System.out.println("How many bedrooms are there in your house?");
		bedrooms = sc.nextInt();
		System.out.println("Enter product price:");
		price = sc.nextDouble();
		System.out.println("Enter your last name, age and height");
		lastName = sc.next();
		age = sc.nextInt();
		height = sc.nextDouble();
		
		System.out.println(name);
		System.out.println(bedrooms);
		System.out.printf("%.2f%n", price);
		System.out.println(lastName);
		System.out.println(age);
		System.out.printf("%.2f", height);
		
		sc.close();
	}

}

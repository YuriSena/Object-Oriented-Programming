package course;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencial_05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cod1, cod2, num1, num2;
		float valor1, valor2, total;
		System.out.print("Produto 1: ");
		cod1 = sc.nextInt();
		num1 = sc.nextInt();
		valor1 = sc.nextFloat();
		
		System.out.print("Produto 2: ");
		cod2 = sc.nextInt();
		num2 = sc.nextInt();
		valor2 = sc.nextFloat();
		total = (num1 * valor1)+(num2 * valor2);
		
		System.out.printf("VALOR A PAGAR: %.2f", total);
		sc.close();
	}

}

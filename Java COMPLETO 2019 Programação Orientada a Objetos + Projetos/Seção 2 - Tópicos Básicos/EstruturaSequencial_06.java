package course;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencial_06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double A, B, C;
		Double triangulo, trapezio, circulo, quadrado, retangulo;
		System.out.print("Informe os 3 parametros: ");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		retangulo = A * B;
		circulo = 3.14159 * (C*C); 
		trapezio = ((A+B)*C)/2;
		quadrado = B * B;
		triangulo = (A * C)/2;
		
		System.out.printf("TRIANGULO: %.3f %n", triangulo);
		System.out.printf("CIRCULO: %.3f %n", circulo);
		System.out.printf("TRAPEZIO: %.3f %n", trapezio);
		System.out.printf("QUADRADO: %.3f %n", quadrado);
		System.out.printf("RETANGULO: %.3f %n", retangulo);
		
		sc.close();
	}

}

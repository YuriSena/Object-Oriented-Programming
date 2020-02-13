package course;

import java.util.Locale;
import java.util.Scanner;
import rectangle.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		System.out.print("Enter the width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.printf("Area: %.2f%nPerimeter: %.2f%nDiagonal: %.2f%n", 
					rectangle.Area(), rectangle.Perimeter(), rectangle.Diagonal());
		sc.close();
	}

}

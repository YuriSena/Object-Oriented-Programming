package course;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um inteiro: ");
		int x = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Digite um nome: ");
		String name = sc.nextLine();
		
		System.out.println(x);
		System.out.println(name);
		sc.close();
	}

}

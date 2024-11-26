package es.cursojava.inicio.condicionales;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Num");
		int num = scan.nextInt();
		System.out.println("Num2");
		int num2 = scan.nextInt();
		System.out.println("Palabra");
//		scan.close();
		scan = new Scanner(System.in);
		String palabra = scan.nextLine();
		System.out.println(palabra);
		
		if (palabra == "suma") {
			System.out.println("Test");
		}
		
	}
}

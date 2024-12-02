package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio7Fibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe un número");
		int numero = scan.nextInt();
		
		int num1 = 0;
		int num2 = 1;
		
		System.out.println(num1);
		System.out.println(num2);
		
		for (int i=0 ; i<numero-2 ; i++) {
			int suma = num1 + num2;
			System.out.println(suma);
			num1 = num2;
			num2 = suma;
		}
		

	}

}









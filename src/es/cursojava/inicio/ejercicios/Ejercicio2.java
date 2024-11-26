package es.cursojava.inicio.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//edad = input("Introduce tu edad")
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int num1 = scan.nextInt();
		
		System.out.println("Introduce otro numero");
		int num2 = scan.nextInt();

		boolean comparador = num1>num2;
		
		System.out.println(num1 +" es mayor que "+ num2 +": "+comparador);
		System.out.println(num1 +" es igual a "+ num2 +": "+ (num1==num2));
		System.out.println(num1 +" es menor que "+ num2 +": "+ (num1<num2));
		
		
		System.out.println(7/0);
		
		
		scan.close();
	}

}

package es.cursojava.inicio.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int num1 = scan.nextInt();
		
		System.out.println("Introduce otro numero");
		int num2 = scan.nextInt();
		
		int suma = num1+num2;
		System.out.println("Suma "+ (suma) );
		System.out.println("Resta "+ (num1-num2));
		System.out.println("Multiplicación "+ (num1*num2));
		System.out.println("División "+ (num1/num2));
		
	}

}

package es.cursojava.inicio;

import java.util.Scanner;

public class HolaMundo {
	public static void main (String [] args) {
		System.out.println("Hola Mundo");
		final int  NUMERO = 9;//Constante
		//numero = 12;
		String nombre = "Eva";
		int edad = 18;
		System.out.println(Math.PI);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\tIntroduce tu año de nacimiento");
		int anio = scan.nextInt();
		System.out.print(anio);
		System.out.println("Termina");
		System.out.println("\tTerm\nina2");	
		
	}
}

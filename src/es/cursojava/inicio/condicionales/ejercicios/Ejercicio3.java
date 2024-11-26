package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		System.out.println("1. Pintar Cuadrado");
		System.out.println("2. Validar email");
		System.out.println("3. Añadir Alumno");
		System.out.println("4. Salir");
		
		System.out.println("\nElige una opción");
		Scanner scan = new Scanner(System.in);
		int opcion = scan.nextInt();
		
		switch (opcion) {
			case 1: System.out.println("Has elegido opción "+opcion+", pintar cuadrado");break;
			case 2: System.out.println("Has elegido opción "+opcion+", validar email");break;
			case 3: System.out.println("Has elegido opción "+opcion+", añadir alumno");break;
			case 4: System.out.println("Adios");break;
			default: System.out.println("Opción incorrecta");
		}
		
		
	}
}

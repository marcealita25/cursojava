package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

/*
Solicitar por consola el numero de alumnos de un aula. 
Pedir para cada alumno su nota
Indicar la nota media de todos los alumnos del aula.
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe un número de alumnos");
		int numeroAlumnos = scan.nextInt();

		double sumatorioNotas = 0; 
		for (int i = 0; i<numeroAlumnos ; i++) {
			System.out.println("Introduce la nota");
			//sumatorioNotas = sumatorioNotas+ scan.nextDouble();
			sumatorioNotas += scan.nextDouble();
		}
		
		System.out.println("La nota media de los "+ numeroAlumnos 
				+" es "+ (sumatorioNotas/numeroAlumnos));
	}

}

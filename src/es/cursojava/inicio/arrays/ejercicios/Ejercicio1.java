package es.cursojava.inicio.arrays.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce número de alumnos");
		int numAlumnos = scan.nextInt();
		String [] nombresAlumnos = new String[numAlumnos];
		
		for (int i =0 ; i< nombresAlumnos.length ; i++ ) {
			scan = new Scanner(System.in);
			System.out.println("Introduce nombre del alumno");
			nombresAlumnos[i] = scan.nextLine();
		}
		
		for (int i =0 ; i< nombresAlumnos.length ; i++ ) {
			System.out.println(nombresAlumnos[i] );
		}
		for (String nombre : nombresAlumnos) {
			System.out.println(nombre);
		}

		System.out.println("Nombres que empiezan por A");
		for (String nombre : nombresAlumnos) {
			if (nombre.toLowerCase().startsWith("a")) {
				System.out.println(nombre);
			}
		}
		
//		String [] apellidosAlumnos = {"Martín",null, "Caro"};
//		int i=0;
//		for (String apellido : apellidosAlumnos) {
//			if (apellido==null) {
//				scan = new Scanner(System.in);
//				System.out.println("Introduce apellido del alumno");
//				apellidosAlumnos[i] = scan.nextLine();
//				
//			}
//			i++;
//		}
//		
//		for (String apellido : apellidosAlumnos) {
//			System.out.println(apellido);
//		}
	}

}

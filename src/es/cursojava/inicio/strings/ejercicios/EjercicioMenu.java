package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

public class EjercicioMenu {

	public static void main(String[] args) {
		int opcion = 0;
		final int OPCION_SALIR = 4;
		do {
			System.out.println("\n1. Pintar Cuadrado");
			System.out.println("2. Validar email");
			System.out.println("3. Añadir Alumno");
			System.out.println("4. Salir");
			
			System.out.println("\nElige una opción");
			Scanner scan = new Scanner(System.in);
			opcion = scan.nextInt();
			
			switch (opcion) {
				case 1: 
					System.out.println("\nIndica tamaño");
					scan = new Scanner(System.in);
					int size = scan.nextInt();
					
					for(int fila=0; fila<size ; fila++) {
						for(int columna=0; columna<size ; columna++) {
							if(fila==0 || fila==size-1 || columna==0 || columna==size-1) {
								System.out.print("* ");
							}else {
								System.out.print("  ");
							}
						}
						System.out.println();
					}
					
					break;
				case 2: System.out.println("Has elegido opción "+opcion+", validar email");break;
				case 3: System.out.println("Has elegido opción "+opcion+", añadir alumno");break;
				case 4: System.out.println("Adios");break;
				default: System.out.println("Opción incorrecta");
			}
		}while(opcion!=OPCION_SALIR);

	}

}

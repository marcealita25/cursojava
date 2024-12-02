package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	//Mostrar todas las tablas de multiplicar hasta el número que solicitéis al usuario
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe un número");
		int numero = scan.nextInt();
		
		for (int i = 1; i<=numero ; i++) {
			System.out.println("Tabla del " + i);
			for (int j = 1; j<=10 ; j++) {
				System.out.println("\t"+ i +"x" + j +"="+(i*j));
			}
			
		}

	}

}

package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

/*
 * 
Numero tenistas en el top 10 --> 
+ Pedir por teclado la cantidad de tenistas que se apuntan a un torneo, 
+ por cada uno de ellos preguntar en que puesto de la ATP se encuentran. 
+ Indicar cuantos tenistas estarían entre los diez primeros.
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe un número de tenistas");
		int numeroTenistas = scan.nextInt();
		int contadorTopTen = 0;
		
		for (int i=0 ; i<numeroTenistas ; i++) {
			int puestoATP = 0;
			do {
				System.out.println("Para el tenista "+ (i+1) +" puesto ATP?");
				puestoATP = scan.nextInt();
			}while (puestoATP<=0);
			
			if (puestoATP<=10) {
				contadorTopTen++;
			}
		}
		
		System.out.println("Hay "+ contadorTopTen +" tenistas que estan en el top10");

	}

}

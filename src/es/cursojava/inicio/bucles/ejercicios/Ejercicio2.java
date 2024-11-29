package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int iteraciones=0;
		int contadorMultiplosDe3 = 0;
		int contadorMultiplosDe5 = 0;
		
		do {
			System.out.println("Escribe un número");
			int numero = scan.nextInt();
			
			if(numero%3==0) {
				contadorMultiplosDe3++;
			}
			if (numero%5==0) {
				contadorMultiplosDe5++;
			}
			
			iteraciones++;
		}while(iteraciones<10);
		
		System.out.println("Hay " + contadorMultiplosDe3 + " multiplos de 3");
		System.out.println("Hay " + contadorMultiplosDe5 + " multiplos de 5");
	}

}

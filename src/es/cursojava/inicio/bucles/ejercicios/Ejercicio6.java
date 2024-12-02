package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe un número");
		int numero = scan.nextInt();
		
		do {
			boolean esPar = numero%2==0;
			if (esPar){
				numero = numero/2;
			}else {
				numero = numero*3+1;
			}
			System.out.println(numero);
			
		}while(numero!=1);

	}

}

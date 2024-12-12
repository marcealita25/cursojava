package es.cursojava.inicio.arrays;

import java.util.Scanner;

public class EjemplosArrays {

	public static void main(String[] args) {
		
		int [] numeros = new int[6];
		String [] palabras = new String [3];
		for ( String palabra :   palabras  ) {
			System.out.println(palabra);
		}
		
		System.out.println(numeros[1]);
		numeros[1]=8;
		System.out.println(numeros[1]);
		numeros[1]=5;
		numeros[1]=7;
		System.out.println(numeros[5]);
		
		
		//Declaro el array y le indico que tiene tamaño de 4
		String[] colores = new String[4];
		//Asigno valores a cada posición
		colores[0]="Rojo";
		colores[1]="Azul";
		colores[2]="Verde";
		colores[3]="Amarillo";
		
		//Declaro e inicializo un array con dos valores directamente
		String[] colores2 = {"Blanco","Negro"};
		
		for (int i=0; i<colores.length ; i++) {
			String color = colores[i];
			System.out.println(color);
		}
		
		System.out.println("===========================");
		//Bucle foreach
		for ( String color : colores ) {
			System.out.println(color);
			
		}
		
//		System.out.println(colores[0]);
//		System.out.println(colores[1]);
//		System.out.println(colores[2]);
//		System.out.println(colores[3]);
		
		
	}

}

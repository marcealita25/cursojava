package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//        System.out.print("Ingresa un texto: ");
        String texto = "hola";
        String vocales = "aeiou";
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            //if (caracter=='a' || caracter=='e' || caracter=='i' 
            //		|| caracter=='o' || caracter=='u')
            if (vocales.indexOf(caracter) != -1) {
                contador++;
            }
        }
        System.out.println("Número de vocales: " + contador);

	}

}

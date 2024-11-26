package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int num1 = scan.nextInt();
		System.out.println("Introduce otro numero");
		int num2 = scan.nextInt();
		
		//scan = new Scanner(System.in);
		scan.nextLine();
		System.out.println("Introduce la operación");
		String operacion = scan.nextLine();
		
		int resultado = 0;
		if (operacion.equals("suma") ||  operacion.equals("+")) {
			resultado = num1 + num2;
			operacion = "suma";
		}else if (operacion.equals("resta") ||  operacion.equals("-")) {
			resultado = num1 - num2;
			operacion = "resta";
		}else if (operacion.equals("multiplica") ||  operacion.equals("*")) {
			resultado = num1 * num2;
			operacion = "multiplicación";
		}else if (operacion.equals("divide") ||  operacion.equals("/")) {
			resultado = num1 / num2;
			operacion = "división";
		}
		
		System.out.println("La "+operacion+" de "+num1+" y "+ num2 + " es "+ resultado);
	}

}

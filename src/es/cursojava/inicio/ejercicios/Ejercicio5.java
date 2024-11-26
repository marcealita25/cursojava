package es.cursojava.inicio.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce temperatura en grados Celsius");
		double tempCelsius = scan.nextDouble();
		System.out.println(9/5);
		double tempFahrenheit = tempCelsius*9.0/5.0+32;
		System.out.println(tempFahrenheit);
		
		int num2 = 6;
		System.out.println(num2);
		//num2 = num2 + 7;
		int operacion = (8+3)*4/2+(num2++);
		
		System.out.println(num2);
		System.out.println(operacion);
	}

}

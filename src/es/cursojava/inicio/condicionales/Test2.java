package es.cursojava.inicio.condicionales;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce operación");
		String operacion = scan.next();
		
		if (operacion == "suma") {
			System.out.println("Estas sumando");
		}else {
			System.out.println("Error");
		}
		
		//System.out.println(msg2=="hola");
	}
}

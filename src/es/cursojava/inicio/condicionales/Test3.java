package es.cursojava.inicio.condicionales;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		String msg = "hola";
		String msg2 = "hola";
		String msg3 = new String("hola");
		
//		System.out.println(msg);
//		System.out.println(msg2);
//		System.out.println(msg3);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce operación");
		String operacion = scan.next();//"hola"
		System.out.println(msg==operacion);
		System.out.println(msg==msg2);
		
		
//		System.out.println(msg==msg2);
//		System.out.println(msg==msg3);
//		System.out.println(msg.equals(msg3));

	}

}


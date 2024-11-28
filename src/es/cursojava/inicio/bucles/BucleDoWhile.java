package es.cursojava.inicio.bucles;

public class BucleDoWhile {

	public static void main(String[] args) {
		int num = 3;
		int edad = 0;
		do {
			System.out.println("Hola "+num + "-"+ edad);
			num++;
			edad=21;
			edad--;
		}while(12>num || edad<18);
		
		System.out.println("Termina");
	}

}

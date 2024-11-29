package es.cursojava.inicio.bucles.ejercicios;

//1. Mostrar los numeros pares del 100 al 0
public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Con bucle for
		for (int i=100 ;  i>= 0  ;  i-=2 ) {
			System.out.println(i);
		}
		
		//Otra manera con while
		int num=100;
		while (num>=0) {
			if(num%2==0) {
				System.out.println(num);
			}
			num--;
		}
	}

}

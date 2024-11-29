package es.cursojava.inicio.bucles.ejercicios;

//3. Mostrar los pares del 2 al 100 y al mismo tiempo los impares del 99 al 1
//2-99
//4-97
//6-95
public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Una manera con for
		for ( int i=2, j=99 ;  i<=100  ;  i+=2,j-=2   ) {
			System.out.println(i + "-" + j);
		}

		//Otra manera con while
		int pares = 2;
		int impares = 99;
		while(pares<=100) {
			
			System.out.println(pares + "-" + impares);
			pares+=2;
			impares-=2;
		}
	}

}

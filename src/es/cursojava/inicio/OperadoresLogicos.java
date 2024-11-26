package es.cursojava.inicio;

public class OperadoresLogicos {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		
		//>, >=, <, <=, ==, !=, !
		boolean comparador = num1!=num2;
		System.out.println(!comparador);
		
		//&& and ( y )
		//|| or  ( o )
		boolean comparador2 = num1 == num2 & esPar(num2);
		System.out.println(comparador2);
		
		
		// Sin paréntesis: evaluación directa
        boolean resultado1 = (num1 < num2) || num1 > 0 && num2 < 5;
        System.out.println("Resultado sin paréntesis: " + resultado1); // true

        // Con paréntesis: cambia la prioridad
        boolean resultado2 = (num1 < num2) || ((num1 > 0) && (num2 < 5));
        System.out.println("Resultado con paréntesis: " + resultado2); // false
	}
	
	private static boolean esPar (int numero) {
		System.out.println("Entra "+numero);
		return numero%2==0;
	}
	
}


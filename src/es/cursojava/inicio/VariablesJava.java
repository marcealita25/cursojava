package es.cursojava.inicio;

public class VariablesJava {
	//Variables de instancia
	public static void main(String [] args ) {
		//Variables locales
		
		//Tipos primitivos
		//Números enteros
		byte numeroPequenyo = 17;//-128 a 127
		short numeroMediano = 100;//-32.768 a 32.767
		int numero = 9; //-2^31  a 2^31-1.
		long numeroMuyGrande = 1000;//-2^63 a 2^63-1
		
		//Decimales
		double numeroDecimal = 9.7;
		float numeroDecimal2 = 20.8f;
		
		//Caracteres
		char caracter = '5';
		
		//Booleanos
		boolean esPar = false;
		
		
		
		//Variables de tipo objeto y arrays
		String nombre = "Jose Luis";//Objeto
		//nombre = 2; 
		//numero = "2";
		int [] numeros = {0,1,2,3};//Array
		
		//Declarar variables
		//Tipo --> el tipo de información que almacena
		//nombre --> nombre de la variable
		byte edad;//Declarar una variable
		byte edadProfe = 18;//Declarar e inicializar una variable
		
		//System.out.println(30 + 15 );
		System.out.println(nombre + " " + (edadProfe + 30));
		
	}
	
}










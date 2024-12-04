package es.cursojava.inicio.strings.ejercicios;

public class Ejercicio1 {
	//Escribe un programa que reciba un String y devuelva el texto invertido.
	public static void main(String[] args) {
		String texto = "hola";
		//aloh
		String invertido = "";
		
//		for (int i= texto.length()-1;  i>=0  ;  i--  ){
//			//texto.charAt();
//			System.out.print(texto.charAt(i));
//			//invertido += texto.charAt(i);
//		}
		
		for (int i=0;i<texto.length();i++) {
			invertido = texto.charAt(i)+invertido;
		}
		System.out.println(invertido);

	}

}

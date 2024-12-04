package es.cursojava.inicio.strings.ejercicios;

public class Ejercicio2 {
	public static void main(String[] args) {
		//reconocer
		//reconocer
		String textoOriginal = "reconocer";
		//textoOriginal = textoOriginal.toLowerCase();
		String textoInvertido = "";
		boolean esPalindromo = true;
		
		for (int i=0; i<textoOriginal.length()/2 ; i++ ) {
//			textoOriginal.charAt(i);//e
//			textoOriginal.charAt(textoOriginal.length()-1-i);//r
			
			if (textoOriginal.charAt(i) != textoOriginal.charAt(textoOriginal.length()-1-i) ) {
				System.out.println("No es palindromo");
				esPalindromo = false;
				break;
			}
		}
		
		if(esPalindromo) {
			System.out.println("Es palindromo");
		}
		
//		for (int i= textoOriginal.length()-1;  i>=0  ;  i--  ){
//			textoInvertido += textoOriginal.charAt(i);
//		}
//		
//		if(textoOriginal.equalsIgnoreCase(textoInvertido)) {
//			System.out.println("La palabra "+ textoOriginal + " es un palindromo");
//		}else {
//			System.out.println("La palabra "+ textoOriginal + " NO es un palindromo");
//		}
	}
}

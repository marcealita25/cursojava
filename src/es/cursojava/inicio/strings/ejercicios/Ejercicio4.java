package es.cursojava.inicio.strings.ejercicios;

public class Ejercicio4 {

	public static void main(String[] args) {
		String cadenaTexto = "En un lugar de la Mancha de cuyo nombre no puedo acordarme";
		boolean continua = cadenaTexto.contains(" ");
		String palabraLarga = "";
		
		while (continua) {
			int posicionEspacioBlanco = cadenaTexto.indexOf(" ");
			String palabra = cadenaTexto.substring(0, posicionEspacioBlanco);
			int tamanioPalabra = palabra.length();
			
			if (tamanioPalabra>palabraLarga.length()) {
				palabraLarga = palabra;
			}

			System.out.println(palabra);
			cadenaTexto = cadenaTexto.substring(posicionEspacioBlanco+1);
			if (!cadenaTexto.contains(" ")) {
				System.out.println(cadenaTexto);
				if (cadenaTexto.length()>palabraLarga.length()) {
					palabraLarga = cadenaTexto;
				}
				continua=false;
			}
		}
		System.out.println("\nPalabra más larga: "+palabraLarga);
	}

}

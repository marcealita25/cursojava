package es.cursojava.inicio.strings.ejercicios;

public class ValidarEmail {

	public static void main(String[] args) {
		//asdasd@asd ase.es
		//asdasd@asdasees
		//asdasd@asda@se.es 
		String email = "   asd.asdasda@sfsd.fes  ";
		email = email.trim();
		//email = email.replace(" ", "");
		String error = "";
		
		if(email.contains(" ") || email.contains("\t") ) {
			error += "Hay un error en el email, tiene espacio en blanco.";
		}
		if(!email.contains("@")) {
			error += "El email debe contener una @";
		}
		
		if (email.indexOf("@")!=email.lastIndexOf("@")) {
			error += "El email solo puede contener una @";
		}
		
		if (email.indexOf("@")>email.lastIndexOf(".")) {
			error += "Tiene que haber un punto después de la @";
		}
		
		int contadorArrobas = 0;
		for (int i=0; i<email.length() ; i++) {
			char caracter = email.charAt(i);
			if (caracter=='@') {
				contadorArrobas++;
			}
		}
		
		if(contadorArrobas>1) {
			error += "El email solo puede contener una @";
		}
		
		
		if(error.isBlank()) {
			System.out.println("El email "+ email +" es correcto");
		}else {
			System.out.println("El email "+ email +" es incorrecto por: "+error);
		}
		

	}

}

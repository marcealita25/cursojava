package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

public class EjercicioMenu {

	public static void main(String[] args) {
		int opcion = 0;
		final int OPCION_SALIR = 4;
		do {
			System.out.println("\n1. Pintar Cuadrado");
			System.out.println("2. Validar email");
			System.out.println("3. Añadir Alumno");
			System.out.println("4. Salir");
			
			System.out.println("\nElige una opción");
			Scanner scan = new Scanner(System.in);
			opcion = scan.nextInt();
			
			switch (opcion) {
				case 1: 
					System.out.println("\nIndica tamaño");
					scan = new Scanner(System.in);
					int size = scan.nextInt();
					
					for(int fila=0; fila<size ; fila++) {
						for(int columna=0; columna<size ; columna++) {
							if(fila==0 || fila==size-1 || columna==0 || columna==size-1) {
								System.out.print("* ");
							}else {
								System.out.print("  ");
							}
						}
						System.out.println();
					}
					
					break;
				case 2:
					System.out.println("\nIntroduce tu email:");
					scan = new Scanner(System.in);
					String email = scan.nextLine();
					email = email.toLowerCase().trim();
				
					String error = "";
					System.out.println(email.substring(email.indexOf("@") + 1));

					email.indexOf("sfs");

					if (email.contains(" ") || email.contains("\t")) {
						error += "Tiene espacio en blanco.\n";
					}
					if (email.indexOf("@") != email.lastIndexOf("@")) {
						error += "El email solo puede contener una @\n";
					}

					if (!email.contains("@")) {
						error += "El email debe contener una @\n";
					} else {// Si tienes @
						if (email.indexOf("@") > email.lastIndexOf(".")) {
							error += "Tiene que haber un punto después de la @\n";
						}else {
							String dominio = email.substring(email.indexOf("@")+1);
							if (dominio.indexOf(".") < 2) {
								error += "Tiene que haber una separación de dos o más "
										+ "caracteres entre la @ y el primer punto "
										+ "después de la @\n";
							}
							//asd.asda@s.dasfsd.ekhfykfr
							String subDominio = dominio.substring(dominio.lastIndexOf(".")+1);
							if (subDominio.length()<2 || subDominio.length()>6) {
								error += "Después del último punto  "
										+ "debe haber entre 2 y 6 caracteres\n";
							}
						}
						
					}

					if (error.isBlank()) {
						System.out.println("El email " + email + " es correcto");
					} else {
						System.out.println("El email " + email + " es incorrecto por:\n" + error);
					}
					
					break;
				case 3: System.out.println("Has elegido opción "+opcion+", añadir alumno");break;
				case 4: System.out.println("Adios");break;
				default: System.out.println("Opción incorrecta");
			}
		}while(opcion!=OPCION_SALIR);

	}

}

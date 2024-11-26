package es.cursojava.inicio.condicionales;

public class EjemplosSwitch {

	public static void main(String[] args) {
		
		int nota = 12;
		
		switch(nota) {
			case 0: 
			case 1: 
			case 2: 
			case 3: 
			case 4: System.out.println("Suspenso");break;
			case 5: 
			case 6: System.out.println("Aprobado");
			case 7: 
			case 8: System.out.println("Notable");
			case 9: 
			case 10: System.out.println("Sobresaliente");break;
			default: System.out.println("Nota incorrecta");
		}
		
		//A partir de la version 14
		switch(nota) {
			case 0,1,2,3,4 -> System.out.println("Suspenso");
			case 5, 6 ->  System.out.println("Aprobado"); 
			case 7, 8 -> System.out.println("Notable");
			case 9, 10 -> System.out.println("Sobresaliente");
		default -> System.out.println("Nota incorrecta");
	}

	}

}


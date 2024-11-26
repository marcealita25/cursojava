package es.cursojava.inicio.condicionales.ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		String asignatura;
		String nombreAlumno = "Gonzalo";
		int nota=8;
		
		if(Math.random()>0.5) {
			asignatura ="Matemáticas";
		}else {
			asignatura ="Física";
		}
		
		String notaTexto = "";
		if (nota<0 || nota>10) {
			System.out.println("Nota incorrecta");
		}else {
			
			if (nota>=9) {
				notaTexto = "sobresaliente";
			}else if (nota>=7) {
				notaTexto = "notable";
			}else if (nota>=5) {
				notaTexto = "aprobado";
			}else {
				notaTexto = "suspenso";
			}
			
			
//			switch(nota) {
//				case 0,1,2,3,4 -> notaTexto = "suspenso";
//				case 5, 6 ->  notaTexto = "aprobado";
//				case 7, 8 -> notaTexto = "notable";
//				case 9, 10 -> notaTexto = "sobresaliente";
//			}
			
			System.out.println("El alumno "+ nombreAlumno + 
					" en la asignatura de "+ asignatura + " tiene un "+ notaTexto);
		}
		
		
		
	}

}

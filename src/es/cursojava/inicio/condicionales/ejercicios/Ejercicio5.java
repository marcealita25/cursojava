package es.cursojava.inicio.condicionales.ejercicios;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int edad = 35;
		int aniosExperiencia=6;
		String categoria = "";
		String departamento = "Compras";
		String puesto ="Otro";
		
		if (edad>=15 && edad<18) {
			
			if(aniosExperiencia<1) {
				categoria = "Becario Junior";
			}else {
				categoria = "Becario";
			}
			
		}else if (edad>35) {
			
			if (aniosExperiencia>5) {
				categoria = "Experto";
			}else if (aniosExperiencia>=1 && aniosExperiencia<=5) {
				categoria = "Especialista";
			}else {
				categoria = "Veterano";
			}
		}else if (edad>=18 && edad<=35 ) {
			
			if(aniosExperiencia<1) {
				categoria = "Trainee";
			}else if (aniosExperiencia>=1 && aniosExperiencia<=5) {
				categoria = "Junior";
			}else if (aniosExperiencia>5) {
				categoria = "Senior";
			}
			
			
		}
		
		System.out.println(categoria);
		
		if (departamento.equals("IT") && aniosExperiencia>5) {
			puesto = "Tech Lead";
		}else if(departamento.equals("RRHH") && aniosExperiencia>=1 && aniosExperiencia<=5 ) {
			puesto = "Gestor Personas";
		}else if(departamento.equals("Ventas") && aniosExperiencia<1 ) {
			puesto = "Asistente de Ventas";
		}

		System.out.println(puesto);

	}

}


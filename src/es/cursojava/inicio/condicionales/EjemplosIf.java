package es.cursojava.inicio.condicionales;

public class EjemplosIf {

	public static void main(String[] args) {
		System.out.println("Empieza");
		double nota  = 4;
		
		boolean esSobresaliente = nota>=9;
		if (esSobresaliente) {
			System.out.println("Sobresaliente");
//			if (nota>7) {
//				if (nota>9) {
//					System.out.println("Sobresaliente");
//				}else {
//					System.out.println("Notable");
//				}
//			}else {
//				System.out.println("Aprobado");
//			}
		}else if (nota>=7) {
			System.out.println("Notable");
		}else if (nota>=5) {
			System.out.println("Aprobado");
		}else {
			System.out.println("Suspenso");
		}
		
		System.out.println("Termina");
	}

}

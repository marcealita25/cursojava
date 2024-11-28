package es.cursojava.inicio.bucles;

public class BucleFor {

	public static void main(String[] args) {
		
		for (int i=2 ; i<=10  ;  i+=2  ) {
			System.out.println("5x"+i +"="+(5*i));
		}
		
		for (int i=1 ; i<=10  ;  i++  ) {
			int resultado = 5*i; 
			if(resultado%2==0) {
				System.out.println("5x"+i +"="+resultado);
			}
		}
		
		//Instrucción continue
		
		for (int i =0 ; i<10 ; i++) {
			//System.out.println("Entra "+ i);
			if (i%2!=0) {
				continue;
			}
			//System.out.println("Pasa");
			System.out.println(i);
			
		}
		
		System.out.println("=================");
		//Instrucción break
		for (int i =0 ; i<10 ; i++) {
			//System.out.println("Entra "+ i);
			if (i%2!=0) {
				break;
			}
			//System.out.println("Pasa");
			System.out.println(i);
			
		}
		
		
		System.out.println("Termina");
	}

}

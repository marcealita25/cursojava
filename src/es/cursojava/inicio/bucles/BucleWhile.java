package es.cursojava.inicio.bucles;

public class BucleWhile {

	public static void main(String[] args) {
		int num = 3;
		while(12>num) {
			if(num%3==0) {
				num+=5;
				continue;
			}
			if(num%2==0) {
				num+=2;
			}
			System.out.println("Hola "+num);
			
		}
		
	}

}

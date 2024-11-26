package es.cursojava.inicio;

public class OperadoresAritmeticos {
	public static void main(String[] args) {
		
		int num = 5;
		
		System.out.println(num/2);
		System.out.println(num%2);
		
		//Operador ++ suma 1 a la variable sobre la que se aplica
		
		System.out.println(num++);//5
//		System.out.println(num);
//		num = num + 1;
//		System.out.println(num);
		System.out.println(num);
		System.out.println(++num);//7
		int num2 = 5 + num;//12
		System.out.println("numero = " + num);
		//num = num + num2;
//		System.out.println(num+num2);
//		System.out.println(num);
		System.out.println(num+=num2);
		System.out.println(num);
		
	}
}

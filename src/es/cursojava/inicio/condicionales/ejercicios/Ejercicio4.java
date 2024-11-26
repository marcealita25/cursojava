package es.cursojava.inicio.condicionales.ejercicios;

public class Ejercicio4 {

	public static void main(String[] args) {
		int minutosLlamada = 10; 
		double precioLlamada = 0;
		String dia = "Lunes";
		int hora = 4;
		
		if (minutosLlamada>0) {
			precioLlamada +=1;
			//precioLlamanda++;
			//precioLlamada = precioLlamada + 1;
		}
		if (minutosLlamada>5) {
			precioLlamada +=0.8;
		}
		if (minutosLlamada>8) {
			precioLlamada +=0.7;
		}
		if (minutosLlamada>10) {
			precioLlamada += (minutosLlamada-10)*0.5;
		}
		System.out.println("El precio de la llamada total es "+ precioLlamada);
		
		double impuesto = 0.0;
		if(dia.equalsIgnoreCase("domingo")) {
			System.out.println("Es domingo");
			impuesto = precioLlamada*3/100;
		}else {
			if (hora>=6 && hora<12) {
				impuesto = precioLlamada*15/100;
			}else if(hora>=12 && hora<23) {
				impuesto = precioLlamada*10/100;
			}else {
				impuesto = -precioLlamada*10/100;
			}
		}
		
		System.out.println("Impuesto: "+impuesto);
		System.out.println("Total a pagar por "+ minutosLlamada +" minutos: "+ (precioLlamada+impuesto));
		
		
		
		//Explicacion operador ternario
		//Manera tradicional
		String texto = "";
		if (minutosLlamada==1) {
			texto = "minuto";
		}else {
			texto = "minutos";
		}
		System.out.println(texto);
		//Lo mismo con el operador ternario		
		String textoTernario = (minutosLlamada==1) ? "minuto" : "minutos" ;
		//Con dos condiciones
		String textoTernario2 = (minutosLlamada==1) ? "minuto" : (minutosLlamada==2) ? "minutos" : "minutoss"  ;
		System.out.println(textoTernario);
	}

}

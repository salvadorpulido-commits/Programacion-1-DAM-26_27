package ejercicio07Escondido;

import java.util.Scanner;

public class Ejercicio07Escondido {

	public static void main(String[] args) {
		
		/* Una empresa que gestiona un parque acuático te solicita una aplicación 
		 * que les ayude a calcular el importe que hay que cobrar en la taquilla 
		 * por la compra de una serie de entradas (cuyo número será introducido por el usuario). 
		 * Existen dos tipos de entradas: infantiles, que cuestan 15,50€; 
		 * y de adultos, que cuestan 20€. 
		 * En el caso de que el importe total sea igual o superior a 100€, 
		 * se aplicará automáticamente un bono descuento del 5%.
		 */
		
		// Abrimos Scanner
		
		Scanner sc = new Scanner(System.in);
		
		// Pedimos al usuario el numero de entradas de adulto
		
		System.out.println("Introduce el numero de entradas de adulto: ");
		Integer entradaAdulto = sc.nextInt();
		
		//Pedimos al usuario el numero de entradas infantiles
		
		System.out.println("Introduce el numero de entradas infantiles: ");
		Integer entradaInfantil = sc.nextInt();
		
		// Declaramos variables con los precios
		
		Double precioAdulto = 20.00;
		Double precioInfantil = 15.50;
		
		Double totalEntradas = (entradaAdulto * precioAdulto) + (entradaInfantil * precioInfantil);
		
		if (totalEntradas >= 100.00) {
			
			totalEntradas = (totalEntradas * 0.95);
			
		}	
			
		// Mostramos el total por consola
			
			System.out.println("El total de las entradas es: " + totalEntradas + " euros. ");
			
		
				
		// Cerramos Scanner
		
		sc.close(); 
				

	}

}

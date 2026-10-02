package ejercicio06;

//import java.util.Scanner;

public class Ejercicio06 {

	
	/* Simula el lanzamiento de un dado. Genera mediante Math.random() 
	 * un número entero aleatorio comprendido entre 1 y 6, ambos incluidos. 
	 * Recuerda que será necesario realizar una conversión de tipo (cast).
	 */

	public static void main(String[] args) {

		// Dado como entero, cast para quitar decimales al random
		
		Integer dado = (int) (Math.random() * 6) + 1;
		
		System.out.println("Ha salido el numero: " + dado);
		
	
	}

}

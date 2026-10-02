package ejercicio07;

import java.util.Random;

public class Ejercicio07 {
	
	/* Utiliza la clase Random para generar y mostrar tres valores: 
	 * un número entero aleatorio entre 1 y 100, 
	 * un número real aleatorio 
	 * y un valor booleano aleatorio (true o false).
	 */

	public static void main(String[] args) {
		
		// Creamos el objeto random
		
		Random random = new Random();
				
		// Operamos 
		
		Integer entero = random.nextInt() * 100 +1;
		Double real = random.nextDouble();
		Boolean booleano = random.nextBoolean();
		
		
		//Mostramos por pantalla
		
		System.out.println("El numero entero es: " + entero);
		System.out.println("El numero real es: " + real);
		System.out.println("El valor booleano es: " + booleano);

	}

}

package ejercicio15Parte01;

import java.util.Scanner;

public class Ejercicio15Parte01 {
	
	/*Escribe un programa en el que declares una constante IVA de valor igual a 21. 
	 * A continuación, pídele un precio al usuario (recuerda que los precios contienen decimales) 
	 * y calcula cuál será el precio final con el IVA aplicado.
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Declaramos la constante IVA
		
		final Integer IVA = 21;
		
		// Pedimos un precio al usuario
		System.out.println("Introduce un precio: ");
		Double precio = sc.nextDouble();
		
			
		// Calculamos precio final con IVA añadido
		
		Double precioFinal = precio + precio * IVA / 100;
		
	    // Mostramos el resultado
		System.out.println("El precio con el IVA aplicado es de: " + precioFinal);
				
		sc.close();
		

	}

}

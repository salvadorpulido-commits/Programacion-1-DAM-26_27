package ejercicio01Escondido;

import java.util.Scanner;

public class Ejercicio01Escondido {
	
	/* Realizar un programa que pida como entrada un número con decimales y lo muestre redondeado 
	 * al entero más próximo. (SIN UTILIZAR Math.round())
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número con decimales: ");
		Double numeroDecimales = sc.nextDouble();
		
		// Operamos para truncar el resultado de decimal a entero redondeado
		
		Integer numRedondeado = numeroDecimales >=0 ? (int) (numeroDecimales + 0.5) : (int) ( numeroDecimales - 0.5);
		
		// Mostramos resultado por pantalla
		
		System.out.println("Redondeado al entero más próximo: " + numRedondeado);

		// Cerramos Scanner
		
		sc.close();
	}
}
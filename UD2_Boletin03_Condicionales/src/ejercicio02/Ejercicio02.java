package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {
	
	/* Utiliza un operador ternario para calcular el valor absoluto 
	 * de un número que se solicita al usuario por teclado.
	 */

	
	/*
	 * PRUEBAS MÍNIMAS
	 * Entrada | Esperado | Obtenido
	 * 5       | 5        | 5
	 * -5      | 5        | 5
	 * -5,3    | 5.3      | 5.3
	 * 0       | 0.0      | 0.0
	 * -100    | 100      | 100.0
	 */
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Introduce un numero: ");
		Double num = sc.nextDouble();
		
		// Se opera para convertir el valor en absoluto y resultado con operador ternario
		
		Double absoluto = ( num < 0 ) ? -num : num;
		
		System.out.println("El valor absoluto del numero: " + num + " es: " + absoluto);
		
		sc.close();

	}

}

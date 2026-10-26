package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {
	
	/* Realiza un programa que muestre la tabla de multiplicar de un número 
	 * introducido por teclado. Por ejemplo, si se introduce el número 3 
	 * se debe imprimir lo siguiente:
	 * 	 3 x 1 = 3
     *   3 x 2 = 6
     *   3 x 3 = 9
	 *	 ...
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		Integer numero = sc.nextInt();
		
		// Variable para multiplicar
		
		Integer multiplicador = 1;
		
		// Operamos y mostramos resultado
		
		do {
			
			System.out.println(numero + "x" + multiplicador + " = " + (numero * multiplicador));
			
			multiplicador++;
			
		} while (multiplicador <= 10);
		
		sc.close();
	}

}

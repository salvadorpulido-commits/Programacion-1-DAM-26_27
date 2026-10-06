package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {
	
	/* Escribir una aplicación que indique cuántas cifras tiene un número introducido 
	 * por teclado, que está comprendido entre 0 y 99999. 
	 */

	public static void main(String[] args) {
		
		// Abrimos Scanner
	
		Scanner sc = new Scanner(System.in);
		
		// Pedimos un numero al usuario
		
		System.out.println("Introduce un numero entre 0 y 99999: ");
		Integer num = sc.nextInt();
		
		// Comprobamos que el numero esta en el rango permitido, si no
		// envia mensaje de advertencia
		
		if (num < 0 || num > 99999) {
			
			System.out.println("El numero debe estar entre 0 y 99999");
			
		} else if (num < 10) {
			
			System.out.println("el numero " + num + " tiene 1 cifra.");
			
		} else if (num < 100) {
			
			System.out.println("el numero " + num + " tiene 2 cifras. ");
			
		} else if (num < 1000) {
			
			System.out.println("El numero " + num + " tiene 3 cifras. ");
			
		} else if (num < 10000) {
			
			System.out.println("El numero " + num + " tiene 4 cifras. ");
			
		} else {
			
			System.out.println("el numero " + num + "tiene 5 cifras. ");
		}
		
		// Cerramos Scanner
		
		
		sc.close();

	}

}

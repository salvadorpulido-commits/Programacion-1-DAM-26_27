package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {
	
	/* Implementar un programa que pida por teclado un número decimal 
	 * e indique si es un número casi-cero, que son aquellos, 
	 * positivos o negativos, que se acercan a 0 por menos de 1 unidad, 
	 * aunque curiosamente el 0 no se considera un número casi-cero. 
	 * Es decir, un número casi-cero es el que se encuentra en el intervalo (-1, 1), 
	 * donde se excluye el -1, el 0 y el 1. 
	 */

	public static void main(String[] args) {
		
		// Abrimos Scanner
		
		Scanner sc = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca un numero decimal
		
		System.out.println("Introduce un numero decimal: ");
		Double numDecimal = sc.nextDouble();
		
		// Operamos con condicionales
		
		if ( numDecimal > -1 && numDecimal < 1 && numDecimal != 0) {
			
			System.out.println("El numero " + numDecimal + " es casi 0. ");
		} else {
			
			System.out.println("El numero " + numDecimal + " no es casi 0. ");
		}
		
		// Cerramos Scanner
		
		sc.close();
		
			
	}

}

package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {
	
	/*	Escribe un programa que solicite un número real y muestre su valor absoluto
	 *  y su raíz cuadrada utilizando métodos de la clase Math. 
	 *  Prueba el programa con diferentes valores positivos.
	 */

	public static void main(String[] args) {
		
		//Abrimos Scanner
		
		Scanner sc = new Scanner(System.in);
		
		// Pedimos un numero real al usuario
		
		System.out.println("Introduce un numero real: ");
		Double numero = sc.nextDouble();
		
		// Operamos el valor absoluto
		
		Double absoluto = Math.abs(numero);
		
		// Operamos la raiz cuadrada
		
		Double raiz = Math.sqrt(numero);
		
		// Mostramos resultado por consola
		
		System.out.println("El valor absoluto es: " + absoluto);
		
		System.out.println();
		
		System.out.println("El valor raiz cuadrada es: " + raiz);
			
		
		// Cerramos Scanner
		
		sc.close();

	}
}
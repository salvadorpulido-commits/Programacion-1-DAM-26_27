package ejercicio05Parte01;

import java.util.Scanner;

public class Ejercicio05 {
	
	/* Diseñar una aplicación que calcule la longitud y el área 
	 * de una circunferencia. Para ello, el usuario debe introducir 
	 * el radio, que puede contener decimales. 
	 * Usa Math.PI para tomar el valor de PI. (longitud = 2πr, área=πr2)
	 */

	public static void main(String[] args) {
		
		//Abrimos Scanner para leer lo introducido por teclado
		
		Scanner sc = new Scanner(System.in);
		
		// Variables del radio, longitud y area de la circunferencia
		
		double radio;
		
		double longitud;
		
		double area;
		
		//Introducimos el radio
		
		System.out.println("Introduce el radio de la circunferencia: ");
		
		//Guardamos valores del radio
		
		radio = sc.nextDouble();
		
		// Calculamos la longitud de la circunferencia
		
		longitud = 2*Math.PI*radio;
		
		// Calculamos el area de la circunferencia
		
		area = Math.PI* radio * radio;
		
		//Mostramos resultado por consola
		
		System.out.println("La longitud de la circunferencia es: " + longitud);
		System.out.println("El area de la circunferencia es: " + area);
		
		//Cerramos el scanner
		
		sc.close();
		
		
		
		
		
		
		
		
		


	}

}

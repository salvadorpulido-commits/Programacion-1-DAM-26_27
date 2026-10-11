package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {
	
	/* Diseñar un programa que muestre la suma de los 10 
	 * primeros números impares.
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	final Integer NUM_LECTURAS = 10;
	
	Double suma = 0.0;
	
	for (int i = 1; i<= NUM_LECTURAS; i++) {
	
		System.out.println("Introduce un numero: ");
		suma += sc.nextInt();
		
	}
	
	Double media = suma / NUM_LECTURAS;
	
	System.out.println("la Suma de los 10 primeros impares es: " + media);
	
	sc.close();
	
	}

}
	

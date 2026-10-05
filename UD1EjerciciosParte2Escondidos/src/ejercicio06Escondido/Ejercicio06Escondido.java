package ejercicio06Escondido;

import java.util.Scanner;

public class Ejercicio06Escondido {
	
	/* Solicita al usuario tres distancias:
	 * La primera, medida en milímetros.
	 * La segunda, medida en centímetros.
     * La última, medida en metros.
     * Diseña un programa que muestre la suma de las tres longitudes introducidas (medida en centímetros).
	 */

	public static void main(String[] args) {
		
		// Abrimos Scanner
		
		Scanner sc = new Scanner(System.in);
		
		//Solicitamos la medida en milimetros al usuario
		
		System.out.println("Introduce la medida en milimetros: ");
		Double milimetros = sc.nextDouble();
		
		//Solicitamos la medida en centimetros al usuario
		
		System.out.println("Introduce la medida en centimetros: ");
		Double centimetros = sc.nextDouble();
		
		// Solicitamos la medida en metros
		
		System.out.println("Introduce la medida en metros: ");
		Double metros = sc.nextDouble();
		
		// Operamos las medidass y mostramos el total en centimetros por consola
		
		Double longitudTotalCm = (milimetros / 10.0 ) + centimetros + (metros * 100);
		
		System.out.println("La suma de las longitudes es: " + longitudTotalCm + " centimetros. ");
		
		//cerramos Scanner
		
		sc.close();
		
	}

}


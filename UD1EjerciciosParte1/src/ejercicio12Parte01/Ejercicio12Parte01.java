package ejercicio12Parte01;

import java.util.Scanner;

public class Ejercicio12Parte01 {

	/*
	 * Un frutero necesita calcular los beneficios anuales que obtiene de la venta
	 * de manzanas y peras. Por este motivo, es necesario diseñar una aplicación que
	 * solicite las ventas (en kilos, tanto de las peras como de las manzanas). La
	 * aplicación mostrará el importe total sabiendo que el precio del kilo de
	 * manzanas está fijado en 2,35€ y el kilo de peras en 1,95€.
	 */

	public static void main(String[] args) {

		// Abrimos Scanner
		Scanner sc = new Scanner(System.in);

		// Solicitamos la cantidad de las ventas de Manzanas en kilos
		System.out.println("Introduce los kilos de Manzanas vendidos: ");
		Double kilosManzanas = sc.nextDouble();

		// Operamos y lanzamos resultado
		Double totalManzanas = (kilosManzanas * 2.35);
		System.out.println("El total vendido de Manzanas corresponde a: " + totalManzanas + " €. ");

		System.out.println(); //Salto de linea para mejor visualización en consola
		
		// Solicitamos la cantidad de las ventas de Peras en kilos
		System.out.println("Introduce los kilos de Peras vendidos: ");
		Double kilosPeras = sc.nextDouble();

		// Operamos y lanzamos resultado
		Double totalPeras = (kilosPeras * 1.95);
		System.out.println("El total vendido de Manzanas corresponde a: " + totalPeras + " €. ");

		// Cerramos Scanner
		sc.close();

		
	}

}

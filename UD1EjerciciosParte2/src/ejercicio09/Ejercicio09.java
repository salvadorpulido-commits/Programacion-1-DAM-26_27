package ejercicio09;

import java.util.Scanner;

public class Ejercicio09 {
	
	/* Un depósito contiene una cantidad de litros de agua y se quiere llenar 
	 * botellas de una capacidad determinada. 
	 * Solicita ambos valores y calcula cuántas botellas completas 
	 * pueden llenarse utilizando Math.floor().
	 */

	public static void main(String[] args) {
		
		//Abrimos Scanner
		
		Scanner sc = new Scanner(System.in);
		
		// Pedimos al usuario los litros del desposito
		
		System.out.println("Litros del deposito: ");
		Double litros = sc.nextDouble();
		
		// Pedimos la capacidad de cada botella en litros
		
		System.out.println("Capacidad de cada botella (litros): ");
		Double capacidad = sc.nextDouble();
		
		// Operamos redondeando a la baja con Math.floor,  
		// Casteamos con (int) para pasar el resultado de decimal a entero y guardarlo en un Integer
						
		Integer botellas = (int) Math.floor (litros / capacidad);
		
		// Mostramos resultado por consola
		
		System.out.println("Pueden llenarse " + botellas + " botellas. ");
		
		//Cerramos Scanner
		
		sc.close();

	}

}

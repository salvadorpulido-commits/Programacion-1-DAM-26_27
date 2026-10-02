package ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {
	
	/* Una empresa guarda productos en cajas con una capacidad determinada. 
	 * Pide al usuario el número de productos y la capacidad de cada caja. 
	 * Calcula cuántas cajas son necesarias para guardar todos los productos 
	 * utilizando Math.ceil(). El resultado final debe mostrarse como un número entero.
	 */

	public static void main(String[] args) {
		
		// Abrimos Scanner
		
		Scanner sc = new Scanner(System.in);
		
		//Pedimos al usuario el numero deproductos
		
		System.out.println("Introduce un numero de productos: ");
		Integer producto = sc.nextInt();
		
		//Pedimos al usuario la capacidad de las cajas
		
		System.out.println("Introduce la capacidad de las cajas: ");
		Integer capacidad = sc.nextInt();
		
		// Operamos
		
		Integer cajas = (int) Math.ceil( producto / (double) capacidad);
		
		//Mostramos resultado
		
		System.out.println("Cajas necesarias " + cajas);
		
		//Cerramos Scanner 
		
		sc.close();		

	}

}

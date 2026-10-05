package ejercicio07Parte01;

import java.util.Scanner;

public class Ejercicio07Parte01 {
	
	/*Escribir un programa que le pida al usuario su nombre, dirección y teléfono. 
	 * Guarda cada dato en variables distintas. A continuación, muestra los datos 
	 * de la siguiente forma:
	 * Nombre: Elena
     * Dirección: Calle Inventada
     * Teléfono: 987654321
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Declaramos variables
		
		String nombre;
		String direccion;
		String telefono;
		
		//Pedimos datos 
		
		System.out.println("Introduzca su nombre: ");
		nombre = sc.nextLine();
		
		System.out.println("Introduzca su direccion: ");
		direccion = sc.nextLine();
		
		System.out.println("Introduzca su telefono: ");
		telefono = sc.nextLine();
		
		//Imprimimos en lineas diferentes
		
		System.out.println("nombre introducido " + nombre);
		System.out.println("nombre introducido " + direccion);
		System.out.println("nombre introducido " + telefono);
		
		//Cerramos scanner
		
		sc.close();
		
			
	}

}

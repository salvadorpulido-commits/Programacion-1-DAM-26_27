package ejercicio09Parte01;

import java.util.Scanner;

public class Ejercicio09Parte01 {
	
	/*Realizar una aplicación que solicite al usuario su edad 
	 * y le indique si es mayor de edad 
	 * (mediante un literal booleano: true o false).
	 */

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		
		//Pedimos edad al usuario
		
		System.out.println("Introduce tu edad: ");
		Integer edad = sc.nextInt();
		Boolean mayorEdad = edad >= 18;
		
		//Mostramos por pantalla el resultado
		
		System.out.println("¿Eres mayor de edad?: " + mayorEdad);
		edad = sc.nextInt();
		
		//Cerramos Scanner
		sc.close();
		
		
	}

}

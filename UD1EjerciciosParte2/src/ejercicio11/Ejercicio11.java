package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
	
	/* Diseña un programa que determine si una persona puede alquilar un vehículo. 
	 * Solicita su edad y dos valores booleanos que indiquen si posee permiso de conducir 
	 * y si tiene una sanción que le impida conducir. 
	 * Podrá alquilarlo si es mayor de edad, tiene permiso y no tiene dicha sanción. 
	 * Muestra únicamente el resultado booleano.
	 */
	
	public static void main(String [] args) {
		
		// Abrimos Scanner 
		
		Scanner sc = new Scanner(System.in);
		
		// Pedimos edad al usuario
		
		System.out.println("Introduce tu edad: ");
		Integer edad = sc.nextInt();
		
		// Pedimos al usuario si tiene o no permiso de conducir con booleano
		
		System.out.println("¿Tienes permiso de conducir? (true / false): ");		
		Boolean permiso = sc.nextBoolean();
		
		// Pedimos al usuario si tiene alguna sancion con otro booleano
		
		System.out.println("¿Tienes alguna sancion? (true / false): ");
		Boolean sancion = sc.nextBoolean();
		
		// Obtenemos resultado mediante booleano y mostramos por consola
		
		Boolean alquiler = edad >= 18 && permiso && !sancion;
		
		System.out.println("Puede alquilar: " + alquiler);
		
			
		// Cerramos Scanner
		
		sc.close();
		
	} 

}

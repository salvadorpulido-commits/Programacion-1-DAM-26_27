package ejercicio08Parte01;

import java.util.Scanner;

public class Ejercicio08Parte01 {

	/*
	 * Escribe un programa que pida al usuario su nombre y su edad y muestre por
	 * pantalla un mensaje como el siguiente: “Hola Juanito, tienes 21 años, ¡qué
	 * mayor eres!”.
	 */

	public static void main(String[] args) {

		// Creamos Scanner

		Scanner sc = new Scanner(System.in);
		
			
		//Pedimos nombre al usuario y lo leemos
		
		System.out.print("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		
		//Pedimos la edad al usuario y lo leemos
		
		System.out.print("Introduce tu edad: ");
		Integer edad = sc.nextInt();
		
		//Mostramos mensaje
		
		System.out.println("Hola " + nombre + " tu edad es de " + edad + " años, ¡Que mayor eres!");
		
		//Cerramos Scanner
		
		sc.close();
		
    }

}

package ejercicio05Escondido;

import java.util.Scanner;

public class Ejercicio05Escondido {
	
	/* Diseña una aplicación que solicite al usuario que introduzca una cantidad de segundos. 
	 * La aplicación debe mostrar cuántas horas, minutos y segundos hay en el número de segundos 
	 * introducidos por el usuario.
	 */

	public static void main(String[] args) {
	
		// Abrimos Scanner
		
		Scanner sc = new Scanner(System.in);
		
		//Pedimos al usuario que introduzca los segundos
		
		System.out.println("Introduce los segundos: ");
		Integer segundos = sc.nextInt();
		
		// Declaramos variables y operamos
		
		Integer horas = (segundos / 3600);
		Integer minutos = (segundos / 60) % 60;
		Integer restoSegundos =  segundos % 60;
		
		System.out.println("En " + segundos + " segundos hay " + horas + " horas, " + minutos + " minutos y " + restoSegundos + " segundos");
		
		
		// Cerramos Scanner
		
		sc.close();
	}

}

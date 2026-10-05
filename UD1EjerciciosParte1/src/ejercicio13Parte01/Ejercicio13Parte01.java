package ejercicio13Parte01;

import java.util.Scanner;

public class Ejercicio13Parte01 {
	
	/*Diseñar un algoritmo que nos indique si podemos salir a la calle. 
	 * Existen aspectos que influirán en esta decisión: 
	 * solo podremos salir a la calle si no está lloviendo y hemos finalizado nuestras tareas. 
	 * Existe una opción en la que, indistintamente de lo anterior, podremos salir a la calle:
	 * el hecho de tener que ir a la biblioteca.
	 * Solicitar al usuario (mediante un booleano) si llueve, si ha finalizado las tareas 
	 * y si necesita ir a la biblioteca.
	 * El algoritmo debe mostrar mediante un booleano (true o false) 
	 * si es posible que se le otorgue permiso para salir a la calle.
     */
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//Variables lluvia, tareas y biblioteca
		
		boolean estaLloviendo;
		boolean tareasTerminadas;
		boolean irBiblioteca; 
		
		//Variable si puedo salir
		
		boolean salir;
		
		// Preguntamos al usuario
		
		System.out.println("¿Esta lloviendo?: ");
		estaLloviendo = sc.nextBoolean();
		
		System.out.println("¿Has terminado las tareas?: ");
		tareasTerminadas = sc.nextBoolean();
		
		System.out.println("¿Tienes que ir a la biblioteca?: ");
		irBiblioteca = sc.nextBoolean();
		
		/* si no está lloviendo y hemos finalizado nuestras tareas. indistintamente de
     	 * lo anterior, podremos salir a la calle: el hecho de tener que ir a la 
     	 * biblioteca.
     	*/
		
		salir = (!estaLloviendo && tareasTerminadas) || irBiblioteca;
		
		//Respondemos
		
		System.out.println("¿Puedo salir a la calle? " + salir );
		
		//Cerramos Scanner
		
		sc.close();
		
		
		
	}

}

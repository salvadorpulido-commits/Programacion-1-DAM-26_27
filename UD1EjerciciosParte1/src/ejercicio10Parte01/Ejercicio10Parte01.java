package ejercicio10Parte01;

import java.util.Scanner;

public class Ejercicio10Parte01 {
	
	/*Escribir un programa que pida un número al usuario e indique 
	 * mediante un literal booleano (true o false) si el número es par.
	 */

	public static void main(String[] args) {
		
		//Abrimos scanner para leer del teclado
		
		Scanner sc = new Scanner(System.in);
		
		//Pedimos un numero al usuario
		
		System.out.println("Introduce un numero: ");
		Integer num = sc.nextInt();
		Boolean numPar = num % 2 == 0; 
		
		//Operamos y damos resultado
		
		System.out.println("¿Es el numero par?: " + numPar );
		num = sc.nextInt();
		
		//Cerramos Scanner		
		sc.close();
	}

}

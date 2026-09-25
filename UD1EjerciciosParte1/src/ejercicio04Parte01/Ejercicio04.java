package ejercicio04Parte01;

import java.util.Scanner;

public class Ejercicio04 {
	
	/*Crear una aplicación que calcule la media aritmética 
	 * de dos notas enteras. Hay que tener en cuenta que la 
	 * nota media puede tener decimales.
	 */

	public static void main(String[] args) {
		
		//Abrimos scanner
		
		Scanner sc = new Scanner(System.in);
		
		//Pedimos primera nota al usuario
		
		System.out.println("Introduce la primera nota: ");
		
		// Guardamos la primera nota
		
		int nota1 = sc.nextInt();
		
		// Pedimos la segunda nota
		
		System.out.println("Introduce la segunda nota: ");
		
		// Guardamos la segunda nota
		
		int nota2 = sc.nextInt();
		
		// Calculamos la media de las dos notas, indicando que puede tener decimales
		
		double notaMedia = (nota1 + nota2) / 2.0;
		
		//Imprimimos resultado
		
		System.out.println("Tu nota media es: " + notaMedia);
		
		//Salimos del Scanner
		
		sc.close();
		
		
		
		
		
		
		

	}

}

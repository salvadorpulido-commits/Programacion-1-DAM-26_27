package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {
	
	/* Un centro de investigación de la flora urbana necesita una aplicación que 
	 * muestre cuál es el árbol más alto. Para ello se introducirá por teclado la 
	 * altura (en centímetros) de cada árbol (terminando la introducción de datos 
	 * cuando se utilice -1 como altura). La aplicación debe devolver la altura 
	 * del árbol más alto.
	 * 
	 * 1,20 -> alturaMaxima
	 * 3,8 -> alturaMaxima
	 * 0,5
	 * -1
	 * 
	 */


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la altura del arbol: ");
		Double altura = sc.nextDouble();
		
		Double alturaMaxima = altura;
		
		// Mientras la altura sea distinta a -1, 
		// si la altura es mayor a la maxima guardada, utiliza la maxima
		
		while (altura != -1) {
			if (altura > alturaMaxima) {
				alturaMaxima = altura;
			}	
			
			System.out.println("Introduce la altura del arbol: ");
			altura = sc.nextDouble();
			
		}
		
		//Comprobamos si la altura maxima es distinto de -1 y operamos para 
		//mostrar la maxima introducida
		
		if (alturaMaxima != 0) {
			
			System.out.println("La altura maxima es: " + alturaMaxima);
			
		} else {
			
			System.out.println("No se ha introducido una altura maxima. ");
		}
		
		sc.close();
	}

}

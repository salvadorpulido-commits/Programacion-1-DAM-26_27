package ejercicio14Parte01;

import java.util.Scanner;

public class Ejercicio14Parte01 {
	
	/*Escribir un programa que solicite las notas del primer, segundo y tercer trimestre 
	 *(notas enteras que se solicitarán al usuario). 
	 *El programa debe mostrar la nota media del curso como se utiliza en el boletín de calificaciones 
	 *(solo la parte entera) y como se usa en el expediente académico (con decimales).
	 */

	public static void main(String[] args) {
		
		// Abrimos Scanner
		
		Scanner sc = new Scanner(System.in);
		
		// Pedimos que se introduzca las notas del primer trimestre
		
		System.out.println("Introduce las notas del primer trimestre: ");
		Integer notasPrimer = sc.nextInt();
		
		// Pedimos que se introduzcan las notas del segundo trimestre
		
		System.out.println("Introduce las notas del segundo trimestre: ");
		Integer notasSegun = sc.nextInt();
		
		// Pedimos que se introduzcan las notas del tercer trimestre
		
		System.out.println("Introduce las notas del tercer trimestre: ");
		Integer notasTercer = sc.nextInt();
		
		// Operamos y lanzamos resultado para la nota media entera
		
		Integer notaMedia = ( notasPrimer + notasSegun + notasTercer)  / 3;
		System.out.println("Tu nota media es: " + notaMedia);
		
		//Operamos y lanzamos la nota academica con decimales
		
		Double notaAcadem = ( notasPrimer + notasSegun + notasTercer ) / 3.0;
		System.out.println("Tu nota academica es: " + notaAcadem );
		
		// Cerramos Scanner
		
		sc.close();
		
	}

}

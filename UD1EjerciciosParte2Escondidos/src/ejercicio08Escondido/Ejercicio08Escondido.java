package ejercicio08Escondido;

import java.util.Scanner;

public class Ejercicio08Escondido {

	public static void main(String[] args) {
		
		/* La FILA (Federación Internacional de Lanzamiento de Algoritmo) realiza una competición 
		 * donde cada participante escribe un algoritmo en un papel y lo lanza, ganando quien consiga 
		 * lanzarlo más lejos. La peculiaridad del concurso es que la longitud del lanzamiento 
		 * se mide en metros (con tantos decimales como se desee), pero para el ranking solo 
		 * se tiene en cuenta la longitud en centímetros (sin decimales). 
		 * Por ejemplo, para un lanzamiento de 12,3456 m, que son 1234,56 cm solo se contabilizan 1234 cm.
		 * 
		 * Realiza un programa que solicite la longitud (en metros) de un lanzamiento y muestre la parte entera 
		 * correspondiente en centímetros. Utiliza la conversión de tipos.
		 */

		// Abrimos Scanner
		
		Scanner sc = new Scanner(System.in);
		
		// Pedimos la longitud en metros
		
		System.out.println("Introduce la longitud del lanzamiento en metros: ");
		Double metros = sc.nextDouble();
		
		// Pasamos los metros a centimetros
		
		Double centimetros = metros * 100;
		
		// Casteamos a entero, el (double) pasa el Double a numero simple y el (int) quita los decimales
		
		Integer centimetrosEnteros = (int) (double) centimetros;
		
		// Mostramos el resultado por consola
		
		System.out.println("La longitud a tener en cuenta es: " + centimetrosEnteros + " cm." );
		
		
		// Cerramos scanner
		
		sc.close();
		
	}

}

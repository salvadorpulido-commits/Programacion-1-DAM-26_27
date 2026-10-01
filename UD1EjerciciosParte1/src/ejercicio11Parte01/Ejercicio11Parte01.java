package ejercicio11Parte01;

import java.util.Scanner;

public class Ejercicio11Parte01 {
	
	/*Realiza un conversor de pesetas a euros. Para ello, pídele al usuario 
	 * que te introduzca el valor en pesetas y, a posteriori, debes mostrarle 
	 * el resultado de la conversión.(1€ = 166 ptas).
	 */
	
	public static void main(String[] args) {
		
		//Abrimos Scanner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos una cantidad en Pesetas al usuario y operamos
		
		System.out.println("Introduce un valor en Pesetas: ");
		Integer pesetas = sc.nextInt();
		Double euro = ( pesetas / 166.00 ); 
		
		//Damos el resultado al usuario
		
		System.out.println( pesetas + " pesetas corresponden a " + euro + " euros. ");
		
		//Cerramos Scanner
		sc.close();

	}

}

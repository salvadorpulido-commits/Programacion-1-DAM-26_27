package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
	
	/* Escribe una aplicación que solicite al usuario un número 
	 * comprendido entre 0 y 9999. La aplicación tendrá que indicar 
	 * si el número introducido es capicúa. 
	 * Un número es capicúa si se lee igual de izquierda a derecha que de derecha a izquierda.
	 */


	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero entre 0 y 9999");
		Integer num = sc.nextInt();
		
		if (num < 0 || num > 9999) {
			System.out.println("Error, el numero debe estar entre 0 y 9999");
			
		} else {
			
			int numOriginal = num;
			int numInvertido = 0;
			while (numOriginal > 0) {
				
				//Añadimos el ultimo digito
				numInvertido = numInvertido * 10 + numOriginal % 10;
				
				//Quitamos el ultimo digito
				
				numOriginal = numOriginal / 10;
								
			}
			
			if (num.equals (numInvertido) ) {
				System.out.println(num + " es capicua. ");
				
			} else { 
				
				System.out.println(num + " no es capicua. ");
			}
			
			
		}
		
		
		sc.close();

	}

}

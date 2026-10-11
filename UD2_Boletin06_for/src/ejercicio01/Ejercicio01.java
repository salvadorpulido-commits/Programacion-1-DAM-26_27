package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

	/*
	 * Escribir una aplicación para aprender a contar, que pedirá un número n y
	 * mostrará todos los números del 1 al n.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero:");
		Integer num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {

			System.out.println(i);

		}
		
		sc.close();

	}

}

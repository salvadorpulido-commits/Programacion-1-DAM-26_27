package ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {

	/*
	 * Realiza un programa en java que pida un número entero positivo y nos diga si
	 * es primo o no.
	 */

	public static void main(String[] args) {

		// Abrimos Scanner

		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario un numero entero

		System.out.println("Introduce un numero entero: ");
		Integer n = sc.nextInt();

		Boolean esPrimo = true;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				esPrimo = false;
				break;
			}

		}

		if (n < 2) {
			esPrimo = false;
		}

		if (esPrimo) {

			System.out.println("El numero " + n + " es primo. ");

		} else {

			System.out.println("El numero " + n + " no es primo. ");
		}

		System.out.println(esPrimo);

		sc.close();
	}

}

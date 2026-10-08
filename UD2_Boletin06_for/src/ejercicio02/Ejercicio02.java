package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

	/*
	 * Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número
	 * que introducimos por teclado.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero:");
		Integer num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0) {

				System.out.println(i);
			}

			sc.close();

		}

	}

}

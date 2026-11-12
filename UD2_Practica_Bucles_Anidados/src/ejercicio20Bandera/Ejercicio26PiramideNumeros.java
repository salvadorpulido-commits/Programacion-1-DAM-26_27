package ejercicio20Bandera;

import java.util.Scanner;

public class Ejercicio26PiramideNumeros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce N (entre 1 y 9):");
		Integer N = sc.nextInt();

		for (Integer i = 0; i < N; i++) {

			// Espacios iniciales
			for (Integer j = 0; j < N - 1 - i; j++) {
				System.out.print(" ");
			}

			// Subida: 1, 2, ..., i + 1
			for (Integer j = 1; j <= i + 1; j++) {
				System.out.print(j);
			}

			// Bajada: i, i - 1, ..., 1
			for (Integer j = i; j >= 1; j--) {
				System.out.print(j);
			}

			System.out.println();
		}

		sc.close();
	}
}
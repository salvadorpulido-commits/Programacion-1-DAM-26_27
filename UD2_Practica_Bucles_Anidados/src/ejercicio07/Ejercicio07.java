package ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {

	// 07. Pirámide centrada
	// Dibuja una pirámide de N niveles.
	// Ejemplo de entrada: N = 5
	// Salida esperada:
	//     *
	//    ***
	//   *****
	//  *******
	// *********

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero N: ");
		Integer N = sc.nextInt();

		// Espacios iniciales

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N - 1 - i; j++) {

				System.out.print(" ");

			}

			// Asteriscos: 2 * i + 1

			for (int j = 0; j < 2 * i + 1; j++) {

				System.out.print("*");

			}

			System.out.println();

		}

		sc.close();

	}

}

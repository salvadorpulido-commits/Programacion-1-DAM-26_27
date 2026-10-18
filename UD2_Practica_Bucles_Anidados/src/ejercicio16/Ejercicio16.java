package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

//	16. Figura con dos diagonales
//	Dibuja un cuadrado con # en las dos diagonales y puntos (.) en el resto.
//	Ejemplo de entrada: N = 7
//	Salida esperada:
//	#.....#
//	.#...#.
//	..#.#..
//	...#...
//	..#.#..
//	.#...#.
//	#.....#

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("introduce numero N: ");
		Integer N = sc.nextInt();

		for (int i = 0; i < N; i++) {

			for (int j = 0; j < N; j++) {

				if (i == j || i + j == N - 1) {

					System.out.print("#");

				} else {

					System.out.print(".");

				}

			}

			System.out.println();
		}

		sc.close();
	}

}

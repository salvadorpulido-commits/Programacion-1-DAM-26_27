package ejercicio20Bandera;

import java.util.Scanner;

public class Ejercicio20PiramideHueca {

//		08. Pirámide invertida
//		Ejemplo de entrada: N = 5
//		Salida esperada:
//		*********
//		 *     *
//		  *   *
//		   * *
//		    *

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero N positivo: ");
		Integer N = sc.nextInt();
		


		for (int i = 0; i < N; i++) {

			// Espacios iniciales con i

			for (int j = 0; j < i; j++) {

				System.out.print(" ");

			}

			Integer cantidad = 2 * (N - i) - 1;

			// asteriscos

			for (int j = 0; j < cantidad; j++) {

				// Primera fila, primer caracter o ultimo caracter

				if (i == 0 || j == 0 || j == cantidad - 1) {

					System.out.print("*");

				} else {

					System.out.print(" ");
				}

			}
			// Salto de linea para acabar

			System.out.println();

		}

		sc.close();

	}

}
package ejercicio19Reto;

import java.util.Scanner;

public class Ejercicio19Reto {

	/*
	 * Elige dos figuras y haz que el usuario pueda repetir su ejecución mediante un
	 * menú hasta seleccionar «Salir». Comprueba que las dimensiones introducidas
	 * sean positivas.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Menu");
		Integer opcion;

		do {

			System.out.println("Elije una opcion:");

			System.out.println("1: Hacer rectangulo hueco.");
			System.out.println("2: Hacer piramide centrada.");
			System.out.println("3: Salir");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1: {

				System.out.println("Introduce las filas: ");
				Integer filas = sc.nextInt();

				System.out.println("Introduce las columnas: ");
				Integer columnas = sc.nextInt();

				for (int i = 0; i < filas; i++) {

					for (int j = 0; j < columnas; j++) {

						if (i == 0 || i == filas - 1 || j == 0 || j == columnas - 1) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}

					System.out.println();

				}
				break;
			}

			case 2: {
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
				break;
			}
			case 3:
				System.out.println("Hasta luego! ");
				break;

			default:
				System.out.println("Opcion no valida");

			}

		} while (opcion != 3);

		sc.close();
	}

}

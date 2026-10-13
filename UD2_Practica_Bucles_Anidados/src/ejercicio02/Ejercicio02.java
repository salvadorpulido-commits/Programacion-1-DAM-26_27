package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

	// 02. Rectángulo hueco
	// Dibuja solo el contorno. Las posiciones interiores son espacios.
	// Ejemplo de entrada: 4 filas, 7 columnas
	// Salida esperada:
	// *******
	// *     *
	// *     *
	// *******

	public static void main(String[] args) {

		// Abrimos Scanner

		Scanner sc = new Scanner(System.in);

		// Pedimo al usuario las filas

		System.out.println("Introduce las filas: ");
		Integer filas = sc.nextInt();

		// Pedimos las columnas

		System.out.println("Introduce las columnas ");
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

		// Cerramos Scanner

		sc.close();
	}

}

package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

	// 01. Rectángulo macizo
	// Pide filas y columnas. Dibuja un rectángulo de asteriscos.
	// Ejemplo de entrada: 4 filas, 7 columnas
	// Salida esperada:
	// *******
	// *******
	// *******
	// *******

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce las filas:");
		Integer filas = sc.nextInt();

		System.out.println("Introduce las columnas:");
		Integer columnas = sc.nextInt();

		for (int i = 0; i < filas; i++) {

			for (int j = 0; j < columnas; j++) {
				System.out.print("*");

			}
			
			System.out.println();

		}

		sc.close();

	}

}

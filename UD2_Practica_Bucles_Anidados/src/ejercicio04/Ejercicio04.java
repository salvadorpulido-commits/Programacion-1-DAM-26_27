package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

	// 04. Triángulo rectángulo: ángulo arriba a la izquierda
	// La primera fila tiene N asteriscos y cada fila siguiente uno menos.
	// Ejemplo de entrada: N = 5
	// Salida esperada:
	// *****
	// ****
	// ***
	// **
	// *

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el valor para N: ");
		Integer N = sc.nextInt();

		for (Integer i = 0; i < N; i++) {
			for (Integer j = 0; j < N - i; j++) {

				System.out.print("*");

			}

			System.out.println();
					}

		sc.close();
	}

}

package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {

	// 06. Triángulo rectángulo: ángulo arriba a la derecha
	// La cantidad de asteriscos disminuye mientras aumentan los espacios iniciales.
	// Ejemplo de entrada: N = 5
	// Salida esperada:
	// *****
	//  ****
	//   ***
	//    **
	//     *

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Pedimos un numero N al usuario

		System.out.println("Introduce un numero N: ");
		Integer N = sc.nextInt();

		for (int i = 0; i < N ; i++) {
			for (int j = 0; j < N ; j++) {
				if (j >= i) {
				System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			System.out.println();

		}

		sc.close();
	}

}

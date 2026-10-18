package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

//	13. Rectángulo dividido en dos zonas verticales
//	En la mitad izquierda imprime * y en la derecha #. Para este ejercicio usa 
//	un número par de columnas.
//	Ejemplo de entrada: 4 filas, 8 columnas
//	Salida esperada:
//	****####
//	****####
//	****####
//	****####

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce las filas: ");
		Integer filas = sc.nextInt();

		System.out.println("Introduce las columnas: ");
		Integer columnas = sc.nextInt();

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {

				if (j < columnas /2) {

					System.out.print("*");

				} else {

					System.out.print("#");
				}

			}
			System.out.println();
		}
		sc.close();
	}

}

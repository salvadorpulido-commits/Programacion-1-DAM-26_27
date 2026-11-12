package ejercicio20Bandera;

import java.util.Scanner;

public class Ejercicio23RomboHueco {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer N;
		do {
			System.out.println("Introduce N (positivo):");
			N = sc.nextInt();
		} while (N <= 0);

		// Mitad de arriba (incluye la fila ancha)
		
		for (Integer i = 0; i < N; i++) {
			for (Integer j = 0; j < N - 1 - i; j++) {
				System.out.print(" ");
			}
			Integer cantidad = 2 * i + 1;
			for (Integer j = 0; j < cantidad; j++) {
				
				// Solo los extremos de la fila
				
				if (j == 0 || j == cantidad - 1) {
					
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		// Mitad de abajo (empieza en 1 para no repetir la fila ancha)
		
		for (Integer i = 1; i < N; i++) {
			for (Integer j = 0; j < i; j++) {
				
				System.out.print(" ");
			}
			Integer cantidad = 2 * (N - i) - 1;
			
			for (Integer j = 0; j < cantidad; j++) {
				if (j == 0 || j == cantidad - 1) {
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
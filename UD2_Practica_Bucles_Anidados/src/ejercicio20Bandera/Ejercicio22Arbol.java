package ejercicio20Bandera;

import java.util.Scanner;

public class Ejercicio22Arbol {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer N;
		do {
			System.out.println("Introduce la copa (positivo):");
			N = sc.nextInt();
		} while (N <= 0);

		// Copa: pirámide centrada
		
		for (Integer i = 0; i < N; i++) {
			for (Integer j = 0; j < N - 1 - i; j++) {
				System.out.print(" ");
			}
			for (Integer j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Tronco: 2 filas, con el palo en la columna central
		for (Integer i = 0; i < 2; i++) {
			for (Integer j = 0; j < N - 1; j++) {
				System.out.print(" ");
			}
			System.out.println("|");
		}

		sc.close();
	}
}



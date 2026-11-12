package ejercicio20Bandera;

import java.util.Scanner;

public class Ejercicio25Floyd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer N;
		do {
			System.out.println("Introduce el número de filas (positivo):");
			N = sc.nextInt();
		} while (N <= 0);

		// Contador fuera de los bucles: no se reinicia entre filas
		
		Integer contador = 1;

		for (Integer i = 0; i < N; i++) {
			for (Integer j = 0; j <= i; j++) {
				System.out.print(contador + " ");
				contador++;
			}
			
			System.out.println();
		}

		sc.close();
	}
}
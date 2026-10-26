package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

	/*
	 * Realiza un programa que sume los números desde el 1 hasta un número N que se
	 * introducirá por teclado. Por ejemplo: Si el usuario introduce un 5, el
	 * programa debe devolver la suma de 1+2+3+4+5.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		 System.out.println("Introduce un numero N: ");
		 Integer N = sc.nextInt();

		// Variables para operar

		 Integer contador = 1;
		 Integer suma = 0;

		// Operamos y mostramos resultado

		do {
			suma += contador;
			contador++;

		} while (contador <= N);

		System.out.println("La suma de 1 hasta " + N + " es : " + suma);

		sc.close();

	}

}

// Para hacerlo mas seguro, podemos pedir que se introduzca un numero positivo y
// distinto de 0

		// Scanner sc = new Scanner(System.in);

//		Integer N;
//		do {
//			System.out.print("Introduce un número N (mayor que 0): ");
//			N = sc.nextInt();
//
//			if (N < 1) {
//				System.out.println("Error: el número debe ser mayor que 0.");
//			}
//		} while (N < 1);
//
//		Integer contador = 1; // Número que vamos a sumar en cada vuelta
//		Integer suma = 0; // Acumulador, empieza en 0
//
//		do {
//			suma += contador;
//			contador++;
//		} while (contador <= N);
//
//		System.out.println("La suma de 1 hasta " + N + " es: " + suma);
//
//		sc.close();
//	}
//}

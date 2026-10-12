package ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {

	/*
	 * Realiza un programa que pida dos números enteros A y B. Luego visualiza los
	 * números que hay entre A y B. Si A es menor que B, entonces debe mostrar los
	 * números desde A hasta B. Si B es menor que A, entonces debe mostrar los
	 * números desde B hasta A.
	 */

	public static void main(String[] args) {

		// Abrimos Scanner

		Scanner sc = new Scanner(System.in);

		// Pedimos los numeros enteros al usuario

		System.out.println("Introduce el primer numero entero: ");
		Integer numA = sc.nextInt();

		System.out.println("Introduce el segundo numero entero: ");
		Integer numB = sc.nextInt();

		if (numA < numB) {

			System.out.println("Los numeros entre " + numA + " y " + numB + " son: ");

			for (int i = numA; i <= numB; i++) {

				System.out.println(i);

			}

		} else if (numB < numA) {

			System.out.println("Los numeros entre " + numB + " y " + numA + " son: ");
			for (int i = numB; i <= numA; i++) {

				System.out.println(i);
			}

		}

		sc.close();

	}

}

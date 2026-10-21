package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

	/*
	 * Escribe un programa que vaya pidiendo al usuario números enteros positivos
	 * que debe ir contando. Cuando el usuario no quiera insertar más números,
	 * introducirá un número negativo y el algoritmo, antes de acabar, mostrará la
	 * cantidad de números positivos introducidos por el usuario.
	 */

	public static void main(String[] args) {

		// Abrimos Scanner

		Scanner sc = new Scanner(System.in);

		Integer contador = 0;

		System.out.println("Introduce numeros enteros positivos, para terminar introduce un numero negativo: ");
		Integer numero = sc.nextInt();

		while (numero >= 0) {
			contador++;

			System.out.println("Numero: ");
			numero = sc.nextInt();

		}

		System.out.println("Has introducido " + contador + " numeros positivos. ");

		sc.close();

	}

}

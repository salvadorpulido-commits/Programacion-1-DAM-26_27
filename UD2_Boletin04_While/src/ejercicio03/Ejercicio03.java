package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

	/*
	 * Escribe un programa que vaya pidiendo al usuario números enteros positivos
	 * que debe ir sumando. Cuando el usuario no quiera insertar más números,
	 * introducirá un número negativo y el algoritmo, antes de acabar, mostrará la
	 * media de los números positivos introducidos por el usuario.
	 */

	public static void main(String[] args) {

		// Abrimos Scanner

		Scanner sc = new Scanner(System.in);

		// Variables iniciallizadas a 0

		Integer contador = 0;
		Integer suma = 0;

		// Pedimos numeros al usuario

		System.out.println("Introduce numeros enteros positivos, para terminar introduce un numero negativo: ");
		Integer numero = sc.nextInt();

		while (numero >= 0) {

			// Guardamos y vamos operando los numeros introducidos

			suma += numero;
			contador = contador + 1;

			System.out.println("Numero: ");
			numero = sc.nextInt();

		}

		if (contador > 0) {

			Double media = (double) suma / contador;

			System.out.println("La media de los numeros positivos es: " + media);

		} else {

			System.out.println("Error, no has introducido un numero positivo. ");
		}

		sc.close();

	}

}


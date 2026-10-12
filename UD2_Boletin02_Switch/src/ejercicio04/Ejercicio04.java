package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

	/*
	 * Escribe un algoritmo para sumar dos tiradas de un dado de seis caras que
	 * tiraría el usuario. El algoritmo pregunta al usuario cuánto ha sacado en la
	 * primera tirada y el usuario le dará esa información pero en formato cadena
	 * (“UNO”, “DOS” … “SEIS”).
	 * 
	 * Después el algoritmo volverá a preguntar al usuario cuánto ha sacado en la
	 * segunda tirada y el usuario también dará esa información en formato cadena.
	 * Por último, el algoritmo mostrará por pantalla la suma de las dos tiradas en
	 * formato numérico.
	 */

	public static void main(String[] args) {

		// Abrimos Scanner

		Scanner sc = new Scanner(System.in);

		// Declaramos variables con tiradas inicializadas a 0

		Integer tirada1 = 0;
		Integer tirada2 = 0;
		String resultado1;
		String resultado2;

		// Pedimos al usuario que introduzca el primer resultado

		System.out.println("Introduce el resultado de la primera tirada con letras: ");
		resultado1 = sc.nextLine().toUpperCase();

		switch (resultado1) {

		case "UNO":
			tirada1 = 1;
			break;

		case "DOS":
			tirada1 = 2;
			break;

		case "TRES":
			tirada1 = 3;
			break;

		case "CUATRO":
			tirada1 = 4;
			break;

		case "CINCO":
			tirada1 = 5;
			break;

		case "SEIS":
			tirada1 = 6;
			break;

		default:
			System.out.println("Valor incorrecto en la primera tirada");

		}

		// Pedimos al usuario que introduzca el segundo resultado

		System.out.println("Introduce el resultado de la segunda tirada con letras: ");
		resultado2 = sc.nextLine().toUpperCase();

		switch (resultado2) {

		case "UNO":
			tirada2 = 1;
			break;

		case "DOS":
			tirada2 = 2;
			break;

		case "TRES":
			tirada2 = 3;
			break;

		case "CUATRO":
			tirada2 = 4;
			break;

		case "CINCO":
			tirada2 = 5;
			break;

		case "SEIS":
			tirada2 = 6;
			break;

		default:
			System.out.println("Valor incorrecto en la segunda tirada");

		}

		// Operamos dando resultado en formato numerico, lanzamos aviso en caso de error

		if (tirada1 != 0 && tirada2 != 0) {
			Integer suma = tirada1 + tirada2;
			System.out.println("La suma de las dos tiradas es: " + suma);

		} else {

			System.out.println("Hay una tirada no valida, no se puede calcular el resultado. ");
		}

		// Cerramos Scanner

		sc.close();

	}

}


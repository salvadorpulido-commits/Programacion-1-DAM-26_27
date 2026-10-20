package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

	/*
	 * El DNI consta de un entero de 8 dígitos seguido de una letra que se obtiene a
	 * partir del número de la siguiente forma: letra = número DNI módulo 23
	 * Basándote en esta información, elige la letra a partir de la numeración de la
	 * siguiente tabla:
	 * 
	 * Diseña una aplicación en la que, dado un número de DNI, calcule la letra que
	 * le corresponde. Observa que un número de 8 dígitos está dentro del rango del
	 * tipo int.
	 * 
	 * PRUEBAS MÍNIMAS
	 * Entrada   | Esperado       | Obtenido
	 * 12345678  | Z              | Z
	 * 0         | T              | T
	 * 1         | R              | R
	 * 22        | E              | E
	 * 25875     | T              | T
	 * 99999999  | R              | R
	 * -1        | Valor erróneo  | Valor erróneo
	 * 100000000 | Valor erróneo  | Valor erróneo
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero de DNI (0 a 99999999:)");
		Integer dni = sc.nextInt();

		// hacemos validar lo introducido por teclado si no, lanzamos mensaje de
		// advertencia

		if (dni < 0 || dni > 99999999) {
			System.out.println("Numero no valido, debe estar dentro del rango 0 a 99999999");
		} else {

			// Calculamos el resto para sacar que letra correspondería

			Integer resto = dni % 23;

			// Guardamos la letra en una variable char

			char letra;

			// Seleccionamos la letra segun el resto usando switch y case

			switch (resto) {
			case 0:
				letra = 'T';
				break;
			case 1:
				letra = 'R';
				break;
			case 2:
				letra = 'W';
				break;
			case 3:
				letra = 'A';
				break;
			case 4:
				letra = 'G';
				break;
			case 5:
				letra = 'M';
				break;
			case 6:
				letra = 'Y';
				break;
			case 7:
				letra = 'F';
				break;
			case 8:
				letra = 'P';
				break;
			case 9:
				letra = 'D';
				break;
			case 10:
				letra = 'X';
				break;
			case 11:
				letra = 'B';
				break;
			case 12:
				letra = 'N';
				break;
			case 13:
				letra = 'J';
				break;
			case 14:
				letra = 'Z';
				break;
			case 15:
				letra = 'S';
				break;
			case 16:
				letra = 'Q';
				break;
			case 17:
				letra = 'V';
				break;
			case 18:
				letra = 'H';
				break;
			case 19:
				letra = 'L';
				break;
			case 20:
				letra = 'C';
				break;
			case 21:
				letra = 'K';
				break;
			case 22:
				letra = 'E';
				break;

			// Default ( no deberia ocurrir )

			default:
				letra = '?';

			}

			System.out.println("La letra correspondiente a ese DNI es: " + letra);

		}

		sc.close();

	}

}

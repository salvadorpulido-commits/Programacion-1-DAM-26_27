package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

	/*
	 * Idear un programa que solicite al usuario un número comprendido entre 1 y 7,
	 * correspondiente a un día de la semana. Se debe mostrar el nombre del día de
	 * la semana al que corresponde. Por ejemplo, el número 1 corresponde a “Lunes”
	 * y el 6 a “Sábado”.
	 */

	public static void main(String[] args) {

		// Abrimos Scanner

		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario un numero comprendido entre 1 y 7

		System.out.println("Introduce un numero del 1 al 7: ");
		Integer num = sc.nextInt();
		
		// Operamos y devolvemos valor definido

		switch (num) {

		case 1:
			System.out.println("Lunes.");
			break;
		case 2:
			System.out.println("Martes.");
			break;
		case 3:
			System.out.println("Miercoles.");
			break;
		case 4:
			System.out.println("Juves.");
			break;
		case 5:
			System.out.println("Viernes.");
			break;
		case 6:
			System.out.println("Sabado.");
			break;
		case 7:
			System.out.println("Domingo.");
			break;
			
			// Añadimos default para valores erroneos
			
		default:
			System.out.println("Valor incorrecto, introduce un numero entre 1 y 7. ");

		}

		// Cerramos Scanner
		sc.close();

	}

}

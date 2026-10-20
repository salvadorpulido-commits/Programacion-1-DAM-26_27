package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {

	/*
	 * Pedir al usuario el número de un mes y el año (comprobando si es o no
	 * bisiesto). Debe imprimir por pantalla el número de días que tiene el mes.
	 *
	 *PRUEBAS MÍNIMAS
	 *
	 * Mes | Año   | Esperado       | Obtenido
	 * 1   | 2025  | 31             | 31
	 * 4   | 2025  | 30             | 30
	 * 2   | 2024  | 29             | 29
	 * 2   | 2023  | 28             | 28
	 * 2   | 1900  | 28             | 28
	 * 2   | 2000  | 29             | 29
	 * 12  | 2025  | 31             | 31
	 * 0   | 2025  | Valor erróneo  | Error
	 * 13  | 2025  | Valor erróneo  | Error
	 * 5   | 10000 | Valor erróneo  | Error
	 *
	 */

	public static void main(String[] args) {

		// Abrimos Scanner

		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario los datos

		System.out.println("Introduce un mes en numero (1 a 12): ");
		Integer mes = sc.nextInt();

		System.out.println("Introduce un año (0000 a 9999): ");
		Integer anio = sc.nextInt();

		// Validamos lo introducido para que no haya error

		if (mes < 1 || mes > 12) {

			System.out.println("Error, debes introducir un mes entre 1 y 12. ");

		} else if (anio < 0 || anio > 9999) {

			System.out.println("Error, introduce un año valido entre 0 y 9999. ");

		} else {

			// Comprobamos año bisiesto

			Boolean bisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
			Integer dias;

			// Determinamos los dias segun el mes

			switch (mes) {

			// Mese con 31 dias

			case 1, 3, 5, 7, 8, 10, 12:
				dias = 31;
				break;

			// Meses con 30 dias

			case 4, 6, 9, 11:
				dias = 30;
				break;

			// Mes Febrero
			case 2:
				dias = bisiesto ? 29 : 28;
				break;

			default:
				dias = 0;
				break;
			}

			// MOstramos resultado

			System.out.println("El mes " + mes + " del año " + anio + " tiene " + dias + " dias. ");

		}

		// Cerramos Scanner

		sc.close();

	}

}

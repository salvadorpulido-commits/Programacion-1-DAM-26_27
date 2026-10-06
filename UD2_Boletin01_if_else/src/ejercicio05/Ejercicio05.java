package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

	/*
	 * Pedir los coeficientes de una ecuación de segundo grado y mostrar sus
	 * soluciones reales. Si no existen, habrá que indicarlo. Hay que tener en
	 * cuenta que las soluciones de una ecuación de segundo grado ax2 + bx + c = 0
	 */

	public static void main(String[] args) {

		// Abrimos Scanner

		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario los coeficientes

		System.out.println("Introduce el coeficiente a: ");
		Double a = sc.nextDouble();

		System.out.println("Introduce el coeficiente b: ");
		Double b = sc.nextDouble();

		System.out.println("Introduce el coeficiente c: ");
		Double c = sc.nextDouble();

		// Operamos para obtener los siguientes valores
		// a==0 no es una ecuacion de segundo grado

		if (a == 0) {

			System.out.println("Si a es igual a 0 no es una ecuacionn de segundo grado. ");

		} else {

			// calculamos discriminante

			Double discriminante = b * b - 4 * a * c;

			if (discriminante > 0) {

				// Dos soluciones posibles con raiz + o -

				Double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
				Double x2 = (+b + Math.sqrt(discriminante)) + (2 * a);

				System.out.println("La ecuacion tiene dos soluciones reales: ");
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);

			} else if (discriminante == 0) {

				// una solucion

				Double x = -b / (2 * a);

				System.out.println("La ecuacion tiene una unica solucion real: ");
				System.out.println("x = " + x);

			} else {

				// Discriminante negativo

				System.out.println("La ecuacion no tiene solucion real. ");

			}

		}

		// Cerramos Scanner

		sc.close();

	}

}

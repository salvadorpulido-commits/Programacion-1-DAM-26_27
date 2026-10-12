package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

	/*
	 * Escribe un algoritmo que le pida al usuario dos números. A continuación debe
	 * mostrar el siguiente menú por pantalla: A . SUMAR LOS NÚMEROS B . RESTAR LOS
	 * NÚMEROS C . MULTIPLICAR LOS NÚMEROS D . DIVIDIR LOS NÚMEROS
	 */

	public static void main(String[] args) {

		// Abrimos scanner

		Scanner sc = new Scanner(System.in);
		
		
		// Pedimos al usuario que introduzca dos numeros

		System.out.println("Introduce el primer numero: ");
		Double num1 = sc.nextDouble();

		System.out.println("Introduce el segundo numero: ");
		Double num2 = sc.nextDouble();

		// Mostramos el menu

		System.out.println("A . SUMAR LOS NÚMEROS. ");
		System.out.println("B . RESTAR LOS NÚMEROS. ");
		System.out.println("C . MULTIPLICAR LOS NÚMEROS.");
		System.out.println("D . DIVIDIR LOS NÚMEROS. ");

		// Pedimos que elija una de las opciones

		System.out.println("Selecciona una opcion (A, B, C o D): ");
		
		// Guardamos en la variable Double por si hay decimales

		Double resultado;
		
		// Leemos la opcion elegida
		
		
		String opcion = sc.next().toUpperCase();


		// Operamos segun la opcion elegida

		switch (opcion) {

		case "A":
			resultado = (num1 + num2);
			System.out.println("La suma de " + num1 + " y " + num2 + " es: " + resultado);
			break;

		case "B":
			resultado = (num1 - num2);
			System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resultado);
			break;

		case "C":
			resultado = (num1 * num2);
			System.out.println("La multiplicacion de " + num1 + " y " + num2 + " es: " + resultado);
			break;

		case "D":
			
			if (num2 != 0) {
				resultado = (num1 / num2);
				System.out.println("La division de " + num1 + " y " + num2 + " es: " + resultado);
			
			} else {

				System.out.println("No se puede dividir entre 0. ");
			}

			break;
		default:
			System.out.println("Incorrecto, Introduce A, B , C o D. ");

		}

		// Cerramos Scanner

		sc.close();

	}

}


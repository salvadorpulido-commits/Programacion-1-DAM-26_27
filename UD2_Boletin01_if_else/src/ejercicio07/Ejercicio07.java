package ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {

	/*
	 * Escribir un programa que simule el juego de PIEDRA, PAPEL, TIJERA, pidiendo a
	 * cada jugador que escriba PIEDRA, PAPEL o TIJERA. El juego debe mostrar por
	 * pantalla quién ha ganado el juego tras jugar una partida. Hay que contemplar
	 * el caso de que empaten.
	 */

	public static void main(String[] args) {

		// Abrimos Scanner

		Scanner sc = new Scanner(System.in);

		// Pedimos las jugasdas a cada jugador

		System.out.println("Jugador 1 introduce tu tirada: PIEDRA, PAPEL o TIJERA. ");
		String jugador1 = sc.nextLine().trim().toUpperCase();

		System.out.println("Jugador 2 introduce tu tirada: PIEDRA, PAPEL o TIJERA. ");
		String jugador2 = sc.nextLine().trim().toUpperCase();

		// Comprobamos tiradas validas

		Boolean jugada1Valida = jugador1.equals("PIEDRA") || jugador1.equals("PAPEL") || jugador1.equals("TIJERA");
		Boolean jugada2Valida = jugador2.equals("PIEDRA") || jugador2.equals("PAPEL") || jugador2.equals("TIJERA");

		if (!jugada1Valida || !jugada2Valida) {

			System.out.println("Jugada no valida, debeis ingresar PIEDRA, PAPEL o TIJERAS ");

		} else if (jugador1.equals(jugador2)) {

			// mismo resultado en ambos jugadores, empate

			System.out.println("Empate, los dos habeis elegido " + jugador1);

		} else if ((jugador1.equals("PIEDRA") && jugador2.equals("TIJERA"))

				|| (jugador1.equals("PAPEL") && jugador2.equals("PIEDRA"))

				|| (jugador1.equals("TIJERA") && jugador2.equals("PAPEL"))) {

			// Jugadas en las que gana el jugador 1

			System.out.println("Gana el Jugador 1, " + jugador1 + " gana a " + jugador2);

		} else {
			
			// Si no es empate ni gana el jugador 1, gana el jugador 2
			
			System.out.println("Gana el Jugador 2, " + jugador2 + " gana a " + jugador1);
		}

		
		// Cerramos Scanner
		
		sc.close();
	}

}


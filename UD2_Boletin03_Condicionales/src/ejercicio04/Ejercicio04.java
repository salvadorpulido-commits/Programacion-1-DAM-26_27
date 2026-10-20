package ejercicio04;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio04 {
	
	/*
	 * Realiza el “juego de la suma”, que consiste en que aparezcan dos números aleatorios 
	 * (comprendidos entre 1 y 99) y el usuario tiene que sumarlos. 
	 * La aplicación le pedirá al usuario que introduzca el resultado de la suma. 
	 * La aplicación le indicará si el resultado es correcto o no.
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Random numAleatorio = new Random();
		
		// Variables de los dos numeros aleatorios
		
		Integer num1 = numAleatorio.nextInt(1, 100);
		Integer num2 = numAleatorio.nextInt(1, 100);
		
		// Suma de los dos aleatorios 
		
		Integer sumaAleatorios = num1 + num2;
		
		// Mostramos al usuario los dos numeros aleatorios
		
		System.out.println(num1);
		System.out.println(num2);
		
		//Pedimos la suma de los numeros
		
		System.out.println("Cuanto es la suma de los dos numeros: ");
		Integer sumaUsuario = sc.nextInt();
		
		if (sumaAleatorios == sumaUsuario) {
			
			System.out.println("La suma es correcta. ");
			
		} else {
			
			System.out.println("Incorrecto, vuelve a intentarlo. ");
		}
		
		
		sc.close();
	}

}

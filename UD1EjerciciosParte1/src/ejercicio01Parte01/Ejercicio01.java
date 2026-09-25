package ejercicio01Parte01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		/* Diseña un programa que pida un número al usuario
		 *  y a continuación lo muestre.
		 */
		
		//Creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//Asignamos variable
		int number; 
		
		//Pedimos un numero al usuario
		System.out.println("Introduce un numero: ");
		number = sc.nextInt();
		
		//Mostramos el numero
		System.out.println("El numero introducido es: " + number);
		
		//cerramos scanner
		sc.close();
		
		
	}

}

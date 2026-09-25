package ejercicio03Parte01;

import java.util.Scanner;

public class Ejercicio03 {
	
	/*Escribir una aplicación que pida el año actual y 
	 *el año de nacimiento del usuario. 
	 *Debe calcular su edad.
	 *
	 */

	public static void main(String[] args) {
		
		//Abrimos Scanner para leer datos por teclado
		
		Scanner sc = new Scanner(System.in);
		
		// Pedimos año actual al usuario
		
		System.out.println("Introduce el año actual: ");
		
		// Guardamos el año actual introducido por el usuario
		
		int actual = sc.nextInt();
		
		// Pedimos al usuario su año de nacimiento
		
		System.out.println("Introduce tu año de nacimiento: ");
		
		// Guardamos el año de nacimiento introducido por el usuario
		
		int nacimiento = sc.nextInt();
		
		// Calculamos la edad restando el año de nacimiento al año actual
		
		int edad = actual - nacimiento;
		
		//Resultado que se muestra por consola 
		
		System.out.println("Tienes " + edad + " años ");
		
		//cerramos Scanner
		
		sc.close();
		
				
	}

}

package ejercicio06Parte01;

import java.util.Scanner;

public class Ejercicio06 {
	
		/*Escribir un programa que le pida dos números al usuario. 
		 * A continuación, debe mostrar la suma, la resta, 
		 * la multiplicación y la división de ambos números. 
		 * Debe mostrarse el resultado de cada operación en una 
	 	 * línea distinta.
	 	 */

	public static void main(String[] args) {
		
		//Abrimos scanner para leer los datos introducidos
		
		Scanner sc = new Scanner(System.in);
		
		
		//Declaremos variables de ambos valores
		
		double num1;
		double num2;
		
		//Pedimos al usuario que introduzca ekl primer numero
		
		System.out.println("Introduzca el primer numero: ");
		
		//Guardamos el valor del primer numero 
		
		num1 = sc.nextDouble();
		
		//Pedimos al usuario que introduzca el segundo numero
		
		System.out.println("Introduzca el segundo numero: ");	
		
		//Guardamos el segundo numero
		
		num2 = sc.nextDouble();
		
		//Realizamos operaciones cada una en una linea distinta
		
		System.out.println("Suma: " + (num1 + num2));
		
		System.out.println("Resta: " + (num1 - num2));
		
		System.out.println("Multiplicación: " + (num1 * num2));
		
		System.out.println("Division: " + (num1 / num2));
		
		//Cerramos scanner
		
		sc.close();
		
		
		
	

	}

}

package ejercicio02Parte01;

import java.util.Scanner;

public class Ejercicio02 {
	
	// Pedir al usuario su edad y mostrar la edad que tendrá el próximo año.

	public static void main(String[] args) {
		
		//Creamos scanner para leer los datos del usuario
		Scanner sc = new Scanner(System.in);
				
		
		//Pedimos la edad al usuario
		
		System.out.println("Introduzca su edad: ");
		int edadActual = sc.nextInt();
		
		//calcular la edad del proximo año
		
		int edadProximoAño = edadActual + 1;
		
		//Mostrar el resultado
		
		System.out.println("El proximo año tendras " + edadProximoAño + " años.");	
		
		//Cerramos scanner
		
		sc.close();
		
	}

}

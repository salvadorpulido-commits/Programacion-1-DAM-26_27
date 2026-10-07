package ejercicio10Escondido;

import java.util.Scanner;

public class Ejercicio10Escondido {
	
	/*(Acepta el reto) El cinquecento es un periodo del arte europeo (principalmente italiano) 
	 * enclavado en pleno Renacimiento. Aunque su nombre esconde el número cinco, en realidad 
	 * ¡pertenece al siglo XVI! Cinquecento es, abreviadamente, "años [mil] quinientos", 
	 * en italiano, y es que el siglo XVI comprendió los años desde el 1501 al 1600, 
	 * igual que el siglo XXI empezó en el 2001, con un 20 en sus dos primeros dígitos y no un 21.
	 * 
	 * Dado un año, ¿de qué siglo es?
	 */

	public static void main(String[] args) {
		
		// Abrimos Scanner
		
		Scanner sc = new Scanner(System.in);
		
		// Pedimos un año al usuario
		
		System.out.println("Introduce un año: ");
		Integer anio = sc.nextInt();
		
		// operamos para resolver el siglo 
		
		Integer siglo = (anio-1)/100+1;
		
		//Devolvemos valor por consola
		
		System.out.println("El siglo es: " + siglo);
		
		// Cerramos Scanner
		
		sc.close();
		

	}

}

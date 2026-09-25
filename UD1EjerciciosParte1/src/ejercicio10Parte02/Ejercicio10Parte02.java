package ejercicio10Parte02;

import java.util.Scanner;

/*Solicita al usuario un año. Calcula mediante una expresión booleana 
 * si el año es bisiesto. Muestra el resultado como true o false.
 */

public class Ejercicio10Parte02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Pedir los datos al usuario
        
        System.out.print("Introduce un año: ");
        int anio = sc.nextInt();
		
		Boolean b = anio%400==0 || (anio%4==0 && anio%100!=0);
		System.out.println("El año "+anio + " -->"+b);
		
		sc.close();
		
	}
}

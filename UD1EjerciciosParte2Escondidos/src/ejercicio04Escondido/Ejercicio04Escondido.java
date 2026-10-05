package ejercicio04Escondido;

import java.util.Scanner;

public class Ejercicio04Escondido {
	
	/* Dado el siguiente polinomio de segundo grado:
	 *	y=ax2+bx+c
     * Crea un programa que pida los coeficientes a, b y c, 
     * así como el valor de x, y calcula el valor correspondiente de y.
	 */

	public static void main(String[] args) {
	
		// Abrimos Scanner
		
		Scanner sc =  new Scanner(System.in);
		
		// Pedimos los coeficientes y declaramos variables
		
		System.out.println("Introduce el valor de a: ");
		Double a = sc.nextDouble(); 
		
		System.out.println("Introduce el valor de b: ");
		Double b = sc.nextDouble();
		
		System.out.println("Introduce el valor de c: ");
		Double c = sc.nextDouble();
		
		System.out.println("Introduce el valor de x: ");
		Double x = sc.nextDouble();
		
		// Operamos el valor de y segun la ecuacion
		
		Double y = a * (x * x) + b * x + c;
		
		// Mostramos el resultado por consola
		
		System.out.println("El valor de y para x = " + x + " es: " + y );
				
						
		// Cerramos Scanner
		
		sc.close();
				
	}

}

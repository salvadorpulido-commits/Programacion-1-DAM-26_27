package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {
	
	/* Escribe un algoritmo que pida al usuario 10 números enteros 
	 * (pueden ser positivos, negativos o cero). 
	 * Cuando acabe de insertar los números, el algoritmo debe mostrar 
	 * la suma de los números positivos, la media de los números negativos 
	 * y el número de ceros que ha introducido el usuario.
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer sumaPositivos = 0;
		Integer sumaNegativos = 0;
		Integer numNegativos = 0;
		Integer contadorCeros = 0;
		Integer contador = 0;
		Integer numero = 0;
		System.out.println("Introduce 10 numeros enteros (pueden ser positivos, negativos o cero): ");
		
		
		while ( contador < 10 ) {
			 System.out.println("Numero " + (contador + 1) + ":");
			 numero = sc.nextInt();
			 
			 
		if (numero > 0) {
			sumaPositivos += numero;
			
		} else if ( numero == 0) {
			sumaNegativos +=  numero;
			numNegativos++;
						
		} else {
			
			contadorCeros++;
			
		}
		
		contador ++;
		
			 
		}
		
		
		
		
		
		
		
		sc.close();
	}

}

package ejercicio05;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {
	
	/* Realiza un programa donde el usuario "piensa" un número del 1 al 100 
	 * y el ordenador intenta adivinarlo. Es decir, el ordenador irá proponiendo 
	 * números una y otra vez hasta adivinarlo (el usuario deberá indicarle al 
	 * ordenador si es mayor, menor o igual al número que ha pensado).
	 * 
	 * Número pensado: 38
	 * numeroAleatorio(1, 100) = 83
	 * Escribir menor – LÍMITE MÁXIMO
	 * numeroAleatorio(1,82) = 15
	 * Escribir mayor - LÍMITE MÍNIMO
	 * umeroAleaotorio(16, 82) = 30
	 * Escribir mayor - LÍMITE MÍNIMO
	 * numeroAleatorio(31, 82) = 70
	 * Escribir menor - LÍMITE MÁXIMO
	 * numeroAleatorio(31, 69) = 50
	 * Escribir menor
	 * numeroAleatorio(31, 49) = 38
	 * Escribir iguales
	 * Imprimir “HAS ACERTADO”
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		Integer minimo = 1;
		Integer maximo = 100;
		Integer numPropuesto;
		String numRespuesta;
		
		System.out.println("Piensa un numero del 1 al 100");
		
		do {
			
			// Operamos aleatorio entre minimo y maximo con + 1 para incluir al 100
			
			numPropuesto = minimo + random.nextInt( maximo - minimo + 1);
			
			System.out.println("El numero escogido es: " + numPropuesto + " ?");
			System.out.println("Dime si es mayor, menor o igual: ");
			numRespuesta = sc.nextLine().trim().toLowerCase();
			
			
			if (numRespuesta.equals("menor")) {
				maximo = numPropuesto -1;
				
			} else if (numRespuesta.equals("mayor")) {
				minimo = numPropuesto +1;
				
			} else if (!numRespuesta.equals("igual")) {
				System.out.println("Respuesta no valida,");
				
			}
			
			
		} while (!numRespuesta.equals("igual"));
		
		System.out.println("Enhorabuena, has acertado!! ");
		
		sc.close();

	}

}


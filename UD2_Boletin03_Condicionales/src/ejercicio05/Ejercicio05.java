package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {
	
	/* Determinar el precio de un billete de tren, conociendo la distancia a recorrer, 
	 * y sabiendo que si el número de días de estancia es superior a 7 
	 * y la distancia superior a 800 km el billete tiene una reducción del 30%. 
	 * El precio por kilómetro es de 2,5€. 
	 * La distancia a recorrer y el número de días de estancia los debes solicitar 
	 * al usuario por teclado.
	 * 
	 * PRUEBAS
	 * 
	 * Distancia	Días	Esperado	    Por qué
	 * 
	 * 1000	     |   10	 |  1750,00 €	  | cumple ambas condiciones
	 * 1000	     |    7	 |  2500,00 €	  | 7 días no es superior a 7
	 * 800	     |   10	 |  2000,00 €     | 800 km no es superior a 800
	 * 801	     |    8	 |  1401,75 €	  | justo por encima de ambos límites
	 * 500	     |   10	 |  1250,00 €	  | falla la distancia
	 * 1000	     |    3	 |  2500,00 €	  | falla la estancia
	 * 0	     |    5	 |  Valor erróneo | distancia no válida
	 * 100	     |   -2	 |  Valor erróneo | días no válidos
	 * 
	 */


	public static void main(String[] args) {
	
		// Abrimos Scanner
		
		Scanner sc = new Scanner(System.in);
		
		//Pedimos valorea al usuario
		
		System.out.println("Introduce la distancia a recorrer en Km: ");
		Double distancia = sc.nextDouble();
		
		System.out.println("Introduce los dias de estancia: ");
		Integer dias = sc.nextInt();
		
		// Validamos que los valores sean positivos
		
		if (distancia <= 0 || dias <= 0) {
			
			System.out.println("Error, la distancia y los dias deben ser mayor que 0");
			
			} else {
				
				// Precio por Km
				
				Double precioBase = distancia * 2.5;
				
				// Guardamos precio final 
				
				Double precioFinal = precioBase;
				
				//Aplicamos el descuento si la estancia es mayor a 7 dias y mas de 800 km
				
				if (dias > 7 && distancia > 800) {
					
					precioFinal = precioBase * 0.7; // 30% descuento
					
				}
				
				// Devolvemos resultado
				
				System.out.println("El precio del billete es de: " + precioFinal + "€");
				
			}
		//Cerramos Scanner
		
		sc.close();
	}

}

package ejercicio01;

public class Ejercicio01 {
	
	/* Realiza un programa que muestre por pantalla los 20 primeros números 
	 * naturales (1, 2, 3... 20).
	 */

	public static void main(String[] args) {
		
		// Declaramos la variable numero comenzando en 1
		
		Integer numero = 1;
		
		//Hacemos que vaya incrementando en uno mientras que sea 20
		
		do {
			
			System.out.println(numero);
			
			numero++;
			
		} while (numero <= 20 );

	}

}

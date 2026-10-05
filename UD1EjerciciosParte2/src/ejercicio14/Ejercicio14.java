package ejercicio14;


public class Ejercicio14 {
	
	/* Un videojuego comienza con 100 puntos y 3 vidas. 
	 * Modifica estas variables utilizando los operadores +=, -=, ++ y -- para representar esta secuencia: 
	 * gana 50 puntos, pierde 20 puntos, obtiene una vida extra y después pierde una vida. 
	 * Muestra el estado final.
	 */

	public static void main(String[] args) {
		
		
		// Inicio del juego con estos valores
		
		Integer puntos = 100;
		Integer vidas = 3;
		
		// Gana 50 puntos
		
		puntos += 50;
		
		//Pierde 20 puntos
		
		puntos -= 20;
		
		// Suma una vida extra 
		
		vidas++;
		
		// Pierde una vida
		
		vidas--;
		
		// Mostramos el estado final de puntos y vidas
		
		System.out.println("Tienes " + puntos + " puntos. ");
		System.out.println("Tienes " + vidas + " vidas. ");
		

	}

}

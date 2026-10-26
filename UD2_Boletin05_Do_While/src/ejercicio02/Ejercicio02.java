package ejercicio02;

public class Ejercicio02 {
	
	/* Realiza un programa que muestre los números pares comprendidos 
	 * entre el 1 y el 200.
	 */


	public static void main(String[] args) {
		
		// Declaramos la variable inicializada para empezar desde 2 que es par
		
		Integer numero = 2;
		
		
		// Mostramos los numeros sumados de dos en dos hasta 200
		
		do {
			System.out.println(numero);
			numero += 2; 
			
		} while (numero <= 200);
		
		
	}

}

// Otra forma de hacerla con modulo de 2

//	Integer numero = 1;
//	
//	do {
//	    if (numero % 2 == 0) { // Solo imprimimos si el resto de dividir entre 2 es 0
//	        System.out.println(numero);
//	    }
//	    numero++;
//	} while (numero <= 200);
//	
//	
//	}
//}

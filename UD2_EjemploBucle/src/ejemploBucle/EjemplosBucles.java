package ejemploBucle;

public class EjemplosBucles {

	public static void main(String[] args) {
		
		int i = 1;
		
		// El bucle se ejecutará mientras i sea menor o igual a 5
		while (i <= 5) {
			System.out.println("Hola " + i);
			i++; // Incrementa i en 1 en cada iteración para evitar un bucle infinito
		}
		
	}

}


package ejercicio15;


import java.util.Scanner;

public class Ejercicio15 {
	
	//	15. Figura con diagonal principal
	//	Dibuja un cuadrado de N×N en el que la diagonal principal sea # y el resto *.
	//	Ejemplo de entrada: N = 5
	//	Salida esperada:
	//	#****
	//	*#***
	//	**#**
	//	***#*
	//	****#

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce N:");
		Integer N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i==j) {
					System.out.print("#");
				} else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		
		sc.close();
	}
	
}

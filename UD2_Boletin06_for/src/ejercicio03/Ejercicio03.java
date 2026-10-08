package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Double media = 0.0;
		
		for ( int i = 1; i <= 10; i++) {
			Integer num = sc.nextInt();
			media += num;
		}
		
		media/= 10;
		
		System.out.println(" Media");
		
		sc.close();

	}

}

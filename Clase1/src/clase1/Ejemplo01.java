package clase1;

import java.util.Scanner;

public class Ejemplo01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame una edad: ");
		
		Integer x = sc.nextInt();
		
		System.out.println("La edad es: " +x);
		
		int edad = 0;
		
		if (edad >= 18) {
			
			System.out.println("Eres mayor de edad ");
			
		} else {
			
			System.out.println("Eres menor de edad ");
		}
		sc.close();
	}

}

package ejercicio19Reto;

import java.util.Scanner;

public class Ejercicio19Reto {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Menu");
		Integer opcion;
		
		do {
		
		
		System.out.println("Elije una opcion:");
		
		System.out.println("1: Hacer suma:");
		System.out.println("2: Hacer producto: ");
		System.out.println("3: Salir");
		opcion = sc.nextInt();
		
		Integer a;
		Integer b;
		
		switch (opcion ) {
		case 1:	
		System.out.println("Introduce numero a: ");
		a = sc.nextInt();
		
		
		System.out.println("Introduce un numero b:");
		b = sc.nextInt();
		
			System.out.println("La suma es: " + (a + b));
			break;
		case 2: 
			System.out.println("Introduce numero a: ");
			a = sc.nextInt();
			
			
			System.out.println("Introduce un numero b:");
			b = sc.nextInt();
			
			System.out.println("El producto es: " + (a*b));
			break;
			
			default: 
				System.out.println("Opcion no valida");
		
		}
		
		} while (opcion!= 03);
			
		sc.close();
	}

}
	


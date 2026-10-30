package Test;

import java.util.ArrayList;
import java.util.List;

import ejercicios.Ejercicios02;
import utiles.Utiles02;

public class test02 {
	
	public static void main(String[] args) {
		
        // Ejercicio 1 Test
		
		System.out.println("\n--- TAQUILLA DEL CINE ---");
		System.out.println("precioEntrada(10, SABADO, true)= " + Ejercicios02.precioEntrada(10, "SABADO", true));
		System.out.println("precioEntrada(35, LUNES, false)= " + Ejercicios02.precioEntrada(35, "LUNES", false));
		System.out.println("precioEntrada(66, VIERNES, true)= " + Ejercicios02.precioEntrada(66, "VIERNES", true));
		System.out.println("precioEntrada(-1, LUNES, false)= " + Ejercicios02.precioEntrada(-1, "LUNES", false));
		
		//Ejercicio 2 Test
		
		System.out.println("\n--- DIBUJAR Z ---");
		System.out.println("");
		
	}

}

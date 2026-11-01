package test;

import java.util.ArrayList;
import java.util.List;

import ejercicios.Ejercicios;
import utiles.Utiles;

public class TestEjercicios {
	
	public static void main(String[] args) {
		
        // Ejercicio 1 Test
		
		System.out.println("\n--- TAQUILLA DEL CINE ---");
		System.out.println("precioEntrada(10, SABADO, true)= " + Ejercicios.precioEntrada(10, "SABADO", true));
		System.out.println("precioEntrada(35, LUNES, false)= " + Ejercicios.precioEntrada(35, "LUNES", false));
		System.out.println("precioEntrada(66, VIERNES, true)= " + Ejercicios.precioEntrada(66, "VIERNES", true));
		System.out.println("precioEntrada(-1, LUNES, false)= " + Ejercicios.precioEntrada(-1, "LUNES", false));
		
		//Ejercicio 2 Test
		
		System.out.println("\n--- DIBUJAR Z ---");
		System.out.println("");
		
	}

}

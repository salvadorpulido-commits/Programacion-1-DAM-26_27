package test;

import java.util.List;

import ejercicios.Ejercicios;

public class TestEjercicios {
	
	public static void main(String[] args) {
		
        // Ejercicio 1 Test
		
		System.out.println("\n--- TAQUILLA DEL CINE ---");
		System.out.println("precioEntrada(10, SABADO, true)= " + Ejercicios.precioEntrada(10, "SABADO", true));
		System.out.println("precioEntrada(35, LUNES, false)= " + Ejercicios.precioEntrada(35, "LUNES", false));
		System.out.println("precioEntrada(66, VIERNES, true)= " + Ejercicios.precioEntrada(66, "VIERNES", true));
		System.out.println("precioEntrada(65, LUNES, false)= " + Ejercicios.precioEntrada(65, "LUNES", false));
		System.out.println("precioEntrada(12, LUNES, false)= " + Ejercicios.precioEntrada(12, "LUNES", false));
		System.out.println("precioEntrada(-1, LUNES, false)= " + Ejercicios.precioEntrada(-1, "LUNES", false));
		
		//Ejercicio 2 Test
		
		System.out.println("\n--- DIBUJAR Z ---");
		System.out.println("lado 5"); Ejercicios.dibujarZ(5); // Esperado: dibujo de Z
		System.out.println("lado 1"); Ejercicios.dibujarZ(1); // Esperado: dibujo de un unico *
		System.out.println("lado 0"); Ejercicios.dibujarZ(0); // Esperado: nada.
		System.out.println("lado 6"); Ejercicios.dibujarZ(6); // Esperado: dibujo de Z de mayor tamaño
		System.out.println("lado 4"); Ejercicios.dibujarZ(4); // Esperado: dibujo de Z
		
		// Ejercicio 3 Test
		System.out.println("\n--- SUMA ESPECIALES ---");
		System.out.println("(1, 10, 3)= " + Ejercicios.sumaPrimerosEspeciales(1, 10, 3));  // esperado 10
		System.out.println("(1, 10, 5)= " + Ejercicios.sumaPrimerosEspeciales(1, 10, 5));  // esperado 23
		System.out.println("(8, 15, 2)= " + Ejercicios.sumaPrimerosEspeciales(8, 15, 2));  // esperado 24
		
		// Ejercicio 4 Test
		
		System.out.println("\n--- FACTORIAL CON SALTOS ---");
		System.out.println("(7,2)= " + Ejercicios.factorialConSaltos(7, 2)); // Esperado 105
		System.out.println("(8,3)= " + Ejercicios.factorialConSaltos(8, 3)); // Esperado 80
		System.out.println("(5,1)= " + Ejercicios.factorialConSaltos(5, 1)); // Esperado 120
		System.out.println("(0,2)= " + Ejercicios.factorialConSaltos(0, 2)); // Esperado 1
	
		// Ejercicio 5 test
		
		System.out.println("\n--- DETECTAR PICOS DE RUTA ---");
		System.out.println("(1, 2, 3, 4, 5), 1)= " + Ejercicios.contarPicos(List.of(1, 2, 3, 4, 5), 1)); // Esperado: 0
		System.out.println("(1, 5, 4, 2), 2)= " + Ejercicios.contarPicos(List.of(1, 5, 4, 2), 2)); // Esperado: 0
		System.out.println("(1, 5, 3), 2)= " + Ejercicios.contarPicos(List.of(1, 5, 3), 2)); // Esperado: 1
		
		// Ejercicio 6 Test
		
		System.out.println("\n--- BUSCAR POR SUMA DE CIFRAS ---");
		System.out.println("(7, 16, 25), 7)= " + Ejercicios.primeraPosicionSumaCifras(List.of(7, 16, 25), 7)); // esperado 0
		System.out.println("(11, 20, 5), 8)= " + Ejercicios.primeraPosicionSumaCifras(List.of(11, 20, 5), 8)); // esperado -1
		System.out.println("(), 5)= " + Ejercicios.primeraPosicionSumaCifras(List.of(), 5)); // esperado -1
	}

}

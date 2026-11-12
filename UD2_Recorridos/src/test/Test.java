package test;

import java.util.List;



import ejercicios.Ejercicio01;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("---------Test de Contadores---------");
				
		System.out.println(Ejercicio01.cuentaParesDeLos20PrimerosNumeros());
		System.out.println(Ejercicio01.cuentaParesHasta(20));
		System.out.println(Ejercicio01.cuentaParesEntre(1, 20));
		
		// Contar en Listas	
		
		System.out.println(Ejercicio01.cuentaParesEn(List.of(5, 7, 3, 8, 7)));
		System.out.println(Ejercicio01.cuentaPrimosEn(List.of(5, 7, 3, 8, 7)));
		
		System.out.println("---------Test de Sumas---------");
		
		System.out.println(Ejercicio01.sumaListaDeReales(List.of(5.3, 7.1, 3.4)));
		System.out.println(Ejercicio01.sumaMayoresIgualesA(List.of(5.3, 7.1, 3.4), 5.0));
		
		System.out.println(Ejercicio01.todosPrimos(List.of(5, 7, 3, 13, 19)));
		
		System.out.println(Ejercicio01.esCreciente(List.of(1, 2, 3, 4, 5)));
		System.out.println(Ejercicio01.esCreciente(List.of(1, 2, 4, 3, 5)));
		
		System.out.println(Ejercicio01.seleccionaPrimos(List.of(4, 7, 10, 3, -1, 2)));
	
		System.out.println("--------Maximos y Minimos-------");
		
		System.out.println(Ejercicio01.Maximo(List.of(7, 8, 3, 2)));
		
		
		System.out.println("--- FIBONACCI ---");

        // Posiciones de la sucesión: 0  1  2  3  4  5  6   7
        // Valores:                   0  1  1  2  3  5  8  13
        System.out.println("fibonacci(0)= " + Ejercicio01.fibonacci(0));    // esperado 0
        System.out.println("fibonacci(1)= " + Ejercicio01.fibonacci(1));    // esperado 1
        System.out.println("fibonacci(2)= " + Ejercicio01.fibonacci(2));    // esperado 1
        System.out.println("fibonacci(4)= " + Ejercicio01.fibonacci(4));    // esperado 3
        System.out.println("fibonacci(7)= " + Ejercicio01.fibonacci(7));    // esperado 13
        System.out.println("fibonacci(10)= " + Ejercicio01.fibonacci(10));  // esperado 55
        System.out.println();
        //suma pares desde el inicio hasta n
        
        System.out.println("--- FIBONACCI suma pares---");
        System.out.println(Ejercicio01.sumaParesFibonacci(4, 0, 1));   // esperado 2
        System.out.println(Ejercicio01.sumaParesFibonacci(7, 0, 1));   // esperado 10
        System.out.println(Ejercicio01.sumaParesFibonacci(10, 0, 1));  // esperado 44
        System.out.println();
        
        //suma impares desde inicio a n
        System.out.println("--- FIBONACCI suma impares---");
        System.out.println("sumaImparesFibonacci(0)= " + Ejercicio01.sumaImparesFibonacci(0));    // esperado 0
        System.out.println("sumaImparesFibonacci(1)= " + Ejercicio01.sumaImparesFibonacci(1));    // esperado 1 (solo el 1)
        System.out.println("sumaImparesFibonacci(4)= " + Ejercicio01.sumaImparesFibonacci(4));    // esperado 5 (1 + 1 + 3)
        System.out.println("sumaImparesFibonacci(7)= " + Ejercicio01.sumaImparesFibonacci(7));    // esperado 23 (1 + 1 + 3 + 5 + 13)
        
        //suma pares entre dos posiciones#######
        
        System.out.println(Ejercicio01.sumaParesEntre(3, 7));  // esperado 10: posiciones 3 a 7 son 2, 3, 5, 8, 13 y los pares son 2 + 8
        System.out.println(Ejercicio01.sumaParesEntre(0, 4));  // esperado 2: coincide con sumaParesFibonacci(4)
        System.out.println(Ejercicio01.sumaParesEntre(5, 5));  // esperado 0: solo la posición 5, que vale 5 (impar)
        System.out.println(Ejercicio01.sumaParesEntre(6, 3));  // esperado 0: inicio mayor que fin, rango vacío
        
        System.out.println("\n--- BUSCAR DESDE ---");

        System.out.println("(4, 8, 15, 8, 23), 15= " + Ejercicio01.buscarPosicion(List.of(4, 8, 15, 8, 23), 15));  // esperado 2
        System.out.println("(4, 8, 15, 8, 23), 8= " + Ejercicio01.buscarPosicion(List.of(4, 8, 15, 8, 23), 8));    // esperado 1 (la primera aparición)
        System.out.println("(4, 8, 15, 8, 23), 4= " + Ejercicio01.buscarPosicion(List.of(4, 8, 15, 8, 23), 4));    // esperado 0 (primera posición)
        System.out.println("(4, 8, 15, 8, 23), 23= " + Ejercicio01.buscarPosicion(List.of(4, 8, 15, 8, 23), 23));  // esperado 4 (última posición)
        System.out.println("(4, 8, 15, 8, 23), 99= " + Ejercicio01.buscarPosicion(List.of(4, 8, 15, 8, 23), 99));  // esperado -1 (no existe)
        System.out.println("(), 5= " + Ejercicio01.buscarPosicion(List.of(), 5));                                  // esperado -1 (lista vacía)

        
        //Comprobaciones tipo esCreciente
        
        System.out.println(Ejercicio01.esDecreciente(List.of(9, 7, 7, 2)));            // true
        System.out.println(Ejercicio01.esEstrictamenteCreciente(List.of(1, 2, 2, 3))); // false
        System.out.println(Ejercicio01.alternanParidad(List.of(1, 2, 3, 4)));          // true
        System.out.println(Ejercicio01.alternanParidad(List.of(1, 3, 4)));             // false
        System.out.println(Ejercicio01.esProgresionAritmetica(List.of(2, 5, 8, 11)));  // true
        System.out.println(Ejercicio01.esProgresionAritmetica(List.of(2, 5, 9)));      // false
        System.out.println(Ejercicio01.esCapicua(List.of(1, 2, 3, 2, 1)));             // true
        System.out.println(Ejercicio01.esCapicua(List.of(1000, 5, 1000)));             // true
        System.out.println(Ejercicio01.esCapicua(List.of(1, 2, 3)));                   // false
        System.out.println(Ejercicio01.todosEnRango(List.of(3, 5, 8), 1, 10));         // true
        System.out.println(Ejercicio01.todosEnRango(List.of(3, 15, 8), 1, 10));        // false
        System.out.println(Ejercicio01.hayAlgunPrimo(List.of(4, 6, 7)));               // true
        System.out.println(Ejercicio01.hayAlgunPrimo(List.of(4, 6, 8)));               // false
        
        }
}
	
	

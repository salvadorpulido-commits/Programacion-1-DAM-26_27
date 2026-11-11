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
	}

}

package test;

import java.util.List;

import ejercicios.Ejercicio01;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("---------Test de Contadores---------");
		
		System.out.println(Ejercicio01.cuentaParesDeLos20PrimerosNumeros());
		System.out.println(Ejercicio01.cuentaParesHasta(20));
		System.out.println(Ejercicio01.cuentaParesEntre(1, 20));
		
		
		System.out.println(Ejercicio01.cuentaParesEn(List.of(5, 7, 3, 8, 7)));
		System.out.println(Ejercicio01.cuentaPrimosEn(List.of(5, 7, 3, 8, 7)));
	}

}

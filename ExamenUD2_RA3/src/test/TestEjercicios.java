package test;



import java.util.List;


import ejercicios.Ejercicios;

public class TestEjercicios {

	public static void main(String[] args) {

		System.out.println("\n--- clasificacion triangulos ---");
	    System.out.println(Ejercicios.clasificarTriangulo(3, 4, 5)); //esperado: "RECTANGULO"
	    System.out.println(Ejercicios.clasificarTriangulo(5, 5, 5)); //esperado: "EQUILATERO"
	    System.out.println(Ejercicios.clasificarTriangulo(5, 5, 8)); //esperado: "ISOSCELES"
	    System.out.println(Ejercicios.clasificarTriangulo(4, 6, 9)); //esperado: "ESCALENO"
	    System.out.println(Ejercicios.clasificarTriangulo(2, 2, 4)); //esperado: "INVALIDO"
	    

	    System.out.println("\n--- Triángulo de números alternos ---");
	    Ejercicios.trianguloAlterno(5); // esperado: Triangulo
	    Ejercicios.trianguloAlterno(1); // esperado: 1
	    Ejercicios.trianguloAlterno(0); // esperado: 0
	    
	    
	    System.out.println("\n--- clasificacion triangulos ---");
	    System.out.println(Ejercicios.tribonacci(0)); // esperado 0
	    System.out.println(Ejercicios.tribonacci(1)); // esperado 1
	    System.out.println(Ejercicios.tribonacci(2)); // esperado 1
	    System.out.println(Ejercicios.tribonacci(3)); // esperado 2
	    System.out.println(Ejercicios.tribonacci(5)); // esperado 7
	    System.out.println(Ejercicios.tribonacci(7)); // esperado 24
	    
	    System.out.println("\n--- Lista casi creciente ---");
	    System.out.println(Ejercicios.esCasiCreciente(List.of(2, 4, 6, 8))); //esperado : true
	    System.out.println(Ejercicios.esCasiCreciente(List.of(2, 5, 3, 7, 9))); //esperado : true
	    System.out.println(Ejercicios.esCasiCreciente(List.of(2, 5, 3, 7, 4))); //esperado : false
	    System.out.println(Ejercicios.esCasiCreciente(List.of(1, 3, 3, 5))); //esperado : true
	    System.out.println(Ejercicios.esCasiCreciente(List.of(3, 4, 5, 6))); //esperado : true
	    System.out.println(Ejercicios.esCasiCreciente(List.of(0))); //esperado : true
	    
	}

}

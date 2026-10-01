package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {

        // Abrimos el scanner 
    	
        Scanner sc = new Scanner(System.in);

        // Pedimos la base y la altura 
        
        System.out.println("Introduce la base: ");
        Double base = sc.nextDouble();
        System.out.println("Introduce la altura: ");
        Double altura = sc.nextDouble();

        // Operamos el Perimetro y el Area
        
        Double perimetro = 2 * (base + altura);
        Double area = base * altura;

        // Mostramos los resultados
        
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Area: " + area);

        // Cerramos scanner
        
        sc.close();
    }
}


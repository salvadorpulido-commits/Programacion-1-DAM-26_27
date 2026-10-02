package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {
	
	/* Una tienda aplica un descuento fijo del 15% y, posteriormente, 
	 * un IVA del 21%. Declara ambos porcentajes como constantes. 
	 * Pide el precio inicial al usuario, calcula el precio final y 
	 * muéstralo redondeado a dos cifras decimales utilizando Math.round().
	 */


    public static void main(String[] args) {
    	
    	// Abrimos Scanner

        Scanner sc = new Scanner(System.in);

        // Constantes 
        
        final Double DESCUENTO = 0.15;
        final Double IVA = 0.21;
        
        // Pedimos precio al usuario

        System.out.println("Introduce el precio inicial: ");
        Double precio = sc.nextDouble();

        // Operamos descontando el 15% y despues sumamos el 21% de IVA
        
        Double precioFinal = precio * (1 - DESCUENTO) * (1 + IVA);

        // Operamos el redondeo a 2 decimales
        
        Double redondeado = Math.round(precioFinal * 100) / 100.0;

        // Mostramos por consola resultado
        
        System.out.println("Precio final: " + redondeado);

        sc.close();
    }
}

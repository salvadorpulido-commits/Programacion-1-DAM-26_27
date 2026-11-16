package ejercicios;

import java.util.List;

public class Ejercicios {

	public static String clasificarTriangulo(Integer a, Integer b, Integer c) {
		String res = "";

		if (a * a + b * b == c * c) {
			res = "RECTANGULO";
		} else if (a == b && a == c) {
			res = "EQUILATERO";
		} else if (a == b && c >= a) {
			res = "ISOSCELES";

		}
		if (a != b && c != b) {
			res = "ESCALENO";

		}

		else if (a + b < c || a + c < b || b + c < a) {
			res = "INVALIDO";

		}

		return res;
	}

	// Ejercicio 2

	public static void trianguloAlterno(Integer n) {

		
				
		for (Integer i = 0; i < n; i++) {
			
			for (Integer j = 0; j <= i; j++) {
								
				
				if (i % 2 != 0)  {
					System.out.print("0");
				} else {
					System.out.print("1");
				}
				
			}
			System.out.println();
		}
	}

	// Ejercicio 4
	
	
	public static Integer tribonacci(Integer n) {

        
        if (n == 0) {
            return 0;
        }

        
        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 1;
        }
        
        return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n -3);
    }
	
	
	//Ejercicio 5
	
	public static Boolean esCasiCreciente(List<Integer> datos) {
		
	    Boolean res = true;
	    
	    for (int i = 1; i < datos.size(); i++) {
	        Integer e = datos.get(i);
	        Integer anterior = datos.get(i-1);
	        if (e <= anterior) {
	        	res = false;
	            break;
	        } 
	        else if (e < anterior && e != i) {
	        	res = false;
	            break;	
			}
	        
	    }
	    return res;
	}
	
	// Ejercicio 7
	
	
	
	
}
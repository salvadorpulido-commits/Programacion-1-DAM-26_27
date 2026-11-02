package utiles;

public class Utiles {
	
	// numeros primos
	
	 public static boolean esPrimo(Integer numero) {
	    	
		 
		 Boolean res = true;
		 
		 if (numero < 2) {
			 res = false;
		 }	
			
	        for (int divisor = 2; divisor < numero ; divisor++) {
	            if (numero % divisor == 0) {
	                res = false;
	            }
	        }

	        return res;
	    }
	 
	 // Numero perfecto
	 
	 public static boolean esPerfecto(Integer numero) {
	    	Boolean res = false;
	        Integer sumaDivisores = 0;
	        for (int divisor = 1; divisor < numero ; divisor++) {
	            if (numero % divisor == 0) {
	                sumaDivisores += divisor;
	            }
	        }
	        if(sumaDivisores.equals(numero) && numero > 0) {
	        	res = true;
	        }
	        return res;
	    }
	    


}

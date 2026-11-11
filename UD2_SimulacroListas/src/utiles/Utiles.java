package utiles;

public class Utiles {

    // Un número primo es mayor que 1 y solo es divisible entre 1 y él mismo.
    public static boolean esPrimo(Integer numero) {
    	Boolean res = true;

        for (int divisor = 2; divisor < numero ; divisor++) {
            if (numero % divisor == 0) {
                res = false;
            }
        }

        return res;
    }

    // Un número perfecto es positivo e igual a la suma de sus divisores propios.
    // Ejemplo: 6 = 1 + 2 + 3.
    public static boolean esPerfecto(Integer numero) {
    	Boolean res = false;
        Integer sumaDivisores = 0;
        for (int divisor = 1; divisor < numero ; divisor++) {
            if (numero % divisor == 0) {
                sumaDivisores += divisor;
            }
        }
        if(sumaDivisores.equals(numero)) {
        	res = true;
        }
        return res;
    }
    
    //TODO factorial de un número
    
    public static Integer factorial(Integer numero) {
        Integer res = 1;
        for (int i = 1; i <= numero; i++) {
            res = res * i;
        }
        return res;
    }
    
  //factorial recursivo
    public static Integer factorialRecursivo(Integer n) {
    	Integer res=1;
    	if (n==1) {
			res=1;
		} else {
			res=n* factorialRecursivo(n-1);
		}
    	return res;
    }

    // Devuelve -1 para valores fuera de 0 a 20 (factorial con long).
    public static Long factorialIteratico(Integer numero) {
        Long resultado = -1L;
        if (numero != null && numero >= 0 && numero <= 20) {
            resultado = 1L;
            for (int i = 2; i <= numero; i++) {
                resultado *= i;
            }
        }
        return resultado;
    }
    
    public static Integer sumaCifras(Integer n) {
    	Integer suma = 0;
    	while (n!=0) {
			suma += n%10;
			n = n/10;
		}
    	return suma;
    }
}
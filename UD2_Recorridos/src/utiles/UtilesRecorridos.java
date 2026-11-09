package utiles;

public class UtilesRecorridos {
	
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


}

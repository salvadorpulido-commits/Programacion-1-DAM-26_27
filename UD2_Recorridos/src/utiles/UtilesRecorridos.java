package utiles;

public class UtilesRecorridos {

	// Un número primo es mayor que 1 y solo es divisible entre 1 y él mismo.
	public static Boolean esPrimo(Integer numero) {
		Boolean res = numero > 1;

		for (int divisor = 2; divisor < numero; divisor++) {
			if (numero % divisor == 0) {
				res = false;
				break;
			}
		}

		return res;
	}

	// Metodo que tambien admite primos negativos

//	public static boolean esPrimo(Integer numero) {
//        Boolean res = true;
//
//        for (int divisor = 2; divisor < numero ; divisor++) {
//            if (numero % divisor == 0) {
//                res = false;
//            }
//        }
//
//        return res;
//    }
//
//}

// Un perfecto es positivo e igual a la suma de sus divisores propios.

	public static boolean esPerfecto(Integer numero) {
		Integer sumaDivisores = 0;
		Boolean res = false;
		if (numero != null && numero > 1) {
			for (int divisor = 1; divisor <= numero / 2; divisor++) {
				if (numero % divisor == 0) {
					sumaDivisores += divisor;
				}
			}
			if (sumaDivisores.equals(numero)) {
				res = true;
			}
		}
		return res;
	}

}
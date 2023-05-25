
public class bloque2 {

	private int factorial = 1;

	public bloque2() {

	}

	/**
	 * 
	 * @param numero se introduce un número cualquiera para poder calcular su
	 *               factorial
	 * @return Devuelve la cantidad calculada del número introducido               
	 * 
	 */
	public int calcularFactorial(int numero) {

		while (numero != 0) {
			factorial = factorial * numero;
			numero--;
		}
		return factorial;
	}

	/**
	 * 
	 * @param Introduce un número cualquiera para saber si es primo o no.
	 * @return Y este devuelve true o false.
	 */
	
	public static Boolean esPrimo(int numero) {
		Boolean esPrimoActual = true;
		if (numero < 2) {
			esPrimoActual = false;
		} else {
			for (int x = 2; x * x <= numero; x++) {
				if (numero % x == 0) {
					esPrimoActual = false;
					break;
				}
			}
		}
		return esPrimoActual;
	}	
	
}

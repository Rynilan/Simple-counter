public class Contador {
	/** Just a class to contain the method to print a all the values between
	 * zero and the difference between the first and second value.
	 */

	public static void imprimirValores(int primeiroValor, int segundoValor) throws PrimeiroValorMaiorQueOSegundo{
		/** The 'main' method to do what the class description say.
		 *
		 * Note: if the second value is greater than the first it throws a exception.
		 */
		
		int interacoes = -1;

		if (primeiroValor > segundoValor) {
			interacoes = primeiroValor - segundoValor;
		} else {
			throw new PrimeiroValorMaiorQueOSegundo();
		}

		System.out.printf("Imprimindo valores entre %d e %d.\n", 1, interacoes);
		for (int valor = 0; valor < interacoes; valor++) {
			System.out.printf("* %02dº Valor impresso.\n", valor + 1);
		}
		System.out.print("\nImpressões finalizadas.");
	}
}

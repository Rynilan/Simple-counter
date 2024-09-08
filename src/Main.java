import java.util.Scanner;
import java.util.InputMismatchException; // Exception that 'll happen if you input anything but a number to the Scanner method nextInt.

public class Main {
	/** Class to call the others classes. */

	public static void main(String[] parametros) {
		Scanner stdin = new Scanner(System.in);
		System.out.print(
				" Bem vindo ao contador entrelinhas, aqui contaremos\n" +
				"de zero ao valor da diferença entre os dois valoresn\n" +
				"respectivamente.\n Para iniciar, indique o primeiro valor.\n> "
			);
		int valor1, valor2;
		try {
			valor1 = stdin.nextInt();
			System.out.print(" Agora indique o segundo valor.\n> ");
			valor2 = stdin.nextInt();
			System.out.println();
			contador(valor1, valor2);
		} catch (InputMismatchException exception) {
			mostrarMensagemDeErro();
		}
				stdin.close();
	}

	public static void contador(int valor1, int valor2) {
		try {
			Contador.imprimirValores(valor1, valor2);
		} catch (PrimeiroValorMaiorQueOSegundo exception) {
			mostrarMensagemDeErro();
		}

	}

	public static void mostrarMensagemDeErro() {
		System.out.print(
			" Valor oferecido inválido, veja as regras:\n" +
			"* O primeiro não deve ser menor que o segundo.\n" +
			"* Tem de serem números puros (sem letras ou símbolos)."
		);
	}
}

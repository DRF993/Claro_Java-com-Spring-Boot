import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {

		Scanner primeiro = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = primeiro.nextInt();

		Scanner segundo = new Scanner(System.in);
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = segundo.nextInt();

		try {
			// chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException exception) {

			exception.printStackTrace();
			
		}

	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

		if (parametroUm > parametroDois) {

			throw new ParametrosInvalidosException();

		} else {

			int contagem = parametroDois - parametroUm;

			for (int i = 0; i < contagem; i++) {

				System.out.println("Imprimindo o número " + (i + 1));
			}

		}

	}
}
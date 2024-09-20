
public class ParametrosInvalidosException extends Exception {

	public ParametrosInvalidosException() {

		super("ERRO: O segundo parâmetro deve ser maior que o primeiro");

	}

	public ParametrosInvalidosException(String mensagem) {

		super(mensagem);

	}
}

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente, String agencia, String numero) {
		super(cliente, agencia, numero);
	}

	@Override
	public void imprimirDados() {
		System.out.println("> Dados da Conta Corrente < ");
		super.dadosDaConta();
	}

	@Override
	public String tipo() {

		return "Conta Corrente";
	}

}
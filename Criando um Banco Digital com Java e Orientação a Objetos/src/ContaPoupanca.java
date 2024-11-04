public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente, String agencia, String numero) {
		super(cliente, agencia, numero);
	}

	@Override
	public void imprimirDados() {
		System.out.println("> Dados da Conta Poupança < ");
		super.dadosDaConta();
	}

	@Override
	public String tipo() {

		return "Poupança";
	}
}
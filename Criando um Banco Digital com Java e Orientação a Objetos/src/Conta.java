public abstract class Conta implements IConta {

	private String agencia;
	private String numero;
	private double saldo;
	private Cliente cliente;

	public Conta(Cliente cliente, String agencia, String numero) {

		this.cliente = cliente;
		this.agencia = agencia;
		this.numero = numero;
	}

	@Override
	public void sacar(double valor) {

		if (valor > saldo || saldo == 0) {

			System.out.println(" Saldo insuficiente pra este saque " + "\n Seu saldo atual é : " + saldo);
		}

		else {

			saldo -= valor;

			System.out.println("Saque de " + valor + " realizado com sucesso !");
		}
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Depósito de " + valor + " realizado com sucesso !");
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {

		if (this.saldo >= valor) {
			contaDestino.depositar(valor);
			this.saldo -= valor;

		} else {

			System.out.println("Saldo insuficiente: " + "Saldo atual: " + this.saldo);
		}
	}

	public void dadosDaConta() {

		System.out.println(String.format("Titular: " + this.cliente.getNome()));
		System.out.println(String.format("Agência: " + this.agencia));
		System.out.println(String.format("Número: " + this.numero));
		System.out.println();

	}

	public void consultarSaldo() {

		System.out.println(String.format("Saldo: " + this.saldo));
	}

	public String getAgencia() {
		return agencia;
	}

	public String getNumero() {
		return numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}
}

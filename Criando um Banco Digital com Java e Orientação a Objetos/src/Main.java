
public class Main {

	public static void main(String[] args) {

		// Classe executável para criar objetos e realizar as operações

		Cliente daniel = new Cliente();
		daniel.setNome("Daniel");
		Conta c1 = new ContaCorrente(daniel, "1111", "11111-1");

		Cliente jose = new Cliente();
		jose.setNome("José");
		Conta c2 = new ContaCorrente(jose, "2222", "22222-2");

		Cliente maria = new Cliente();
		maria.setNome("Maria");
		Conta c3 = new ContaPoupanca(maria, "3333", "33333-3");

		Cliente joao = new Cliente();
		joao.setNome("João");
		Conta c4 = new ContaPoupanca(joao, "4444", "4444-4");

		Cliente helena = new Cliente();
		helena.setNome("Helena");
		Conta c5 = new ContaPoupanca(helena, "5555", "5555-5");

		Banco banco = new Banco("Banco digital a ");
		Banco bancoB = new Banco("Banco digital b ");

		banco.adicionarConta(c1);
		banco.adicionarConta(c2);
		banco.adicionarConta(c3);
		banco.adicionarConta(c4);

		bancoB.adicionarConta(c5);

		banco.consultarContas();
		bancoB.consultarContas();

		c1.depositar(10);
		c2.depositar(10);
		c3.depositar(10);
		c4.depositar(10);

		c1.consultarSaldo();
		c1.sacar(2);
		c1.consultarSaldo();
		c1.depositar(5);
		c1.consultarSaldo();
		c1.transferir(11, c2);
		c2.consultarSaldo();

		c1.imprimirDados();
		c4.imprimirDados();

	}

}
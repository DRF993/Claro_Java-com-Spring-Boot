import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public Banco(String nome) {

		this.nome = nome;
		contas = new ArrayList();
	}

	public void consultarContas() {

		System.out.println("Banco: " + nome);

		String p = "\n";

		for (int x = 0; x < contas.size(); x++) {

			System.out.println("Cliente: " + contas.get(x).getCliente() + p + "Agência: " + contas.get(x).getAgencia()
					+ p + "Número: " + contas.get(x).getNumero() + p + "Tipo: " + contas.get(x).tipo() + p);

		}
	}

	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}

public class AparelhosTelefonicos implements Telefone {

	@Override
	public void ligar(String numero) {

		System.out.println("Realizando Ligação");

	}

	@Override
	public void atender() {

		System.out.println("Atendendo Ligação");

	}

	@Override
	public void iniciarCorreioVoz() {

		System.out.println("Iniciando Correio de Voz");

	}

}

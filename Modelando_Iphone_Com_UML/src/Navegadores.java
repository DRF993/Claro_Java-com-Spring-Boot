
public class Navegadores implements Navegador {

	@Override
	public void exibirPagina(String url) {

		System.out.println("Exibindo Página");

	}

	@Override
	public void adicionarNovaAba() {

		System.out.println("Adicionando Nova Aba");

	}

	@Override
	public void atualizarPagina() {

		System.out.println("AtualizandoPagina");

	}

}

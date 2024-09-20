import java.util.Scanner;

public class ContaTerminal {

	public static void main(String [] args) {
		
		
		// Obtendo os dados do cliente
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("OLÁ, Bem Vindo ao nosso banco ! \n");
		
		System.out.println("Por favor, digite o seu nome completo ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite o número da agência");
		String agencia = scanner.nextLine();
		
		System.out.println("Digite o número da conta");
		int numero = scanner.nextInt();
		
		System.out.println("Digite o saldo da conta");
		double saldo = scanner.nextDouble();
		
		scanner.close();
		
		
		
		// Mostrando as informações fornecidas pelo cliente
		
		System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, "
				+ "sua agência é "+agencia+", conta "+numero+" "
						+ "e seu saldo "+saldo+" já está disponível para saque.");
	}

}

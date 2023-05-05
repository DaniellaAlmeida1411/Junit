import java.util.Scanner;

public class Meuif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		System.out.println("Bem vindo ao Banco Flash");
		int senhacadastrada = 123456;
		System.out.println("");
		System.out.println("Digite sua senha");
		int capsenha = s.nextInt();
		int saldo = 1500;

		
		if (capsenha == senhacadastrada) {
			System.out.println("Acesso liberado senha valida");
			System.out.println("Digite o valor do boleto :");
			int valordoboleto = s.nextInt();
			if (saldo >= valordoboleto) {
				System.out.println("Seu boleto foi pago com sucesso");
				int saldofinal = saldo - valordoboleto;
				System.out.println("seu saldo após o pagamento é de " + saldofinal);
			} else {
				System.out.println("Saldo insuficiente seu saldo é de " + saldo);
			}
		} else {
			System.out.println("Senha invalida");
		}

	}

}
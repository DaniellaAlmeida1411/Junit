import java.util.Scanner;

public class Switdois {

	public static void main(String[] args) {
		//

		Scanner s = new Scanner(System.in);

		System.out.println("Bem vindo a Flash car o seu carro está aqui");
		System.out.println("Digite seu nome :");
		String nome = s.next();
		System.out.println(nome);
		System.out.println("");
		System.out.println("Dgite seu Telefone:");
		int telefone = s.nextInt();
		System.out.println(telefone);
		System.out.println("");
		System.out.println("Digite seu endereço");
		Scanner ende = new Scanner(System.in);
		String endereco = ende.nextLine();
		System.out.println(endereco);
		System.out.println("");
		System.out.println("Digite seu banco");
		Scanner banc = new Scanner(System.in);
		String banco = banc.next();
		System.out.println(banco);

		System.out.println("Temos os seguintes modelos disponiveis com os seguintes valores:");
		System.out.println("bmw     R$: 1000,00");
		System.out.println("civic   R$: 5000,00");
		System.out.println("corsa   R$: 4000,00");
		System.out.println("Fiesta  R$: 1500,00");
		System.out.println("Uno     R$: 2000,00");
		System.out.println("Peugeot206 R$: 100,00");
        System.out.println("Digite o modelo Desejado:");
		String modelo = s.next();
		int saldo = 10000;
		int civic = 5000;

		switch (modelo) {
		case "civic":
			System.out.println("Voce selecionou o veiculo Civic");
			System.out.println("temos as seguintes formas de pagamento :");
			System.out.println("");
			System.out.println("Dinheiro ou cartao de  Debito");
			String pagamento = s.next();
			switch (pagamento) {
			case "dinheiro":
				System.out.println("Voce selecionou a forma de pagamento em dinheiro");
				int saldofinal = saldo - civic;
				System.out.println("O  valor do pagamento foi de " + civic + ",00");
				System.out.println(" o valor do saldo final é de " + saldofinal);
				System.out.println("");
				System.out.println("o veiclulo adquirido foi um  Civic");
				System.out.println("");
				System.out.println("O endereçço de entrega é " + endereco);

				break;
			case "cartao":
				System.out.println("Voce selecionou a forma de pagamento em  cartao");
			default:
				break;
			}
			break;
		case "peugeot206":
			break;
		default:
			System.out.println("Este veiculo não consta em nossos estoques");
			break;
		}

	}
}
				

				
	

		
		
		
		
		
		
     
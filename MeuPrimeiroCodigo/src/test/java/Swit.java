import java.util.Scanner;

public class Swit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner s = new Scanner (System.in);

		System.out.println("Digite o modelo:");
		String carro = s.next();
		
		switch (carro) {
		case "bmw":
			System.out.println("Carro de luxo");
			break;
		case "fiesta": 
			System.out.println("Carro popular");
         break;
         
		default:
			System.out.println("Opção invalida");
			break;
		}
	}

}

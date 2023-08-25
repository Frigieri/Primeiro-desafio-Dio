
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da sua conta!");
		int conta = scan.nextInt();

		System.out.println("Por favor, digite o número da sua agéncia!");
		String agencia = scan.next();
		
		System.out.println("Agora por favor, digite o seu nome!");
		String nome = scan.next();
		
		System.out.println("E por ultimo, digite o seu saldo!");
		double saldo = scan.nextDouble();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nome, agencia, conta, saldo);
	}

}

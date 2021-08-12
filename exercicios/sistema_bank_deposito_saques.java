//Código da Classe Bank
package entities //pacote entities

public class Bank {
	private int conta;
	private String nome;				//Declarando meus atirbutos da minha classe (objeto)
	private double saldo;				//private para deixar meus atributos privados
	
	public Bank (int conta, String nome) {
		this.conta = conta;					// Construtor caso não haja um depósito inicial
		this.nome = nome;
	}
	
	public Bank (int conta, String nome, double DepInicial) {
		this.conta = conta;
		this.nome = nome;					// Construtor caso haja sim um depósito inicial
		deposito(DepInicial);
	}
	
	public int getConta() {
		return conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String name) {
		this.nome = name;
	}

	public double getSaldo() {
		return saldo;
	}
	public void getSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void deposito (double valor) {
		saldo = saldo + valor;
	}
	
	public void saque (double valor) {
		saldo = saldo - valor - 5.00;
	}
	
	public String toString() {
		return "Conta " + conta + ", Dona da conta: " + nome + ", Saldo: $" + String.format("%.2f", saldo);
	}
}

//////////////////////////////////////////////////////////////////////////////////////////////////////

package application //' pacote aplication '



import java.util.Scanner;

public class Program { //'classe publica programa'

		public static void main (String[] args) {
		
			Scanner sc = new Scanner(System.in)
			Bank bank; 				//Declaração do meu objeto bank
			
			System.out.println("Abrindo uma conta!");
			System.out.print("Número da conta: ");
			int conta = sc.nextInt(); 	
			System.out.print("Nome do titular da conta: ");	
			sc.nextLine();				//quebra de linha
			String nome = sc.nextLine();
			System.out.print("Tem depósito inicial? (s/n):  ");
			char resposta  = sc.next().CharAt(0);
			
			if (resposta == 's') {
				System.out.print("Ente com o valor do depósito inicial: ");
				double depositoInicial = sc.nextDouble();
				bank = new bank(conta, nome, depositoInicial);			//Instaciação com depósito inicial
			}
			else {
				bank = new bank (conta, nome);							//Instaciação sem depósito inicial
			}
			
			System.out.println("Dados da conta!");
			System.out.println(bank);
			
			System.out.println();
			System.out.print("Valor de depósito: ");
			double valorDeposito = sc.nextDouble();
			bank.deposito(valorDeposito);
			System.out.println("Updated dados da conta!");
			System.out.println(bank);
			
			System.out.println();
			System.out.print("Valor de saque: ");
			double valorSaque = sc.nextDouble();
			bank.saque(valorSaque);
			System.out.println("Updated dados da conta!");
			System.out.println(bank);
			
			
			
			
			
			sc.close()
	}


}


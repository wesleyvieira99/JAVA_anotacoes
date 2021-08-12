package entities.enums;


//////////////////////////////////////////
package entities;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	
	public Account(Integer number, String holder, Double balance) { //Construtor
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	//aqui coloca meus getters e setter que to com preguiça de colocar agora...
	
	public void saque(double amount) {
		balance = balance - amount;
	}
	
	public void deposito(double amount) {
		balance = balance + amount;
	}
}

public class BusinessAcount extends Account { //Classe que está herdando tudo de Acount
	
	private double emprestimo;
	
	public BusinessAcount(Integer number, String holder, Double balance, Double emprestimo) { 
	// Construtor inclui os dados tbm da classe herdeira usando o SUPER
		super(number,holder,balance);
		this.emprestimo = emprestimo;
		
	}
	
	public void emprestar(double amount) {
		deposito(amount);	//Com a herança, me permite usar o método de deposito da outra classe
	}
}





//////////////////////////////////////////////////////////////
package application;

public class Program {
	public static void main(String[] args) {
		
		
		
	}
}
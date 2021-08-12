package entities.enums;


//////////////////////////////////////////
package entities;

public class Employee {
	private String nome;
	private Integer horas;
	private Double valorPorHora;
	
	public Employee(String nome, Integer horas, Double valorPorHora) {
		this.nome = nome;
		this.horas = horas;
		this.valorPorHora = valorPorHora;
	}
	
	//AQUI VAIS OS GETTERS E SETTERS
	
	public double pagamento() {
		return horas * valorPorHora;
	}
}


public FuncTerceirizado extends Employee {
	private Double bonus;
	
	public Employee(String nome, Integer horas, Double valorPorHora, Double bonus) {
		super(nome,horas,valorPorHora);
		this.bonus = bonus;
	}
	
	//AQUI VAIS OS GETTERS E SETTERS
	
	@Override
	public double pagamento() {
		return super.pagamento() + bonus * 1.1
	}
}

//////////////////////////////////////////////////////////////
package application;

import java.util.Scanner;
import java.util.ArrayList;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> lista = new ArrayList<>();
		
		System.out.println("Quantidade de funcionarios: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Funcionário número" + i + ": ");
			System.out.print("É terceirizado? ");
			char ch = sc.next().charAt(0);
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Quantidade de horas: ");
			int horas = sc.nextInt();
			System.out.println("Valor por hora: ");
			double valorPorHora = sc.nextDouble;
			
			if (ch == 'sim') {
				System.out.print("Bônus: ");
				double bonus = sc.nextDouble();
				Employee emp = new FuncTerceirizado(nome,horas,valorPorHora,bonus);
				lista.add(emp);
			}
			else{
				Employee emp = new Employee(nome,horas,valorPorHora);
				lista.add(emp);
			}
			
		}
		
		System.out.println("PAGAMENTOS: ");
		for (Employee emp : lista) {
			System.out.println(emp.getName() + " $ " + emp.pagamento());
		}
		
		sc.close;
	}
}
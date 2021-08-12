//Criando classe do meu funcionário com meus atributos e métodos
public class Funcionario {
	public String name;
	public double grosssalary;
	public double tax;
	
	public double NetSalary () {
		return grosssalary - tax
	}
	
	public void IncreaseSalary (double percentage) {
		grosssalary = grosssalary + (grosssalary * percentage)
	}
	
	public diagonal {
		return 		
	}
	

//Fazendo meu programa ler os valores e calcular o resultado
import java.util.Scanner;
public class Main {
	public static void main (String[], args) {
		Scanner sc = new Scanner(System.in);
		
		// Instanciando meu funcionário
		Funcionario x;
		x = new Funcionario();
		
		System.out.print("Name ");
		x.name = sc.nextDouble();
		System.out.print("Gross Salary: ");
		x.grosssalary = sc.nextDouble();
		System.out.print("Tax: ");
		x.tax = sc.nextDouble();
		
		System.out.println("Employee: " + x.name + "$ " + NetSalary);
		System.out.print("Wich percentage to increase salary? ");
		x.IncreaseSalary.percentage = sc.nextDouble
		System.out.println("Updated data: " + x.name + "$ " + grosssalary);
		
	}
}
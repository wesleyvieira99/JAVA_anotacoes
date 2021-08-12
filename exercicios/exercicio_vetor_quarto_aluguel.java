//////////////////////////////////////////////////ENTIDADES//////////////////////////////////////////////////////////////

package entities;

public class Pessoas {
	private String name;
	private String email;
	
	public Product(String name, double email) { //Construtor
		this.name = name;
		this.price = email;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getEmail(){
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
//////////////////////////////////////////////////APLICAÇÃO//////////////////////////////////////////////////////////////
package application;

import java.util.Scanner;
import entities.Product;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 10; //10 QUARTOS
		Pessoa[] vect = new Pessoa[n]; //criação do vetor-("Pessoa []" é para instanciar o vetor com seu tipo classe,
										//"vect" é o nome do vetor)
										// "new Pessoa[n]" é um novo vetor do tipo classe com n posições. 
										//Colchetes indica um vetor.
										
		System.out.println("Digite o nome: ");
		String name = sc.nextLine();
		System.out.println("Digite o email: ");
		String email = sc.nextLine();
		System.out.println("Digite o quarto: ");
		int m = sc.nextInt;
		if (vect[m] != null) {
			vect[m] = new Product(name, email);
		} else {
			System.out.print("Quarto vago! tente outro. ");
		}
		
		sc.close();	
	}
}
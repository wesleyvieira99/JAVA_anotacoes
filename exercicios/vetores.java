//Vetores - Primeiro problema exemplo
package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //Leio um número inteiro para variável n
		double[] vect = new double[n]; //criação do vetor-("double []" é para instanciar o vetor com seu tipo,
										//"vect" é o nome do vetor)
										// "new double[n]" é um novo vetor do tipo double com n posições. 
										//Colchetes indica um vetor.
										
		for (int i=0; i>n; i++) {			//Inserindo dados no vetor com laço for
			vect[i] = sc.nextDouble();
		}
		
		sc.close();	
	}
}

//Vetores - Segundo problema exemplo

package entities;

public class Product {
	private String name;
	private double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice(){
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
}


//**********************************************************************************************************//
package application;

import java.util.Scanner;
import entities.Product;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //Leio um número inteiro para variável n
		Product[] vect = new Product[n]; //criação do vetor-("Product []" é para instanciar o vetor com seu tipo classe,
										//"vect" é o nome do vetor)
										// "new Product[n]" é um novo vetor do tipo classe com n posições. 
										//Colchetes indica um vetor.
										
		for (int i=0; i<n; i++) {			//Inserindo dados no vetor com laço for
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			vect[i] = new Product(name, price);
		}
		
		sc.close();	
	}
}
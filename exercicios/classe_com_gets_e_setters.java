//Código da Classe Product
package entities //pacoto entities

public class Product {
	private String name;
	private double price;				//Declarando meus atirbutos da minha classe (objeto)
	private int quantity;				//private para deixar meus atributos privados
	
	public Product (String name, double price, int quantity) {
		this.name = name; 									//Construtor, que obriga incialização de valores dos atributos
		this.price = price;
		this.quantity = quantity;
	}														// Vem antes dos métodos e depois dos atributos
	

	public double totalValueInStock() {
		return price * quantity				// Aqui temos a função que retorna o total de valor em estoque
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity				//Função que não retorna valor, somente altera o atributo quantity da minha classe
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;				//Função que não retorna valor, somente altera o atributo quantity da minha classe
	}
	
	public String toString() {
		return name + ", $ " 
		+ String.format("%.2f", price) 
		+ ", " + quantity + " unidades, " 
		+ 
		String.format("%.2f", totalValueInStock());
		//O código acima retorna na tela o atributo name, o atributo price formatado pra duas casas decimais em String, ...
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public double getQuantity() {
		return quantity;
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////////////

package application //' pacote aplication '



import java.util.Scanner;

public class Program { //'classe publica programa'

		public static void main (String[] args) {
		
			Scanner sc = new Scanner(System.in)
			
			System.out.println("Enter product data: ");
			System.out.print("Name: ");
			String name = sc.nextLine(); 					
			double price = sc.nextLine();
			System.out.print("Quantity in stock: ");
			int quantity = sc.nextInt();
			
			Product product = new Product();					//Com o construtor, pego primeiro os dados dos atributos e
																//e depois instancio o meu produto já com os atributos com valor
			system.out.println();
			system.out.prinln("Product data: " + product );		//'Aqui eu imprimi minha classe (objeto) e seus atributos'
			
			System.out.println();
			system.ou.print("Enter the number of products to be added in stock: ");
			quantity = sc.nextInt(); 				//'Aqui eu atribuo a meu atributo quantity o que colocar no scanner'
			product.addProducts(quantity);
			
			system.out.println();
			system.out.println("Updated data: " + product);
			
			
			sc.close()
	}


}


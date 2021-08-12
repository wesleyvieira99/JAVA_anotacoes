//////////Classe do meu produto///////////////
package entities;
//Usando meu pacoto entities
public class Product {
	public String name;
	public double price;
	public int quantity;
// Todos os meus atributos da minha classe Product
	public double totalValueInStock () {
		return price * quantity;
	}
//Método da minha classe product que retorna o valor total em estoque
	
	public void addProducts (int quantity) {
		return this.quantity = this.quantity + quantity;
	}
// método da minha classe product que adiciona elementos ao atributo quantity	
	public void removeProducts (quantity) {
		return this.quantity = this.quantity - quantity;
	}
// método da minha classe product que remove elementos ao atributo quantity	
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + totalValueInStock();
	}
// método da minha classe product que retorna em formato de string os valores que tenho nos meus atributos
}

////////////Meu Programa Principal//////////////////
import java.util.Scanner;
//importei a utilidade do java para scanner
import entities.Product;
// importer do pacote entities a classe product
public class Main {

	public static void main (String[], args) {
		
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
// aqui eu declarei e logo instanciei minha classe product. Lembrando que tinha importado antes no começo do meu programa.		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
// neste bloco de códigos acima eu atribuo aos meus atributos da minha classe Product o que eu coloco no Scanner
		System.out.println("Product data: " + product.toString());
		
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("Updated data: " + product.toString());
		
		System.out.print("Enter the number of products to be removed in stock: ");
		int quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("Updated data: " + product.toString());
		
		
		sc.close();
	}
	
}




//Explicação do sisteminha abaixo//

//Fazer um programa para ler os dados de N produtos (N fornecido pelo usuário).
//Ao final, mostrar a etiqueta do produto.

//////////////////////////////////////////
package entities;

public class Produto {
	
	private String nome;
	private int preco;
	
	public Produto(String nome, Integer preco) {
		this.nome = nome;
		this.preco = preco;
		}
		
	//AQUI VAI MEUS GETTERS E SETTERS//

	public String Etiqueta() {
		return "O preço da etiqueta é: R$" + preco + ".";
	}
}

public class ProdutoImportado extends Produto{
	private int Taxa;
	
	public ProdutoImportado(String nome, Integer preco, Integer Taxa) {
		super(nome, preco);
		this.Taxa = Taxa;
		}
		
	//AQUI VAI MEUS GETTERS E SETTERS//
	
	public Integer PrecoTotal {
		return preco = preco + (preco * Taxa); 
	}
	
	@Override
	public String Etiqueta() {
		return "O preço da etiqueta é: R$" + PrecoTotal + ".";
	}
	
public class ProdutoUsado extends Produto{
	
	private Date DataFabricacao;
	
	public ProdutoUsado(String nome, Integer preco, Date DataFabricacao) {
		super(nome, preco);
		this.DataFabricacao = DataFabricacao;
		}
		
	@Override
	public String Etiqueta() {
		return "O preço da etiqueta é: R$" + preco + ", com data de fabricação em: " + DataFabricacao + ".";
	}
		
}
}

//////////////////////////////////////////////////////////////
package application;

import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;

import entities.ProdutoImportado;
import entities.Produto;
import entities.ProdutoUsado;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Produto> list = new ArrayList<>();

		System.out.print("Quantidade de produtos a serem cadastrados: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Produto #" + i + " dados:");
			System.out.print("Nacional, usado ou importado (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			double price = sc.nextDouble();
			if (type == 'c') {
				list.add(new Produto(nome, price));
			}
			else if (type == 'u') {
				System.out.print("Data de fabricação (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				list.add(new ProdutoUsado(nome, price, date));
			}
			else {
				System.out.print("Taxa: ");
				double taxa = sc.nextDouble();
				list.add(new ImportedProduct(nome, price, taxa));
			}
		}

		System.out.println();
		System.out.println("Etiqutas de preços:");
		for (Produto prod : list) {
			System.out.println(prod.Etiqueta());
		}
	
		sc.close;
	}
}
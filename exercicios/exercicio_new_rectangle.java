

//Criando classe do meu retângulo com meus atributos e métodos

public class Retangulo {
	public double largura;
	public double altura;
	
	public area () {
		return largura * altura;
	}
	
	public perimetro {
		return (largura*2) + (altura*2)
	}
	


//Fazendo meu programa ler os valores e calcular o resultado

import java.util.Scanner;

public class Main {
	public static void main (String[], args) {
		Scanner sc = new Scanner(System.in);
		
		// Instanciando meu retângulo
		Retangulo x;
		x = new Retangulo();
		
		System.out.println("Enter rectangle width and height: ")
		x.largura = sc.nextDouble();
		x.altura = sc.nextDouble();
		
		System.out.println("Area = %.2f%n", x.area);
		System.out.println("Perimetro = %.2f%n", x.perimetro);
		System.out.println("Diagonal = %.2f%n", x.diagonal);
		
	}
}
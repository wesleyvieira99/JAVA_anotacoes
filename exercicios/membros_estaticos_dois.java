//Criando classe Calculator usando membros estáticos

import util;

//transformando o PI e os meus métodos em estáticos
public class Calculator {
	public static final double PI = 3.14159;
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	public static double volume(double radius){
		return 4.0 * PI * radius * radius * radius /3.0.
	}

}


//Fazendo meu programa ler os valores e calcular o resultado
import java.util.Scanner;
public class Main {
	public static void main (String[], args) {
		
		Scanner sc = new Scanner(System.in);
	
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = circumference(radius);
		double v = volume(radius);
		
		System.out.printf("Circumference: %2f%n", c);
		System.out.printf("Volume: %2f%n", v);
		
//Aqui no programa não preciso mais instanciar os objetos, basta chamar os métodos, Independente de qualquer objeto.		
		
	}
}
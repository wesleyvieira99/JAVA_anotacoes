//Criando classe Calculator usando membros estáticos

import util;

public class Calculator {
	public final double PI = 3.14159;
	
	public double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	public double volume(double radius){
		return 4.0 * PI * radius * radius * radius /3.0.
	}

}


//Fazendo meu programa ler os valores e calcular o resultado
import java.util.Scanner;
public class Main {
	public static void main (String[], args) {
		
		Scanner sc = new Scanner(System.in);
	
		Calculator calc = new Calculator();
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = calc.circumference(radius);
		double v = calc.volume(radius);
		
		System.out.printf("Circumference: %2f%n", c);
		System.out.printf("Volume: %2f%n", v);
		
		
		
	}
}
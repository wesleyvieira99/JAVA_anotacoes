
package entities;
public class Triangle {
	public double a;
	public double b;
	public double c;
}


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
import entities.Triangle;
public class Main {

	public static void main (String[], args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p *(p - x.a) * (p - x.b) * (p - x.c));
		
		double p = (y.a + y.b + y.c) / 2.0;
		double areaX = Math.sqrt(p *(p - y.a) * (p - y.b) * (p - y.c));
		
		System.out.println("Triangle X area: %.4f%n", areaX);
		System.out.println("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
	}
	
}




//////////////////////////////
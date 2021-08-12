

import java.util.Scanner;
public class Main {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a,b,c);
		
		showResults(higher);
		
		sc.close();	
	}

	public static int max (int x, int y, int z) {
		
		int aux;
		if (x > y && x > z) {
			aux = y;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int value) {
		system.out.println("Higher = " + value);
	}
}

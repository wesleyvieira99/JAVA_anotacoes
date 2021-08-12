package application;
import java.util.scanner;
public class Program {
	public static void main(String[] args) {
		
		Scanner sc - new Scanner (System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int [n][n];
		// Dois colchetes que me diz q é um arranjo bidimensional, ou seja, uma matriz
		//Se fosse três colchetes seria tridimensional
		
		for (int i=0; i<n; i++) {
			for(int j=0; j<n; j++){
				mat[i][j] = sc.nextInt();
			}
		}
		
		//Para percorrer as linhas primeiro para cada coluna e depois pular pra outra linha
		//Eu faço dois for, um dentro do outro. O de fora pra linha e o de dentro pra coluna
	}
}
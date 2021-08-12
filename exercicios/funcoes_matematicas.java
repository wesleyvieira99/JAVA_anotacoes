A = Math.sqrt(x);
/* aqui a variável A recebe a raíz quadrada de x */

A = Math.pow(x, y);
/* aqui a variável A recebe o resultado de x elevado a y */

A = Math.abs(x);
/*aqui a variável A recebe o valor absoluto de x */


/*Exemplo de código usando essas funções matemáticas */

public class Main {
	public static void main(String[] args) {
			
	double x = 3.0;
	double y = 4.0;
	double z = -5.0;
	double A, B, C;
	
	A = Math.sqrt(x);
	B = Math.pow(x, 2.0);
	C = Math.pow(5.0, 2.0);
	System.out.println("Raiz quadrada de " + x + " = " + A);
	System.out.println("Raiz quadrada de " + y + " = " + B);
	System.out.println("5 elevado ao quadrado = " + C);
	}
}
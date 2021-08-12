> - maior
< - menor
>= - maior ou igual
<= menor ou igual
== - igual
!= - diferente

import java.util.Scanner;
public class Main {
	public static void main (String[] args) {
		
			Scanner sc = new Scanner(System.in)
			int hora;
			System.out.println("Quantas horas?");
			hora = sc.nextInt();
			
			if (hora < 12) {
			System.out.println("Bom Dia");
			}
			else if (hora < 18) {
				System.out.println("Boa Tarde");
				}
			else{
				System.out.println("Boa Noite");
				}
			
			sc.close()
	}

}

/* Usando o switch-case */

import java.util.Scanner;
public class Main {
	public static void main (String[] args) {
		
			Scanner sc = new Scanner(System.in)
			int x = sc.nextInt() ;
			String dia;

			
			switch(x) {
				case 1:
					dia = "domingo";
					break;
				case 2:
					dia = "segunda";
					break;
				case 3:
					dia = "terça";
					break;
				case 4:
					dia = "quarta";
					break;
				case 5:
					dia = "quinta";
					break;
				case 6:
					dia = "sexta";
					break;
				case 7:
					dia = "sábado";
					break;
				default:
					dia = "valor invalido";
					break;
			}
			
			sc.close();
	}

}

/* Agora veremos a expressão condicional ternária */


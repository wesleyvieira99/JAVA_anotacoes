//Explicação do sisteminha abaixo//

//Fazer um programa para ler os dados de uma reserva de hotel (número do quarto, data
//de entrada e data de saída) e mostrar os dados da reserva, inclusive sua duração em
//dias. Em seguida, ler novas datas de entrada e saída, atualizar a reserva, e mostrar
//novamente a reserva com os dados atualizados. O programa não deve aceitar dados
//inválidos para a reserva, conforme as seguintes regras:
//- Alterações de reserva só podem ocorrer para datas futuras
//- A data de saída deve ser maior que a data de entrada



//////////////////////////////////////////
package model.exceptions;

//Criei dentro do meu pacote de exeções minha classe de Exceção "DomainException"
//Ela é filha das classes de exceção e retorna a mensagem de erro do pai.
public class DomainException extends Exception {
	public DomainException (String msg) {
		super(msg);
	}
}

//////////////////////////////////////////
package model.entities;

import model.exceptions;

	public class Reservation {
		private Integer room;
		private Date checkIn;
		private Date checkOut;
		
		private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		//Dentro do meu construtor é uma boa prática colocar um tratamento de exceção
		//"Throws" para dizer que a exceção será propagada para tratamento;
		//"throw new DomainException" para dizer que estou tratando meu erro.
		public Reservation (Integer room, Data checkIn, Date checkOut) throws DomainException{
			//.before e .after são métodos de datas para pegar o valor depois ou antes de uma data
			if (checkIn.before(now) || checkout.before(now)) {
				throw new DomainException("Data de reserva deve ser futura");
			}
			this.room = room;
			this.checkIn = checkIn;
			this.checkOut = checkOut;
		}
		
		//Aqui vai os getters e setters//
		
		
		//No código abaixo eu pego os milissegundos com "getTime" para calcular a diferença de datas,
		//Depois uso o "TimeUnit" para converter para dias o valor da difença que antes estava em milissegundos.
		public long duration() {
			long difer = checkOut.getTime() - checkIn.getTime();
			return TimeUnit.DAYS.convert(difer,TimeUnit.MILLISECONDS);
		}
		
		//o erro "DomainException" será tratado quando coloco o "throws";
		public void updateDates(Date checkIn, Date checkOut) throws DomainException {
			Date now = new Date();
			if (checkIn.before(now) || checkout.before(now)) {
				//tratando o erro;
				throw new DomainException("Data de reserva deve ser futura");
			}
			if (!checkOut.after(checkIn) {
				//tratando o erro;
				throw new DomainException("Check-out deve ser depois do check-in");
			}
			
			this.checkIn = checkOut;
			this.checkOut = checkOut;
		}
		
		@Override
		public String toString() {
			return "Room " 
				+ room + 
				", check-in: " +
				sdf.format(checkIn) + 
				", check-out: " + 
				sdf.format(checkOut) + 
				", " + duration() + " nigths.";
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
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		//Tentando executar sem erro.	
		try {
			System.out.print("Room number: ");
			int number = sc.nextInt();
			System.out.print("Check-in date: ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date: ");
			Date checkOut = sdf.parse(sc.next());
			
			Reservation reservation = new Reservation (number, checkIn, checkOut);
			System.out.printlin("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter datas to uptade: ");
			System.out.print("Room number: ");
			int number = sc.nextInt();
			System.out.print("Check-in date: ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date: ");
			Date checkOut = sdf.parse(sc.next());
			
			reservation.updateDates(checkIn, checkOut);
			System.out.printlin("Reservation updated: " + reservation);
		}
		//Caso haja erro de Parse
		catch (ParseException e) {
			System.out.println("Invalid date format");
		}
		//Caso haja erro de DomainException eu rodo o erro lançado (throw) no meu pacoto entities
		catch (DomainException e) {
			System.out.println("Error in reservation:" e.getMessage());
		}
		
	
		sc.close;
	}
}
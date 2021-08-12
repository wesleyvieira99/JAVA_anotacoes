package application;
import java.util.Date;
//Importação do Date.
import java.text.SimpleDateFormat;
//Importação do SimpleDateFormat.
import java.time.Instant;
//Importação do Instant.


public class Program {
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		//Instanciando um formato date
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		//Declarando a variável d do tipo Date uma data no formato UTC
		System.out.println(sdf.format(d));
		//Imprimindo na tela a data UTC no format de sdf (SimpleDateFormat)
		
		Calendar cal = Calendar.getInstance();
		//Declarando cal como Calendar, ou seja, criando um novo calendário
		cal.setTime(d);
		//setTime pega a data que está em d para colocar como calendário
		cal.add(Calendar.HOUR_OF_DAY,4);
		//Aqui eu acrescento quatro horas neste dia
		d = cal.getTime();
		//Atualizando minha variável d como esta nova data
		
		
		////////////////////////Obtendo uma unidade de tempo ///////////////////////////
		Calendar cal = Calendar.getInstance();
		//Declarando cal como Calendar, ou seja, criando um novo calendário
		cal.setTime(d);
		//setTime pega a data que está em d para colocar como calendário
		int minutes = cal.get(Calendar.MINUTE)
		//Pegar a quantidade de minutos e jogar para variável minutes
		
	}
}
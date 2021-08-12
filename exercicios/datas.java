package application;
import java.util.Date;
//Importação do Date.

public class Program {
	public static void main(String[] args) {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		//Aqui com essa classe eu estou instanciando meu objeto do tipo SimpleDateFormat com a data no formato
		//"dd/mm/yyyy"
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		//Aqui com essa classe eu estou instanciando meu objeto do tipo SimpleDateFormat com a data no formato
		//"dd/MM/yyyy HH:mm:ss"
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 12:43:07");
		//Cria data que quero no formato previamente instanciado
		
	}
}
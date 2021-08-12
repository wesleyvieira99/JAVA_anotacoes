public class Program {
	public static void main(String[] args) {
	
		String original = "abcde FGHIJ ABC abc DEFG   ";
		//Formatando uma string
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		//Recortando uma string
		String s04 = original.substring(2);
		String s05 = original.substring(2,7);
		// Substituindo em uma string
		String s06 = original.Replace('a','x');
		String s07 = original.Replace("abc", "xy");
		//Pegando o índice de letras de uma string
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		//Criando um vetor com base em uma string com um separador baseado no espaço (" ")
		String s = "potato apple lemon";
		String [] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		
	}
	
}
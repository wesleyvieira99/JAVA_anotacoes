package application;
import java.util.ArrayList;
import java.util.List;
public class Program {
	public static void main(String[] args) {
		
		List <String> lista = new ArrayList<>(); 
		//*Acima explicação:
		//- List<String> lista = Uma lista, com o tipo String (Sempre usar o Wrapper Classes), chamada "lista"
		//- new ArrayList<>() = Instanciação da Lista como uma classe ArrayList<>(), que mistura um pouco de Lista com Vetor
		
		lista.add("Maria");
		lista.add(2, "Marco");
		//*Acima explicação:
		//- Adicionando o elemento "Maria"
		//- Adicionando o elemento "Marco" na segunda posição
		
		lista.size();
		//*Acima explicação:
		//- Tamanho da lista
		
		lista.remove("Maria");
		lista.remove(2);
		//*Acima explicação:
		//- Removendo a Maria
		//- Removendo a posição 2
		
		lista.removeIf(x -> x.charAt(0) == 'M');
		//*Acima explicação:
		//- Pega um valor x tal que a sua primeira posição seja 'M' e remova, ou seja, remova todas que começem com 'M')
		
		lista.indexOf("Bob");
		//*Acima explicação:
		//- Vai trazer a posição do nome que escolhi. Quando não encontra o elemento, retorna -1.
		
		List<String> result = lista.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		//*Acima explicação:
		//- Nova lista de resultado com resultados do filtro.
		//- Deixar na lista só quem tem o nome que começe com M.
		//- Uso o stream para depois poder fazer o filtro e depois transformar o filtro em uma coleção do tipo Lista.
		
		String name = lista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		//*Acima explicação:
		//- Encontrar o primeiro elemento que começa com a letra A.
		//- Stream para poder fazer o filter e depois uso findFirts para pegar somente o primeiro elemento do filtro
		//- Caso não ache, returne nulo (orElse)
		
		
		
		
		


	}
}
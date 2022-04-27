package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.naming.spi.DirStateFactory.Result;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		// adiciona a lista os valores
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Bruno");
		list.add("Ana");
		list.add(2, "Marco");

		// mostra o tamanho da lista
		System.out.println(list.size());

		// o list tem a capacidade de remover comparado os valores
		list.remove("Ana");
		// ou por posição
		list.remove(1);

		// percorre por toda lista utilizando um apelido
		for (String x : list) {
			System.out.println("List : " + x);
		}

		System.out.println("-------------------");
		// deefinindo uma função lambda predicado ou seja ira remover todos que a
		// senteça for verdadeira no caso
		// todos que tem a primeira letra M
		list.removeIf(x -> x.charAt(0) == 'M');

		// percorre por toda lista utilizando um apelido
		for (String x : list) {
			System.out.println("List : " + x);
		}

		// traz a posição da lista
		System.out.println("-------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));

		// quando nao encontra o elemento em nehuma posição a funcao retorna -1
		System.out.println("Index of Ana: " + list.indexOf("Ana"));

		System.out.println("-------------------");
		// filtra todos que começa com a letra A
		// converte list para stream para utilizar funções lambda depois é necessario
		// converter para list novamente
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList());
		// irar percorrer pela nova lista trazendo somente as com parametros corretos
		for (String x : result) {
			System.out.println(x);
		}

		System.out.println("-------------------");
		//ira encontar o primeiro elemente contendo a primeira letra B caso nao encontre retornara null
		String name = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
		System.out.println(name);
	}

}

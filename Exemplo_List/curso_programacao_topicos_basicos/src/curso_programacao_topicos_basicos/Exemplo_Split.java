package curso_programacao_topicos_basicos;

public class Exemplo_Split {

	public static void main(String[] args) {
		//Entrada de dados 
		String s = "potato aplle lemon orange";
		//separador da string, retira da string e seta em um vetor utilizando como separador
		String[] vect = s.split(" ");
		//saida de dados
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);

	}

}

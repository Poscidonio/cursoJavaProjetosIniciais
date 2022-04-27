package curso_programacao_topicos_basicos;

public class Exemplo_Strings {

	public static void main(String[] args) {
		//entrada de dados
		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		//toda a String em minusculo
		String s01 = original.toLowerCase();
		//toda a String em maiusculo
		String s02 = original.toUpperCase();
		//retira os campos vazios antes e depois da String
		String s03 = original.trim();
		//inicia a String apos a posicao solicitada
		String s04 = original.substring(2);
		//inicia e termina a String nas posicoes solicitadas 
		String s05 = original.substring(2, 9);
		//troca a string desejada por outra 
		String s06 = original.replace('a', 'x');
		//troca um conjunto de String ou outra
		String s07 = original.replace("abc", "xy");
		//mostra a primeira posicao da string 
		int i = original.indexOf("bc");
		// mostra a ultima posicao
		int j = original.lastIndexOf("bc");
		
		//saida de dados
		System.out.println("Original: -" + original +"-");
		System.out.println("ToLoweCase: -" + s01 + "-");
		System.out.println("ToUpperCase: -" + s02 + "-");
		System.out.println("Trim: -" + s03 + "-");
		System.out.println("Substring(2): -" + s04 + "-");
		System.out.println("Substring(2, 9): -" + s05 + "-");
		System.out.println("Replace('a', 'x'): -" + s06 + "-");
		System.out.println("Replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last of 'bc': " + j);

	}

}

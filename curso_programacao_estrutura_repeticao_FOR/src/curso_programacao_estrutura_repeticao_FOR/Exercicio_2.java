package curso_programacao_estrutura_repeticao_FOR;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		//entrada de dados 
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de numeros desejados:");
		int n = sc.nextInt();
		int in = 0;
		int out = 0;
		//estrutura para o numero desejado
		for(int i = 0; i < n; i++) {
			//entrada de dados numero escolhidos para veficar o intervalo
			System.out.println("Digite um numero:");
			int x = sc.nextInt();
			//se estiver dentro do intervalo soma no contador
			if(x >= 10 && x <=20) {
				in = in +1;
			}
			//senao em outro contador 
			else{
				out = out +1;
			}
		}
		//saida de dados resultado
		System.out.println("A quantidade de numeros dentro do intervalo(in) e fora do intervalo(out) sao:");
		System.out.println(in+" in");
		System.out.println(out+" out");
		sc.close();

	}

}

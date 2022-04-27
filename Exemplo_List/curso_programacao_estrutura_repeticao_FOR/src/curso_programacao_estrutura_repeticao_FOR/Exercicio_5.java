package curso_programacao_estrutura_repeticao_FOR;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		//entrada de dados
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero:");
		int n = sc.nextInt();
		int fat = 1;
		
		//. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1
		for(int i = 1; i <= n; i++) {
			fat = fat * i;
			
		}
		//saida de dados definicao do fatorial desejado
		System.out.println("A definicao fatorial de "+n+" e " + fat);
		sc.close();
	}

}

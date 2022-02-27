package curso_programacao_estrutura_repeticao_FOR;

import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {
		//Entrada de dados 
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero:");
		int n = sc.nextInt();
		int n1 = 0;
		int n2 = 0;
		//para n repeticoes gera uma linha mostrando o numero da linha depois ao quadrado e ao cubo
		for(int i = 1; i <= n; i++) {
			n1 = i * i ;
			n2 = i * i * i;
			System.out.println(i + " " + n1 + " " + n2);
		}
		sc.close();
	}

}

package curso_programacao_estrutura_repeticao_FOR;

import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		// entrada de dados
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero:");
		int n = sc.nextInt();
		int div = 1;
		//calculando o resto da divisao para obter os divisores
		for(int i = 1; i <= n; i++) {
			div = n % i;
			if(div == 0) {
			System.out.println("Divisor " + i);
			}
		}
		sc.close();
	}

}

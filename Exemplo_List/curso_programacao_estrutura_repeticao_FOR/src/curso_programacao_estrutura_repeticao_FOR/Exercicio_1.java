package curso_programacao_estrutura_repeticao_FOR;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		// entrada de dados
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 1-Impar 2-Par:");
		int ip = sc.nextInt();
		System.out.println("Digite o numero desejado:");
		int x = sc.nextInt();
		// caso a opcao seja impar
		if (ip == 1) {
			for (int i = 0; i <= x; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}
			// caso a opcao seja par
		} else {
			for (int i = 0; i <= x; i++) {
				if (i % 2 == 0) {
					System.out.println(i);
				}
			}

		}
		sc.close();
	}
}

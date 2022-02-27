package curso_programacao_estrutura_repeticao;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Entrada de dados
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a senha:");
		int senha = sc.nextInt();

		// Faca enquanto a senha for diferente de 2002
		while (senha != 2002) {
			System.out.println("Senha Invalida");
			System.out.println("Digite a senha:");
			senha = sc.nextInt();
		}
		// caso senha for igual a 2002 e encerra
		System.out.println("Acesso Permitido");
		sc.close();
	}

}

package curso_programacao_estrutura_repeticao;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Entradad de dados
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a coordenada de X:");
		int x = sc.nextInt();

		System.out.println("Digite a coordenada de Y:");
		int y = sc.nextInt();

		// enquanto x e y for diferente de 0 executa
		while (x != 0 && y != 0) {
			// imprime coordenadas e qual quadrante se encaixa
			if (x > 0 && y > 0) {
				System.out.println("As coordenadas pertencem ao PRIMEIRO quadrante.");
			} else if (x > 0 && y < 0) {
				System.out.println("As coordenadas pertencem ao QUARTO quadrante.");

			} else if (x < 0 && y < 0) {
				System.out.println("As coordenadas pertencem ao TERCEIRO quadrante.");

			} else {
				System.out.println("As coordenadas pertencem ao SEGUNDO quadrante.");
			}
			// Entrada de dados em repeticao ate que x e y nao for 0
			System.out.println("Digite a coordenada de X:");
			x = sc.nextInt();

			System.out.println("Digite a coordenada de Y:");
			y = sc.nextInt();
		}
		sc.close();

	}

}

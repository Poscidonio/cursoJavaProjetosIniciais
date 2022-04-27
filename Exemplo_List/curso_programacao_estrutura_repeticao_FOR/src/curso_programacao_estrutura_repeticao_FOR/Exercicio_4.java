package curso_programacao_estrutura_repeticao_FOR;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero de repeticoes:");
		int n = sc.nextInt();
		double div = 0;
		for(int i = 0; i < n; i++) {
			System.out.println("Digite o primeiro valor:");
			double n1 = sc.nextDouble();
			System.out.println("Digite o segundo valor:");
			double n2 = sc.nextDouble();
			
			if(n2 == 0) {
				System.out.println("Divisao impossivel");
			}
			else {
			div = n1/n2;
			System.out.printf("O valor da divisao e:%.1f%n", div);
			}
			
		}
		sc.close();
	}

}

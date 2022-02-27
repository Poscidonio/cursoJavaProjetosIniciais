package curso_programacao_estrutura_repeticao_FOR;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		//entrada de dados numero de repeticoes
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero de repeticoes:");
		int n = sc.nextInt();
		double med = 0;
		// estrutura de repeticao utilizando a quantidade de vezes desejada 
		for(int i = 0; i < n; i++) {
			//entrada de dados valores desejados para calcular a media ponderada
			System.out.println("Digite 3 valores reais:");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double z = sc.nextDouble();
			//media ponderada
			med = ((x * 2) + (y * 3) + (z * 5)) / (3 + 2 + 5);
			System.out.printf("A media ponderada dos valores digitado e: %.1f%n.",med);
		}
	sc.close();	
	}
	

}

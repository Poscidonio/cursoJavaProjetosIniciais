package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rows size: ");
		int m = sc.nextInt();
		System.out.println("Enter columns size: ");
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		// cria a matriz
		for(int i = 0; i < mat.length; i++) {
			System.out.println("Enter with the value: ");
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		//entra com o numero digitado e percorre pela matriz
		System.out.println("Enter wiht the number and serch your position: ");
		int x = sc.nextInt();
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				//caso o numero for igual a algum na matriz ele faz
				if(mat[i][j] == x) {
					//mostra a posição 
					System.out.println("Position " + i + "," + j + ":");
					//se a coluna for maior que 0 ele exibe a matriz retirando uma linha para
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					//se a linha for maior que 0 exibe a matriz retirando uma linha
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					//se a coluna for menor que a posição na matriz exibe retirando uma posição a matriz somando mais uma coluna 
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					//se a linha for menor que a posição na matriz retirando uma posição exibe a matriz somando mais uma linha 
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}

}

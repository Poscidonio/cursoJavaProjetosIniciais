package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size: ");
		int n = sc.nextInt();
		//declarando a matriz
		int [][] mat = new int[n][n];
		//lendo a matriz de acordo com o tamanho
		for(int i = 0; i < mat.length; i++) {
			System.out.println("Enter with value: ");
			for(int j = 0; j < mat.length; j++) {
				mat[i][j] = sc.nextInt();
				}
		}
		//imprime a linha diagonal como coincide as posições de i basta 
		//apenas mostrar as linhas e colunas com a mesma posição
		System.out.println("Main diagonal: ");
		for(int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		//contador para mostras a quantidade de numeros negativos na matriz
		int count = 0;
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat.length; j++) {
				if(mat[i][j] < 0) {
				count++;	
				}
			}
		}
		System.out.println("\n Negative numbers: " + count);
		sc.close();
	}

}

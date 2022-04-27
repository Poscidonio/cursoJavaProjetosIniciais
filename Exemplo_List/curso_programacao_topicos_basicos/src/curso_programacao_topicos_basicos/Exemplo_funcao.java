package curso_programacao_topicos_basicos;

import java.util.Scanner;

public class Exemplo_funcao {

	public static void main(String[] args) {
		//entrada de dados
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 3 numeros");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		//chamando a funcao com retorno de valor 
		int higher = max(a, b ,c);
		//chamando um funcao com uma acao sem retorno de valor 
		showResult(higher);
		
		sc.close();

	}
	//funcao que recebe os valores e retorna o resultado podendo ser aproveitado novamente
	public static int max(int x, int y, int z) {
		int aux;
		if(x > y && x > z) {
			aux = x;
			
		}else if(y > z) {
			aux = y;
		
		}else {
			aux = z;
		}
		return aux;	
	}
	//funcao de acao retorna uma execucao
	public static void showResult(int value) {
		System.out.println("O maior e = " + value);	
	}
}

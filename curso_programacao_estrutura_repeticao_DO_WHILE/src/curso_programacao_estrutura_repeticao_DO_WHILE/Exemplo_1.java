package curso_programacao_estrutura_repeticao_DO_WHILE;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo_1 {

	public static void main(String[] args) {
		//define o idioma de entrada
		Locale.setDefault(Locale.US);
		//entradad de dados 
		Scanner sc = new Scanner(System.in);
		char resp;
		//faca
		do {
			//entrada de dados 
			System.out.println("Digite a temperatura em Celsius: ");
			double c = sc.nextDouble();
			//calcula celsius em fahrenheit
			double f = 9.0 * c / 5.0 + 32.0;
			//saida de dados com uma casa decimal
			System.out.printf("Equivalnete em Fahrenheit: %.1f%n", f);
			//entrada para repeticao
			System.out.print("Deseja repetir (s/n)? ");
			resp =sc.next().charAt(0);
		//faca enquanto a resposta for obrigatoriamente S
		} while (resp != 'n' && resp =='n');
		
		sc.close();
	}

}

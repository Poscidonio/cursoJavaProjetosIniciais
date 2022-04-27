package curso_programacao_intro_comOrientacaoObjeto;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Exemplo_comOrientacaoObj {

	public static void main(String[] args) {

		//Entrada de dados
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Chamando o atributo do triangulo
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Entre com as medidas dos trinagulos:");
		System.out.println("Primeira medida de X:");
		x.a = sc.nextDouble();
		System.out.println("Segunda medida de X:");
		x.b = sc.nextDouble();
		System.out.println("Terceira medida de X:");
		x.c = sc.nextDouble();
		
		System.out.println("Entre com as medidas dos trinagulos:");
		System.out.println("Primeira medida de Y:");
		y.a = sc.nextDouble();
		System.out.println("Segunda medida de Y:");
		y.b = sc.nextDouble();
		System.out.println("Terceira medida de Y:");
		y.c = sc.nextDouble();
		
		//chama o metodo para calcular o triangulo passando o valor de x ou y
		double areaX = x.area();
		double areaY = y.area();
		
		//saida de dados
		System.out.printf("A area do triangulo X e: %.4f%n", areaX);
		System.out.printf("A area do triangulo Y e: %.4f%n", areaY);
		
		//verifica qual triangulo é maior
		if(areaX > areaY) {
			System.out.println("A maior area e do triangulo: X");
		}else {
			System.out.println("A maior area e do triangulo: Y");
		}
		sc.close();

	}

}

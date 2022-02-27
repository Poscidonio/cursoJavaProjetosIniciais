package curso_programacao_intro_semOrientacaoObjeto;

import java.util.Locale;
import java.util.Scanner;


public class Exemplo_semOrientacaoObj {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Entre com as medidas dos trinagulos:");
		System.out.println("Primeira medida de X:");
		xA = sc.nextDouble();
		System.out.println("Segunda medida de X:");
		xB = sc.nextDouble();
		System.out.println("Terceira medida de X:");
		xC = sc.nextDouble();
		
		System.out.println("Entre com as medidas dos trinagulos:");
		System.out.println("Primeira medida de Y:");
		yA = sc.nextDouble();
		System.out.println("Segunda medida de Y:");
		yB = sc.nextDouble();
		System.out.println("Terceira medida de Y:");
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		
		System.out.printf("A area do triangulo X e: %.4f%n", areaX);
		System.out.printf("A area do triangulo Y e: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("A maior area e do triangulo: X");
		}else {
			System.out.println("A maior area e do triangulo: Y");
		}
		sc.close();

	}

}

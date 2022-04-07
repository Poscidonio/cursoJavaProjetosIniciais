package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Vector;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter with of th simze vector: ");
		int n = sc.nextInt();
		Vector[] vect = new Vector[n];

		
		//for (int i = 0; i < n; i++) { // as duas maneiras estao corretas porem com o length é percorrido diretamente com o tamanho do vetor sem uma variavel extra
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Enter with the name: " + "position vector [" + i + "]");
			//usado para consumir a quebra de linha do nextInt
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.println("Enter with the price: " + "position vector [" + i + "]");
			double price = sc.nextDouble();
			
			vect[i] = new Vector(name, price);
		}
		
		//faz a somatoria dos precos
		double sum = 0.0;
		for(int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();			
		}
		
		//calcula o preco medio
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);

		sc.close();
	}

}

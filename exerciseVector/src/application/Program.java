package application;

import java.io.ObjectInputStream.GetField;
import java.util.Locale;
import java.util.Scanner;

import entities.Vector;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("how many BedRooms will be rented? ");
		int n = sc.nextInt();

		Vector[] vect = new Vector[10];

//neste caso nao é correto usar o vect.lenght como o vetor possui 10 posições ele repetira ate completar as 10 vezes 
		for (int i = 0; i < n; i++) {
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			// usado para consumir a quebra de linha do nextInt
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Bedroom: ");
			int bedRoom = sc.nextInt();
			// ao invez de utilizar o i para alocar na posição do vetor é o usado a variavel
			// para setar a posicao correta para apontar para o heap
			vect[bedRoom] = new Vector(name, email, bedRoom);

		}

		System.out.println("BUSY ROOMS:");

		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i]);
			}
		}
		sc.close();
	}

}

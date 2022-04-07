package exercicioFixacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bank bank;

		System.out.println("Create your bank account:");
		System.out.print("Enter wiht your number account: ");
		int account = sc.nextInt();
		System.out.print("Enter with your name: ");
		// necessario para consumir a quebra de linha que foi gerada pelo nextInt();
		sc.nextLine();
		String name = sc.nextLine();

		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {

			System.out.print("Enter with the first deposit amount: ");
			double firstValueDeposit = sc.nextDouble();
			bank = new Bank(account, name, firstValueDeposit);

		} else {

			bank = new Bank(account, name);

		}
		System.out.println("\n");
		System.out.println("Account information: ");
		System.out.println(bank + "\n");

		System.out.print("Enter the deposit amount: ");
		double deposit = sc.nextDouble();
		bank.deposit(deposit);

		System.out.println("Account information: ");
		System.out.println(bank + "\n");

		System.out.print("Enter thr value withdraw deposit: ");
		double withdrawValueDeposit = sc.nextDouble();
		bank.withdrawDeposit(withdrawValueDeposit);

		System.out.println("Account information: ");
		System.out.println(bank + "\n");

		sc.close();

	}

}

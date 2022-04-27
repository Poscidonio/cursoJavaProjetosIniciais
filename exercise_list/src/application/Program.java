package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();
		
		System.out.println("How many employee will be registered? ");
		int n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			System.out.println("Employee #" + i + ":");
			System.out.print("ID :");
			int id = sc.nextInt();
			while (hasId(list, id)){
				System.out.println("Id alredy taken. Try again: ");
				id = sc.nextInt();
			}
			System.out.print("Name :");
			String name = sc.nextLine();
			System.out.print("Salary :");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));
		}
		System.out.print("Enter the employee id that will have sallary increse :");
		int localeId = sc.nextInt(); 
		Employee emp = list.stream().filter(x -> x.getId() == localeId).findFirst().orElse(null);
		
		if(emp == null) {
			System.out.println("This ID does not exist!!!");
		} else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println("\n List of employees: ");
		for(Employee obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}

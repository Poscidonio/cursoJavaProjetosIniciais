package orientacaoObjeto_exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Grade;

public class ProgramGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Grade grade = new Grade();
		
		System.out.println("Name :");
		grade.name = sc.nextLine();
		System.out.println("Grade 1 :");
		grade.n1 = sc.nextDouble();
		System.out.println("Grade 2 :");
		grade.n2 = sc.nextDouble();
		System.out.println("Grade 3 :");
		grade.n3 = sc.nextDouble();
		
		System.out.printf("Final grade : %.2f%n" , grade.sumGrades());
		 
		if(grade.sumGrades() > 60) {
			System.out.println("PASS !");
		} else {
		System.out.println("FAILED !");
		System.out.printf("Missing %.2f points%n" , grade.missingPoints());
		}
		sc.close();

	}

}

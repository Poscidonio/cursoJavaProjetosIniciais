package orientacaoObjeto_exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class ProgramRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// criando um novo obejto
		Rectangle rectangle = new Rectangle();

		System.out.println("Enter with value of rectangle width: ");
		rectangle.width = sc.nextDouble();

		System.out.println("Enter with value of rectangle height: ");
		rectangle.height = sc.nextDouble();

		System.out.println("Area :" + rectangle.area());

		System.out.println("Perimeter : " + rectangle.perimeter());

		System.out.println("Diagonal : " + rectangle.diagonal());

		sc.close();
	}

}

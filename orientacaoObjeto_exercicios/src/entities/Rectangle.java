package entities;

public class Rectangle {

	// atributos do retangulo
	public double width; // largura
	public double height; // altura

	// area largura * altura
	public double area() {
		return width * height;
	}

	// perimetro do retangulo 2 * (largura + altura)
	public double perimeter() {
		return 2 * (width + height);
	}

	// diagonal calculo raiz((largura^2) + (altura^2));
	public double diagonal() {
		return Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
	}

}

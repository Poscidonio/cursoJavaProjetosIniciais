package entities;
//classe triangulo com atributos e metodos para calcular sua area
//atributos
//Alteracao para teste de commit
public class Triangulo {
	public double a;
	public double b;
	public double c;
	
	//funcao/operacao para ser usada em outros arquivos
	public double area() {
		double p = (a + b + c) / 2.0;
		double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return result;
	}

}

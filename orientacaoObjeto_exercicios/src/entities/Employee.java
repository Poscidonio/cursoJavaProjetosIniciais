package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;

	// retira a taxa do salario bruto
	public double netSalary() {
		return grossSalary - tax;
	}

	//atualiza o salario com a porcentagem digitada somando-a no salario bruto 
	public void increseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100;
	}

	// edita a class string da forma desejada no caso mostra o simbolo de $ e o salario com duas casas decimais
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}

}

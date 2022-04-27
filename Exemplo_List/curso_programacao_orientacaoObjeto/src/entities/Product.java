package entities;

public class Product {

	// atributos da classe
	private String name;
	private double price;
	private int quantity;

	public Product() {

	}

	// contrutor nao tem tipo de retorno e executa a instanciação do objeto(obriga a
	// receber os parametros)
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;

	}

	// sobre carga quando ha mais de uma opção para o mesmo contrutor com parametros
	// diferentes
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		// nao é necessario declarar ja que o contrutor nao esta pedindo
		// this.quantity = quantity;

	}

	// encapsulamento getters e setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}

	// metodo comum com tipo de retorno
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		// o this referencia ao atributo da classe
		// seria a mesma coisa que this.quantity = quantity + 1;
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		// seria a mesma coisa que this.quantity = quantity - 1;
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}

}

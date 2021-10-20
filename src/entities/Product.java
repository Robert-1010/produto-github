package entities;

public class Product {
	
	//Atributos encapsulados. o menbro so podera acessado na própria classe
    String name;
	private double price;
	private int quantity;
	
	//Construtor padrão
	public Product() {
	}
	//Construtor
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	//Construtor sobrecarga
	public Product(String name, double price) {
		this.name = name;
		this.price = price;;
	}
	
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
    //não possui setQuantity pois so será alterada pelos metodos de entrada e saída no estoque
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	//Metodo para converter objetos para String
	public String toString() {
		return name + ", $ "+String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
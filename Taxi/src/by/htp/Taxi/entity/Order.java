package by.htp.Taxi.entity;

public class Order {

	private String name;
	private Transport[] Tpark;
	private double price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Transport[] getTpark() {
		return Tpark;
	}
	public void setTpark(Transport[] tpark) {
		Tpark = tpark;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}

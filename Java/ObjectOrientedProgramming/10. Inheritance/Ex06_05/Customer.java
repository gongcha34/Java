
public class Customer {
	
	protected String name;
	protected String grade;
	protected double price;
	
	
	 public Customer(String name) {
		this.name = name;
		this.grade = "SILVER";
	}

	
	public void setPrice(double price) {
		this.price = price;
	}

	public double calcPrice(double price) {
		return price;
	}
}

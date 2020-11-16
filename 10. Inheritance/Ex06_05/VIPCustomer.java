
public class VIPCustomer extends Customer {
	private double priceRatio; //할인율
	
	public VIPCustomer(String name) {
		super(name);

		this.grade = "VIP";
		this.priceRatio = 0.05;
		price = 0;
	}
	
	public double getPrice() {
		return price;
	}

	// 오버라이딩
	public double calcPrice(double p) {
		return price -= p*priceRatio;
	}


}

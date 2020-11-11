
public class Car {
	private String company;
	private String model;
	private String year;
	private int maxSpeed;
	private int currentSpeed;
	
	private int fuel;
	
	public Car(String company, String model, String year, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.year = year;
		this.maxSpeed = maxSpeed;
		this.fuel = 0;
		this.currentSpeed = 0;
	}

	public String getCompany() {
		return company;
	}

	public String getModel() {
		return model;
	}

	public String getYear() {
		return year;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setFuel(int fuel) {
		this.fuel = fuel;
	}
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	
	public void run(int speed) {
		currentSpeed += speed;
		if(currentSpeed > maxSpeed) {
			currentSpeed = maxSpeed;
		}
		else if(currentSpeed < 0) {
			currentSpeed = 0;
		}
	}
}

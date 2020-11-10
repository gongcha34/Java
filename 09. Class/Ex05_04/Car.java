
public class Car{
	// 필드
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int productionYear;
	private int currentSpeed;
	
	// 생산자
	Car(){
		company = "현대자동차";
		model = "그랜저";
		color = "검정색";
		maxSpeed = 300;
		productionYear = 2010;
		currentSpeed = 0;
	}
	
	Car(String cmpy, String mod, String col, int ms, int py){
		company = cmpy;
		model = mod;
		color = col;
		maxSpeed = ms;
		productionYear = py;
		currentSpeed = 0;
	}
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed1) {
	if (maxSpeed1 <= 200)
		this.maxSpeed = maxSpeed1;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
			this.currentSpeed = currentSpeed;
	}

	// 메소드
	int getcurrentSpeed() {
		return maxSpeed;
	}
	void keyTurnOn() {
		System.out.println("Key Turn On");
	}
	void run() {
		for(int i = 10; i <= maxSpeed; i += 10) {
			currentSpeed = i;
			System.out.println("Running at " + currentSpeed + "Km/h");
		}
	}
	
}

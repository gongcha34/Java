
public class Car {
	// 필드 선언
	// 변경되지 않는 정보
	private String company;
	private String model;
	private String maxSpeed;
	private String fuel; //연료
	
	// 변경될 수 있는 정보
	private String color;
	private String engine;
	private String tire;
	private int mileage; //주행거리
	
	// 생성자 변경되지 않는 정보
	public Car(String company, String model, String maxSpeed, String fuel, String color) {
		this.company = company;
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.fuel = fuel;
		this.color = color;
	}
	// 생성자 변경될 수 있는 정보
	public Car(String company, String model, String maxSpeed, String fuel, String color, String engine, String tire, int mileage) {
		this.company = company;
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.fuel = fuel;
		this.color = color;
		this.engine = engine;
		this.tire = tire;
		this.mileage = mileage;
	}
	
	// getter와 setter 구문
	public String getCompany() {
		return company;
	}

	public String getModel() {
		return model;
	}

	public String getMaxSpeed() {
		return maxSpeed;
	}
	public String getFuel() {
		return fuel;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		String str = null;
		switch(color) {
		case "블루":
			str = "blue";
			break;
		case "검정":
			str = "black";
			break;
		case "레드":
			str = "red";
			break;
		default :
			str = "없는 색상입니다.";
			break;
		}
		this.color = str;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getTire() {
		return tire;
	}

	public void setTire(String tire) {
		this.tire = tire;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	// 메소드
	public void displayCar() {
		System.out.printf("제작회사 : %s, 모델: %s, 최고속도: %s, 색상: %s\n",company, model, maxSpeed, color);
	}
	public void displayVariableCar() {
		System.out.printf("제작회사 : %s, 모델: %s, 최고속도: %s, 색상: %s, 엔진: %s, 타이어: %s, 주행거리: %d\n",company, model, maxSpeed, color, engine, tire, mileage);
	}
	public String showVairableInfo() {
		return "이 차의 정보가 변경되었습니다. 엔진 : " + engine + ", 타이어 : " + tire + ", 현재 주행거리는 " + mileage + "입니다."; 
	}
	
}

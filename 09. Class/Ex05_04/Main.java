
public class Main {

	public static void main(String[] args) {
		
		// 객체 생성
		Car car3 = new Car("현대자동차", "모델2", "검정", 200, 2020);
		// 필드값 읽기
		
		System.out.println(car3.getCompany());
		System.out.println(car3.getModel());
		System.out.println(car3.getColor());
		System.out.println(car3.getMaxSpeed());
		System.out.println(car3.getProductionYear());
		System.out.println(car3.getCurrentSpeed());
		car3.setMaxSpeed(120);
		System.out.println(car3.getMaxSpeed());
		
		//메소드 호출
		car3.keyTurnOn();
		car3.run();
		int speed = car3.getcurrentSpeed(); 
		//생성자 안에 필드 초기값 호출 car3.maxSpeed(안좋은방법) 
		//메소드 안에 필드값 리턴 car3.getSpeed();
		System.out.println(speed);
		
	}

}

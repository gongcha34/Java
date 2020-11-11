import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Car 클래스
		// (기본) 변경되지 않는 정보만 출력.
		Car car = new Car("현대자동차", "아반떼", "300","가솔린, LPG", "blue");
		car.displayCar();
		System.out.println("------------------------------------------------------------------");
		// switch문을 이용해서 setter 값 전달하기.
		/*
		 	Car car2 = new Car("현대자동차", "쏘나타", "300","가솔린, LPG", "black");
			car2.setColor("옐로우"); // setter switch를 이용해 잘못된 값을 입력하면 default값 출력하기
			car2.displayCar(); 
		 */
		System.out.println("------------------------------------------------------------------");
		// (Main 클래스안에서) 메소드를 변수에 담아 값 출력하기 
		car.setColor("검정"); // setter if문을 이용하여 검정을 입력시 black으로 출력
		car.displayCar();
		car.setEngine("엔진001");
		car.setTire("타이어003");
		car.setMileage(1000);
		String engine = car.getEngine();
		String tire = car.getTire();
		int mileage = car.getMileage();
	    System.out.printf("엔진: %s, 타이어: %s, 주행거리: %d\n",
			   			  engine, tire, mileage);
	    car.displayVariableCar();
		System.out.println("------------------------------------------------------------------");
		// 메소드만 이용해서 값 출력하기.
		Car car3 = new Car("현대자동차", "그랜저", "300","가솔린, LPG", "red", "001엔진", "001타이어", 1000);
		car3.displayVariableCar();
		car3.setEngine("004엔진");
		car3.setTire("006타이어");
		car3.setMileage(2000);
		System.out.println(car3.showVairableInfo());
		
		
		
		
		
		// Driver 클래스
		// 운전자 정보 자동 출력하기
		Driver driver[] = new Driver[10]; 
		for(int i = 0; i < driver.length; ++i) {
			driver[i] = new Driver("홍길동", i , "대한민국", "010-1234-5678");
			driver[i].setId(i);
			driver[i].show();
		}
		
		//운전자 정보 수동 출력하기
		Scanner scan = new Scanner (System.in);
		System.out.print("총 몇명의 운전자 정보를 입력하시겠습니까 ? >");
		int number = scan.nextInt(); // 사용자의 입력값을 number에 담기
		Driver[] driverInfo = new Driver[number];
		
	
		for(int i = 0; i < number; ++i) {
			// 변수 선언
			String Dname;
			String Dtel;
			int Id = i;
			String adress = "대한민국";
			
			System.out.print("운전자의 성함을 입력하세요 : ");
			Dname = scan.next();
			
			System.out.print("운전자의 번호를 입력하세요 : ");
			Dtel = scan.next();
			
			
			//초기화
			driverInfo[i] = new Driver(Dname, Id ,adress, Dtel);
		}
		
		for(int i = 0; i < number; i++) 
		{
			driverInfo[i].show();
		}
	}
}

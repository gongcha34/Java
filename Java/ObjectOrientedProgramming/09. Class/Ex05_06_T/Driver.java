import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car("현대", "그랜저", "2020", 350);
		Scanner s = new Scanner(System.in);
		int speed = 0;
		System.out.println("차량 정보 : " + myCar.getCompany() + ", " + myCar.getModel() + ", " + myCar.getYear());
		System.out.println("주행을 시작합니다.");
		while(true) {
			System.out.print("속도를 입력하세요 : ");
			speed = s.nextInt();
			myCar.run(speed);
			int currentSpeed = myCar.getCurrentSpeed(); 
			System.out.println("현재 속도 : " + currentSpeed);
			if(currentSpeed == myCar.getMaxSpeed())
				System.out.println("속도를 줄이세요....");
			if(currentSpeed <= 0)
				break;
		}
		System.out.println("주행을 종료합니다.");
	}

}

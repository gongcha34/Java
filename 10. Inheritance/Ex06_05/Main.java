import java.util.Scanner;

public class Main {
	// static 선언
	static Computer computer = new Computer();
	static Scanner scan = new Scanner(System.in);
	static String str = null;
	static int choice = 0;
	
	public static void main(String[] args) {
		// 메인 클래스 인스턴스 생성
		Main main = new Main();
		
		// 상위클래스 데이터타입으로 오버라이딩 사용하기
		// == login ==
		Customer login = new VIPCustomer("Kim");
		//Customer login = new Customer("Lee");
		
		System.out.println(login.name + "님 안녕하세요.");
		System.out.println("차량 정보 검색 서비스입니다.");
		computer.systemOn();
		
		while(computer.state()) {
			System.out.println("======================================");
				System.out.println("1. 자동차 정보 검색 | 2. 가격 검색");
				System.out.print("숫자를 입력하세요.>");
				choice = scan.nextInt(); 
				// (1) 자동차 정보 검색
				if(choice == 1) {
					// 목표 (1-1) 하위 클래스에서 상위클래스 메소드 사용하기 > displayCar();
					// 목표 (1-2) 하위 클래스 메소드 사용하기 > conaInfo();, venyuInfo();
					// 목표 (1-3) equals 이용하기
					
					// 문제점: 데이터 타입 Car sCar = new CompactCar();을 사용할 수 없음
					// 원인 : conaInfo(), venyuInfo()
					System.out.println("======================================");
					System.out.println("소형차 | 중형차 | 대형차");
					System.out.print("문자로 입력하세요 >");
					str = scan.next();
				
				    if(str.equals("소형차")) {
						//소형차(하위클래스) 인스턴스 생성
						CompactCar sCar = new CompactCar();
						//상위 클래스 메소드 사용
						sCar.displayCar(); //CompactCar 메서드에 displayCar()가 없어도 실행됨
						
						System.out.println("자동차 정보 : 1. 코나 | 2. 베뉴");
						System.out.print("문자로 입력하세요 >");
						str = scan.next(); 
						if(str.equals("코나"))
							sCar.conaInfo();
						else if (str.equals("베뉴"))
							sCar.venyuInfo();
						else
							System.out.println("정보가 없습니다.");
						
						main.selectAgain();
						choice = scan.nextInt();
						if (choice == 2) 
							main.turnOff(); //turnOff 메서드로 중복 코드 피하기
							continue;
					} else {
						main.turnOff();
					}
				// (2) 가격 검색
				} else if (choice == 2) {
					//목표 (2-1) 오버라이딩 사용하기
					//일반 고객 할인 0%, VIP 고객 할인 0.05%
					//main.turnOff();
					
					System.out.println("======================================");
					System.out.print("가격을 입력하세요 >");
					choice = scan.nextInt();
					if (choice >= 25000000 && choice <= 30000000) {
						System.out.println();
						System.out.println(">>" + choice + "원 이하 검색 결과입니다.");
						System.out.println();
						System.out.println("1) 코나(소형차)");
						System.out.println("정상가 : 29,960,000,원");
						login.setPrice(2996000);
						double price = login.calcPrice(2996000);
						System.out.println();
						System.out.println("* " + login.name + "님은 " + login.grade + " 고객입니다." );
						System.out.println("* 구매 가격 : " + price + "원입니다.");
						System.out.println();
					}  else {
						System.out.println("검색결과가 없습니다.");
					}
					main.selectAgain();
					choice = scan.nextInt();
					if (choice == 2) 
						main.turnOff(); //turnOff 메서드로 중복 코드 피하기
						continue;
						
				//시스템 종료		
				} else {
					main.turnOff();
				}
		}
	}
	
	public void selectAgain() {
		System.out.println("======================================");
		System.out.println("1. 다른 정보 검색하기 | 2. 시스템 종료하기");
		System.out.print("숫자를 입력하세요.>");
	}
	
	public void turnOff() {
		computer.systemOff();
		System.out.println("****** 시스템 종료합니다. ******");
	}
}

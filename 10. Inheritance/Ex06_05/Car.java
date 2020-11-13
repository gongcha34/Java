
public class Car {
	
	// 필드선언
	// 차량 기본 정보
	protected String type;
	protected double displacementVolume;
	protected double length; 
	protected double width;
	protected double height; 
	protected double price;

	public double getPrice() {
		return price;
	}
	
	//필드에 값을 받으면 출력하는 메서드
	public void displayCar() {
		System.out.println();
		System.out.printf("****** %s 기준 ******\n", type);
		System.out.printf("배기량:  %1.2fcc미만, 길이:  %1.2fcm이하, 너비: %1.2fcm이하, 높이:  %1.2fcm이하\n" ,displacementVolume, length, width, height);
	}
	
	
}

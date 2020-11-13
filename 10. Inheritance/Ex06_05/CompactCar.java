
public class CompactCar extends Car {
	
	public CompactCar() {
		this.displacementVolume = 1600;
		this.length = 470;
		this.width = 170;
		this.height = 200;
		
		this.type = "소형차";
	}
	
	// CompactCar 클래스에만 있는 메서드
	public void conaInfo() {
		System.out.println();
		System.out.println("= 차량 정보 =");
		System.out.println("코나");
		System.out.println("출시가: 2,031~2,996만원");
		System.out.println("연비: 11.6~13.9km/ℓ");
		System.out.println("연료: 가솔린");
		System.out.println("출력: 198hp");
	}
	
	public void venyuInfo() {
		System.out.println();
		System.out.println("= 차량 정보 =");
		System.out.println("베뉴");
		System.out.println("출시가: 1,662~2,148만원");
		System.out.println("연비: 13.3~13.7km/ℓ");
		System.out.println("연료: 가솔린");
		System.out.println("출력: 123hp");
	}
	
}


public class SwitchNoBreakVaseExample {

	public static void main(String[] args) {
		// break문이 없는 case
		// 해당 case부터 조건문이 끝나기까지 연산 모두 포함되어 결과값을 도출시킨다.
		
		int time = (int)(Math.random()*4) + 8;
		System.out.println("[현재시간: " + time + " 시");

		switch(time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 합니다.");
		default:
			System.out.println("외근을 나갑니다.");
		}
	}

}

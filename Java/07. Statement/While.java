import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// while문
		Scanner scanner = new Scanner(System.in);
		int value;
		System.out.print("10 보다 큰 숫자를 입력하세요. : ");
		value = scanner.nextInt();
		
		while(value <= 10) {
			System.out.print("잘못 입력하셨습니다. 10 보다 큰 숫자를 입력하세요. : ");
			value = scanner.nextInt();
		}
		
		System.out.printf("감사합니다 %d를 입력하셨습니다.\n", value);
		scanner.close();
	}

}

import java.util.Scanner;

public class ForEx3 {

	public static void main(String[] args) {
			
		// 실습3
			int score;
			int rate;
			String result;
			score = 89;
			Scanner scanner = new Scanner(System.in);
			
			do {
				System.out.print("점수를 입력하세요 (999점이면 프로그램을 종료합니다) : ");
				score = scanner.nextInt();
				if(score == 999)
					break;	// if문에서 나가는게 아니므로 do while에서 나가는 것!
				
				if(score > 90) 
					rate = 1;
				else if (score > 80)
					rate = 2;
				else if (score > 70)
					rate = 3;
				else
					rate = 4;
				
				switch(rate) {
				case 1:
					result = "아주 훌륭합니다.";
					break;
				case 2:
					result = "참 잘했어요.";
					break;
				case 3:
					result = "좋습니다.";
					break;
				default:
					result = "분발하세요.";
				}
				
				System.out.println(result);
			} while(true);
			
			System.out.println("프로그램을 종료합니다!");
			
			
	}

}

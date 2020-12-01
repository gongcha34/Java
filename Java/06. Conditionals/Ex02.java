
public class Ex02 {

	public static void main(String[] args) {
		// 실습2
		int score;
		int rate;
		String result;
		score = 89;
		
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

	}

}

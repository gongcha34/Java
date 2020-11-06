
public class Main {

	public static void main(String[] args) {
		// if문
		int score;
		String result;
		score = 89;
		
		if(score > 90)
			result = "아주 훌륭합니다.";
		else if(score > 80)
			result = "참 잘했어요.";
		else if(score > 0)
			result = "졸습니다.";
		else
			result = "분발하세요.";
		
		System.out.println(result);
		
	}

}

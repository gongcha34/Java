import java.util.Scanner;

public class WordProcessor {

	public static void main(String[] args) {

		// 맞춤법 검사기 프로그래밍
		String[] wordsCheck = {"칠흑", "실락원", "고기국", "회계연도", "test"};
		String[] correct;
		
		SpellingCheckerImpl spellingchecker1 = new SpellingCheckerImpl();
		Dictionary dic = spellingchecker1; 
		 
		correct = sc1.correction(); //wordsCheck와 correctWords 비교해서 같은 값 추출하기 {"칠흑","회계연도", "test", "null", "null"}
		
		Scanner scan = new Scanner(System.in);
		String str;
	
		System.out.println("-----맞춤법 검사기-----");
		System.out.println("검사하기 : ");
		str = scan.next();
		
		for (int i = 0; i < correct.length; ++i)  {
			String result = null;					
			if(str != correct[i]) {					
				result = dic.find(str);				
				System.out.println(result);	
				break;								
			}
		}
	}
}

import java.util.Scanner;

public class WordProcessor {

	public static void main(String[] args) {

		// 맞춤법 검사기 프로그래밍
		String[] wordsCheck = {"칠흑", "실락원", "고기국", "회계연도", "test"};
		String[] correct;
		
		SpellingCheckerImpl spellingchecker1 = new SpellingCheckerImpl();
		SpellingChecker sc1 = spellingchecker1;
		Dictionary dic = spellingchecker1; 
		 
		sc1.setWords(wordsCheck); // words에 {"칠흑", "실락원", "고기국", "회계연도"} 집어넣기
		correct = sc1.correction(); //wordsCheck와 correctWords 비교해서 같은 값 추출하기 {"칠흑","회계연도", "test", "null", "null"}
		
		Scanner scan = new Scanner(System.in);
		String str;
	
		System.out.println("-----맞춤법 검사기-----");
		System.out.println("검사하기 : ");
		str = scan.next();
		
		for (int i = 0; i < correct.length; ++i)  { // correct.length = 5
			String result = null;					// str = {"칠흑","회계연도", "test", "null", "null"}
			if(str != correct[i]) {					// correct[0] 한번 돌고 다음 "칠흑" != correct[1]에 실행
				result = dic.find(str);				// result = dic.find("칠흑") 실행
				System.out.println(result);	
				break;								// break가 있어서 한번 적용되면 for문을 빠져나감! 다음 for문 실행을 방지해줌!!
			}
		}
	}
}

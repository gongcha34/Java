
public class SpellingCheckerImpl implements Dictionary, SpellingChecker {
	private String [] words;
	private String [] longWords = { "칠흙", "실락원", "고기국", "회계년도", "test1" };
	private String [] correctWords = { "칠흑", "실낙원", "고깃국", "회계연도", "test" };
	
	@Override
	public String find(String word) {
		String result = "없음"; //매개변수를 담을 String 변수 선언
		boolean flag = false;
		
		for (int i = 0; i < longWords.length; ++i) {
			// longWords에 있는 단어면 if문 실행
			// flag = true 출력
			if(word.equals(longWords[i])) {
				//longwords 인덱스값에 맞춰 correctWords 인덱스에 교정된 단어를 넣음
				result = correctWords[i]; 
				if(result == "칠흑") {
					System.out.println("도움말 : ");
					System.out.println("발음의 유사성 때문에 틀리기 쉬운 용언이나 단어입니다.");
					flag = true;
				}
				else
				if(result == "실낙원") {
					System.out.println("도움말 : ");
					System.out.println("'실락원'은 '실낙원'의 잘못입니다.");
					System.out.println("두음법칙에 해당하지 않다고 보거나 발음이 [실락원]으로 나기 때문에 '실락원'으로 표기하는 경우가 있습니다.");
					flag = true;
				} 
				else 
				if (result == "고깃국") {
					System.out.println("도움말 : ");
					System.out.println("사이시옷은 다음과 같은 예에 받치어 적는다.");
					flag = true;
				}
				else 
				if (result == "회계연도") {
					System.out.println("도움말 : ");
					System.out.println("사전에 없는 글자를 쓴 경우 발음이 비슷하거나 뜻이 비슷해서");
					System.out.println("사전에는 존재하지 않는 단어를 만들어서 쓴 경우입니다.");
					flag = true;
				}
			} 
			// longWords에 없는 단어면 else 구문 실행
			// correctWords에 있는 단어면 true, 없는 단어면 false
			else {
				for(int j = 0; j < correctWords.length; ++j) {
					if(word.equals(correctWords[j])) {
						flag = true;
						break;
					}
				}
			}
		}
		
		if(flag == false){System.out.println("등록되지 않은 단어입니다.");}
		return ">> 교정결과(맞춤법) : " + result;
	}
	
	
}

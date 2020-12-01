
public class StringConcatExample {

	public static void main(String[] args) {
		// 문자열 연결 연산자
		String str1 = "JDK" + 6.0;
		String str2 = str1 + "특징";
		System.out.println(str2);
		
		// 어떤 것이 먼저 연산되느냐에 따라 다른 결과가 나온다.
		String str3 = "JDK" + 3  + 3.0; // JDK33.0
		String str4 = 3 + 3.0 + "JDK"; // 6.0JDK
		System.out.println(str3); 
		System.out.println(str4);

	}

}

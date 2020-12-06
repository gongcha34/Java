
public class CharOperationExample {

	public static void main(String[] args) {
		// char 타입 연산
		char c1 = 'A' + 1;
		// 리터럴 'A'는 65라는 유니코드이므로 'A'+1은 66 = > B가 된다
		char c2 = 'A';
		// char c3 = c2 + 1;	//컴파일 에러
		// 변수 c2에 1을 더하면 c2는 int 타입으로 변환되고 1과 연산되기 떄문에 에러 발생
		
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		// System.out.println("c3: " + c3);

	}

}

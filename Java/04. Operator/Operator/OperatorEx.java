
public class OperatorEx {

	public static void main(String[] args) {
		// 실습1 
		int i1 = 20;
		int i2 = 6;
		int i3 = i1 % i2;
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		short s1 = 10;
		short s2 = 100;
		// short s3 =  s1 + s2; //컴파일 에러
		// 연산은 int 아니면 double 값이 나옴
		double s3 = s1 + s2;
		System.out.println(s3);
		
		i1 = 10;
		i2 = 10;
		int r1 = 2 * ++i1;
		int r2 = 2 * i2++;
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(r1);
		System.out.println(r2);
		
		//실습 4
		int a = 10, b = 20;
		int x = 100, y = 200;
		boolean result = (++a > ++b) && (++x <++y);
		System.out.println(result);
		
		//실습 5
		String str = "첫번째 문자열" + "두번째 문자열";
		System.out.println(str);
		
		//실습 6
		String s11 = "당신을 사랑합니다";
		String s22 = "당신을 사랑합니다";
		boolean bb = s11 ==s22;
		
		System.out.println(bb);

	}

}

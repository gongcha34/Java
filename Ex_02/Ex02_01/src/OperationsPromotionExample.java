
public class OperationsPromotionExample {

	public static void main(String[] args) {
		//연산식에서 자동 타입 변환
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2;	//컴파일에러
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드= " + intValue2);
		System.out.println("출력문자= " + (char)intValue2);

		int intValue5 = 10;
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
	}

}

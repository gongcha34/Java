
public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		// 1부터 100까지 합을 출력
		int sum = 0;
		
		int i = 1;
		
		while(i <= 100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}

}

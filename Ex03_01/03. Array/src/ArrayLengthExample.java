
public class ArrayLengthExample {

	public static void main(String[] args) {
		// 배열의 length 필드
		int[] scores = {83, 90, 87};
		
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / scores.length;
		// 정수 나누기 정수는 int
		// 따라서 (double)을 제외하면 86.0 값이 나온다.
		System.out.println("평균 : " + avg);

	}

}

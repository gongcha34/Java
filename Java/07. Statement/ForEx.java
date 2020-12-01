
public class ForEx {

	public static void main(String[] args) {
		// for문
		for(int i = 0; i < 5; ++i) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.printf("%d 번째 당신을 사랑합니다.\n",i);
		}

	}

}

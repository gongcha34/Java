
public class Date {

	// 필드 생성
	private int year;
	private int month;
	private int day;
	
	// 생성자 : 필드값 초기화
	public Date() {
		year = 1990;
		month = 1;
		day = 1;
	}
	
	// 생성자 : 인수를 받아 매개변수에 넣기
	public Date(int yy, int mm, int dd) {
		setDate(yy, mm, dd);
	}
	\
	//메소드
	public void setDate(int yy, int mm, int dd) {
		
		int [] days = {31, 28, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31};
		year = max(1990, yy);
		month = max(1, mm); // ex. max에서 mm 값이 13으로 나올경우
		month = min(month, 12); // min에서 12로 변환해줌
		day = max(1, dd);
		day = min(day, days[month-1]); 
		// month가 0부터 시작하므로
		// month가 3월이면 days[2]가 실행되어야함
	}
	
	// 함수 (공개)
	// 4d : 전체자리 4, 02d : 전체자리 2에 왼쪽의 남는 자리에 0 출력
	public void displayDate() {
		System.out.printf("%4d-%02d-%02d\n", year, month, day);
	}
	// 함수 (보안)
	private int max(int x, int y) {
		if(x > y)
			return x;
		return y;
	}
	
	private int min(int x, int y) {
		if(x < y)
			return y;
		return x;
	}
	
	
}

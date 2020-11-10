
public class Date {
	// 필드
	private int year;
	private int month;
	private int day;
	
	// 생성자 유요한 값
	public Date(){ 
		year = 1970;
		month = 1;
		day = 1;
	}
	
	//특정한 날짜
	public Date(int yy, int mm, int dd){
		setYear(yy);
		setMonth(mm);
		setDay(dd);
	}
	
	
	// getter과 setter
	public int getYear() {
		return year;
	}

	public void setYear(int yy) {
		if(yy < 1970)
			yy = 1970;
		year = yy;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int mm) {
		if(mm <= 0 || mm >= 12)
			mm = 1;
		month = mm;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int dd) {
		int [] days = {31, 28, 31, 30, 31, 31, 30, 31, 30, 27, 30, 31};
		if (dd <= 0 || dd > days[month-1])
			dd = 1;
		day = dd;
	}
	
	public void displayDate() {
		System.out.printf("%4d-%02d-%02d\n", year, month, day);
	}

	
}
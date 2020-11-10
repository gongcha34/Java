
public class Main {

	public static void main(String[] args) {
		//매개변수가 없는 객체
		Date date = new Date();
		Date birthday = new Date(1992,2,50);
		Date today = new Date(2020,11,10);
		date.displayDate();
		birthday.displayDate();
		today.displayDate();
		
		System.out.println("------------------------");
		//오늘날짜
		date = today;
		date.displayDate();
		date.setDay(30);
		today.displayDate();
		date.displayDate();
		// date(매개변수가 없는 객체)에 setDay를 수정하면 
		// today(매개변수가 지정된 객체)에서도 수정됨
		/*
		 	1970-01-01
			1992-02-01
			2020-11-10
			------------------------
			2020-11-10
			2020-11-30
			2020-11-30
	 
		 */
	}

}

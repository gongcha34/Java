
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		Date myBirthday = new Date(1960, 21, 51);
		Date today = new Date(2020, 11, 10);
		date.displayDate();
		myBirthday.displayDate();
		today.displayDate();
		
		date = today;
		date.displayDate();
		date.setDay(30);
		date.displayDate();
		today.displayDate();
	}

}

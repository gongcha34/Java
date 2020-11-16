
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularEmployee emp1 = new RegularEmployee("김일", "서울시", "111-1111", new Date(2010, 1, 1), 10000000);
		emp1.displayEmployee();
		double salary = emp1.payCheck();
		System.out.println("급여액 : " + salary);
		RegularEmployee emp2 = new RegularEmployee("김이", "부산시", "222-2222", new Date(2020, 1, 1), 1000000);
		emp2.displayEmployee();
		salary = emp2.payCheck();
		System.out.println("급여액 : " + salary);
		Employee emp3 = new RegularEmployee("김삼", "인천시", "333-3333", new Date(2000, 1, 1), 100000000);
		emp3.displayEmployee();
	}

}

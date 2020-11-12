
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
		
		RegularEmployee r = (RegularEmployee)emp3;
		salary = r.payCheck();
		System.out.println("급여액 : " + salary);
		
		SalesEmployee emp4 = new SalesEmployee("김사", "대구시", "444-4444", new Date(2001, 12, 1), 1000000, 0.03);
		emp4.setSales(1000000000);
		salary = emp4.payCheck();
		System.out.println("급여액 : " + salary);
		
		RegularEmployee emp5 = new SalesEmployee("김오", "대전시", "555-555", new Date(2001, 12, 1), 3000000, 0.01);
		emp5.displayEmployee();
		// emp5.setSales(1000000000);
		salary = emp5.payCheck();
		System.out.println("급여액 : " + salary);
		
		System.out.println("---------------------- departement ----------------------");
		Department dept = new Department("개발1부");
		dept.addEmployee(emp1);
		dept.addEmployee(emp2);
		dept.addEmployee(emp3);
		dept.addEmployee(emp4);
		dept.addEmployee(emp5);
		dept.display();
		
		RegularEmployee emp6 = new RegularEmployee("김일", "서울시", "111-1111", new Date(2010, 1, 1), 10000000);
		if(emp1 == emp6)
			System.out.println("같다.");
		else
			System.out.println("다르다.");
		if(emp1.equals(emp6))
			System.out.println("같다.");
		else
			System.out.println("다르다.");
		
		Date date = new Date(2020, 11, 12);
		String s = new String("");
		System.out.println(date);
		RegularEmployee emp7 = new RegularEmployee("김일", "서울시", "111-1111", date, 10000000);
		emp7.displayEmployee();
		
		Department dept1 = new Department("개발1부");
		if(dept.equals(dept1))
			System.out.println("같다.");
		else
			System.out.println("다르다.");
		if(dept == dept1)
			System.out.println("같다.");
		else
			System.out.println("다르다.");
		
		System.out.println(dept1);
	}

}

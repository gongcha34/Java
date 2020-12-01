
public class Department {
	private Employee [] employees;
	private int headCount;
	
	public Department() {
		employees = new Employee[10];
		headCount = 0;
	}
	
	public void addEmployee(Employee emp) {
		if(headCount < 10) {
			employees[headCount++] = emp;
		}
	}
	
	public void display() {
		for(int i = 0; i < headCount; ++i) {
			employees[i].displayEmployee();
			double salary = employees[i].payCheck();
			System.out.println("급여액 : " + salary);
		}
	}
}

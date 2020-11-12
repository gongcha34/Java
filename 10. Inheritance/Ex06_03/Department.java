
public class Department {
	private Employee [] employees;
	private int headCount;
	String deptName;
	
	public Department(String name) {
		employees = new Employee[10];
		headCount = 0;
		deptName = name;
	}
	
	public void addEmployee(Employee emp) {
		if(headCount < 10) {
			employees[headCount++] = emp;
		}
	}
	
	public void display() {
		for(int i = 0; i < headCount; ++i) {
			// employees[i].displayEmployee();
			double salary = employees[i].payCheck();
			System.out.printf("사원 - %s, 급여액 : %f\n", employees[i], salary);
		}
	}

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		Department d = (Department)o;
		return this.deptName == d.deptName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return deptName;
	}
	
	
}

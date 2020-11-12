
public class RegularEmployee extends Employee {
	protected double salary;
	
	public RegularEmployee(String name, String address, String telno, Date joinDate, double salary) {
		super(name, address, telno, joinDate);
		this.salary = salary;
	}
	
	public double payCheck() {
		System.out.println("RegularEmployee.payCheck()");
		return salary;
	}
}

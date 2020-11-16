
public class TemporaryEmployee extends Employee {
	private double unitPay;
	private int hours;
	public TemporaryEmployee(String name, String address, String telno, Date joinDate, double unitPay) {
		super(name, address, telno, joinDate);
		// TODO Auto-generated constructor stub
		this.unitPay = unitPay;
		hours = 0;
	}
	
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public double payCheck() {
		System.out.println("TemporaryEmployee.payCheck()");
		return unitPay * hours;
	}

}

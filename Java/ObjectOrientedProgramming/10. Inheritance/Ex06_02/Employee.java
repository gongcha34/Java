
public class Employee {
	private String name;
	private String address;
	private String telno;
	private Date joinDate;
	
	public Employee(String name, String address, String telno, Date joinDate) {
		this.name = name;
		this.address = address;
		this.telno = telno;
		this.joinDate = joinDate;
	}
	
	public void displayEmployee() {
		System.out.printf("이름 : %s, 주소 : %s, 전화번호 : %s, 입사일: %s\n", name, address, telno, joinDate);
	}
	
	public double payCheck() {
		return 0.0;
	}
}

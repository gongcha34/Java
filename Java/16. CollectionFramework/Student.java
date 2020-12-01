package collection;

public class Student {
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return name.equals(student.name) && sno == student.sno;
		} else {
			return false;
		}
	}
	
	public int hashCode() {
		return sno+name.hashCode();
	}
}

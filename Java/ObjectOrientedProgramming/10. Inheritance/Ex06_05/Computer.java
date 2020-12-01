
public class Computer {
	
	private boolean system; // 초기값 false
	
	public Computer() {
	}

	public boolean state() {
		return system;
	}
	
	public void systemOn() {
		system = true;
	}
	
	public void systemOff() {
		system = false;
	}
	

	
}


public class Rectangle extends Geometry {
	private int width;
	private int height;
	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		// TODO Auto-generated constructor stub
		this.width = width;
		this.height = height;
	}
	
	public void draw() {
		System.out.printf("사각형 : (%d, %d), width=%d, height=%d\n",  x, y, width, height);
	}

}

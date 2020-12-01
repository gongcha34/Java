public class Rhombus extends Geometry {

	private int height;
	private int baseLine;
	private int value;
	
	public Rhombus(int x, int y, int height,int baseLine) {
		super(x, y);
		this.height = height;
		this.baseLine = baseLine;
		value = 0;
	}
	
	public void draw() {
		value = calc(height,baseLine);
		System.out.printf("마름모: (%d, %d), 마름모의 넓이값:%d", x, y, value);
	}
	
	public int calc(int height, int baseLine) {
		return height * baseLine / 2;
	}
	
}

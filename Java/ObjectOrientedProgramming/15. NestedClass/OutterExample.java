package outertest;

public class OutterExample {

	public static void main(String[] args) {

		Outer outer = new Outer();
		Outer.Nested nested = outer.new Nested();
		nested.print();
		
	}

}

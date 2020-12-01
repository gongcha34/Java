
public class Car{
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	
	//오브젝트 안에 다른 오브젝트 : Enbed (Composition, Aggregation) : 자바는 Aggregation만 지원
	Body body = new Body();
	Engine engine = new Engine();
	Tire tire;
}

class Body {
	
}


class Engine {

}


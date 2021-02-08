# AOP (Aspect Oriented Preogramming)
> Aspect Oriented Preogramming는 관점 지향 프로그래밍이라고 불린다.

어떤 로직을 기준으로 업무로직(Core Concern), 공통적인 로직(Cross-cutting Concern)으로 나누어서 보고 그 관점을 기준으로 각각 모듈화한다.
* 모듈화란 어떤 공통된 로직이나 기능을 하나의 단위로 묶는 것을 말한다. 

![Uploading 20210208_211009.png…]()

```
public static void main(String[] args) {
	Exam exam = new NewlecCalculator();
	Exam examProxy = (Exam) Proxy.newProxyInstance(
		NewlecExam.class.getCalssLoader(),
		new Class[]{Exam.class},
		new InvocationHandler(){
			#Override
			public Object invoke(Object procy, Method method, Object[] args) throws Throwable{
					// 앞 
				Object result = method.invoke(exam, args);
					//뒤
				return result;
			}
		}
	)
}
```


# *Reference
 [뉴렉처](https://www.youtube.com/watch?v=y2JkXjOocZ4&list=PLq8wAnVUcTFUHYMzoV2RoFoY2HDTKru3T&index=18)
 [새로비](https://engkimbs.tistory.com/746)

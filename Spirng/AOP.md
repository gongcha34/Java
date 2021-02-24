# AOP (Aspect Oriented Preogramming)
> Aspect Oriented Preogramming는 관점 지향 프로그래밍이라고 불린다.

어떤 로직을 기준으로 업무로직(Core Concern), 공통적인 로직(Cross-cutting Concern)으로 나누어서 보고 그 관점을 기준으로 각각 모듈화한다.
* 모듈화란 어떤 공통된 로직이나 기능을 하나의 단위로 묶는 것을 말한다. 

![20210208_211009](https://user-images.githubusercontent.com/66931142/107219264-2bd35780-6a54-11eb-91bb-45e03fb997e5.png)

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
# AOP 주요용어
+ Advice : 언제 공통 관심 기능을 핵심 로직에 적용할 지를 정의한다.
+ Joinpoint : Advice를 적용 가능한 지점. 메서드 호출, 필드 값 변경 등 Joinpoint에 해당한다.
+ Pointcut : Joinpoint의 부분 집합으로서 실제로 Advice가 적용되는 Joinpoint를 나타낸다. 
+ Weaving : Advice를 핵심 로직 Code에 적용하는 것을 weaving이라고 한다. 
+ Target object : 하나 또는 그 이상의 Aspect에 의해 Advice되는 객체, 즉 핵심 로직을 구현하는 클래스를 의미한다.
+ Aspect : 여러 객체에 공통으로 적용되는 공통 관심 사항을 Aspect라고 한다..


# *Reference
 [뉴렉처](https://www.youtube.com/watch?v=y2JkXjOocZ4&list=PLq8wAnVUcTFUHYMzoV2RoFoY2HDTKru3T&index=18)
 [새로비](https://engkimbs.tistory.com/746)

# Spring MVC
> DispatcherServlet, HandlerMapping, Controller, Interceptor, ViewResolver, View등 각 컴포넌트들의 역할이  명확하게 분리된다.

Controller(@MVC)나 폼 클래스(커맨드 클래스) 작성시에 특정 클래스를 상속받거나 참조할 필요 없이 POJO 나 POJO-  style의 클래스를 작성함으로써 비지니스 로직에 집중한 코드를 작성할 수 있다.

![20210216_204231](https://user-images.githubusercontent.com/66931142/108058989-2ac7a900-7098-11eb-884a-19af013cfcd7.png)


## 컴포넌트 종류
+ DispacherServlet : 클라이언트의 요청(request)를 전달 받아, 컨트롤러에게 전달하고, 컨트롤러가 리턴한 결과 값을 view에 전달하여 알맞은 응답을 생성하도록 한다.
     + 기본적으로 /WEB-INF/ 디렉터리에 위치한 [Servlet이름]-servlet.xml파일로부터 SPRING 설정 정보를 읽어 온다.
  
+ HandlerMapping: 클라이언트의 URI를 어떤 컨트롤러가 처리할 지를 결정한다.

+ Controller: 클라이언트의 요청을 처리한 뒤, 그 결과를 DispatcherServlet에 알려 준다.

+ ModelAndView: 컨트롤러가 처리한 결과 정보(Model) 및 뷰(view) 선택에 필요한 정보를 담는다. 
     	     	
+ ViewResolver: 컨트롤러의 처리 결과를 생성할 뷰를 결정한다.
     	
+ View: 컨트롤러의 처리 결과 화면을 생성한다.

## Annotation
+ @Controller : 해당 클래스가 Controller임을 명시
+ @RequestMapping : 요청에 대해 어떤 Controller, 어떤 메소드가 처리할지를 맵핑
+ @RequestParam : Controller 메소드의 파라미터와 웹요청 파라미터와 맵핑
+ @ModelAttribute : Controller 메소드의 파라미터나 리턴값을 Model 객체와 바인딩
+ @SessionAttributes : Model 객체를 세션에 저장하고 사용


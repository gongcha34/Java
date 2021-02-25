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
     + @GepMapping, @PostMapping (Spring 4.3 이후 부터 도입)  
+ @RequestParam : Controller 메소드의 파라미터와 웹요청 파라미터와 맵핑
+ @ModelAttribute : Controller 메소드의 파라미터나 리턴값을 Model 객체와 바인딩
+ @SessionAttributes : Model 객체를 세션에 저장하고 사용

## Controller
+ 파라미터 값 저장
     1. @RequestMappin 메서드 매개변수에 자바빈 타입 변수 선언 : 자바빈 객체 안에는 파라미터와 같은 이름의 변수 선언하면 Setter를 통해서 자동으로 값을 저장
     2. 파라미터 이름과 매개변수명이 같으면 자동 저장
     3. 2번 이름들이 같지 않으면 @RequestParam("이름지정") 매개변수
     4. 매개변수에 HttpServletRequest 타입 선언, @getParameter("파라미터이름")

+ 모델데이터 추가
     1. @RequestMappin 메서드 매개변수에 자바빈 타입 변수 선언 : 자바빈 객체 안에는 파라미터와 같은 이름의 변수 선언하면 클래스명 이름으로(첫글자 소문자) 해당 객체가 모델 데이터를 추가
     2. Map, Model, ModelMap 타입의 매개변수 선언
     3. ModelAndView
     4. ModelAttribute 어노테이션: 리턴한 객체가 모델데이터로 저장됨

+ 뷰 정보 저장
     1. @RequestMapping 메서드 리턴타입이 String : 리턴 값을 ViewName으로 지정
     2. ModelAndView 생성자의 첫번째 매개변수는 ViewName이 된다.
     3. ViewName이 없는 경우 자동 지정 (URI에 맨 앞/과 확장자 제외한 나머지, redirect: 접두어)

## 파일 업로드 처리
```
//xml 파일
<bean id="multipartResolver" class="org.springframework.web.multipart.commons.CommonsMultipartResolver"></bean>
```
@RequestParam 어노테이션을 이용해서 업로드 파일에 접근한다.

MultipartFile 인터페이스를 이용해 업로드 한 파일의 이름, 실제 데이터 크기, 파일 크기 등을 구할 수 있다.  
```
@RequestMapping(value="/upload.do",method=RequestMethod.POST)  
public String writeArticle(@RequestParam("file")MultipartFile report,…){  …  }
```
폼은 enctype이 설정되어야 하며,input타입의 type속성을 file로 한다.  
```
<form action=“upload.do“ method="post“
enctype="multipart/form-data">  
제목 :<input type="text“ name="title"/><br>  
파일 :<input type="file“ name=" file "/><br>  
<input type="submit“ value="Upload"/>  </form>
```

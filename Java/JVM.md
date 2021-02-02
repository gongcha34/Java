# JVM

![20210202_224922](https://user-images.githubusercontent.com/66931142/106609453-ea9cfc80-65a8-11eb-986c-31486d8b6580.png)

## 1. JVM이란 무엇인가?
JVM은 Java Virtual Machine 의 줄임말이며, Java Byte Code를 OS에 맞게 해석 해주는 역할을 합니다. Java compiler는 .java 파일을 .class 라는 Java byte code(반기계어)로 변환 시켜 줍니다.  Byte Code 는 기계어가 아니기 때문에OS에서 바로 실행되지 않습니다. 이때 JVM은 OS가 ByteCode를 이해할 수 있도록 해석 해줍니다. 

## 2. 컴파일 하는 방법
> 자바 소스 파일(*.java) > 컴파일러(javac.exe) > 바이트 코드 파일 (*.class) > 자바 가상 기계(java.exe) > 기계어 > 실행

1. *.java 파일을 생성합니다. 
2. Build 라는 작업을 하게 되면 Java Complier가 javac 라는 명령어를 사용해 .class 파일을 생성합니다. 
    1. .class는 Java byte code(반기계어)로 되어있습니다.
3. java byte code(.class)는 클래스 로더에 의해서 JVM내로 로드 되고, 실행엔진에 의해 기계어로 해석되어 메모리 상(Runtime Data Area)에 배치되게 됩니다.

## 3. 실행하는 방법

+ IntegerTest.java 파일을 생성
```
public class IntegerTest{

 public static void main(String [] args){

  int i = 10;
  System.out.println(i); 

  i = 20;
	System.out.println(i);

 }

}
```
+ cmd창에 아래와 같이 입력

C:\Users\폴더명>cd C:\javaex

C:\javaex>dir

C:\javaex>javac IntegerTest.java // 컴파일

C:\javaex>java IntegerTest // 실행

+ 결과값

10

20

## 4. 바이트코드란 무엇인가

- java byte code(.class)란 JVM이 이해할 수 있는 언어로 변환된 자바 소스 코드를 의미합니다. 자바 컴파일러에 의해 변환되는 코드의 명령어 크기가 1바이트라서 java byte code라고 불리고 있습니다.

## 5. JIT 컴파일러란 무엇이며 어떻게 동작하는가?

- JIT 컴파일(just-in-time compilation) 또는 동적 번역(dynamic translation)은 프로그램을 실제 실행하는 시점에 기계어로 번역하는 컴파일 기법이다.

## 6. JVM 구성 요소

- 자바 인터프리터(interpreter) :
    - 자바 컴파일러에 의해 변환된 자바 바이트 코드를 읽고 해석하는 역할을 합니다.
- 클래스 로더(class loader) :
    - 동적으로 클래스를 로딩해주는 역할을 합니다.  자바는 동적으로 클래스를 읽어오므로, 프로그램이 실행 중인 런타임에서야 모든 코드가 자바 가상 머신과 연결됩니다.
- JIT 컴파일러(Just-In-Time compiler) :
    - 프로그램이 실행 중인 런타임에 실제 기계어로 변환해 주는 컴파일러를 의미합니다. 동적 번역(dynamic translation)이라고도 불리는 이 기법은 프로그램의 실행 속도를 향상시키기 위해 개발되었습니다. 즉, JIT 컴파일러는 자바 컴파일러가 생성한 자바 바이트 코드를 런타임에 바로 기계어로 변환하는 데 사용합니다.
- 가비지 컬렉터(garbage collector)
    - 자바 가상 머신은 가비지 컬렉터(garbage collector)를 이용하여 더는 사용하지 않는 메모리를 자동으로 회수해 줍니다. 따라서 개발자가 따로 메모리를 관리하지 않아도 되므로, 더욱 손쉽게 프로그래밍을 할 수 있도록 도와줍니다.

 

## 7. JDK와 JRE의 차이

- **JRE : Java Runtime Environment, 자바 실행 환경**
    - JVM, Java API

    자바 애플리케이션을 실행하기 위한 **최소의 실행 환경** 제공.

- **JDK : Java Development Kit, 자바 개발 도구**
    - JVM, Java API, **Java Tool, Java Compiler**

    JRE에서 제공하는 실행 환경뿐만 아니라 자바 개발에 필요한 여러 가지 명령어 그리고 **컴파일러**를 포함.[https://wikidocs.net/257](https://wikidocs.net/257)

    (자바 App 메모리상태 알아보는 명령어, 배포 명령어)

## 참조

[https://medium.com/@lazysoul/jvm-이란-c142b01571f2](https://medium.com/@lazysoul/jvm-%EC%9D%B4%EB%9E%80-c142b01571f2)

[https://aljjabaegi.tistory.com/387](https://aljjabaegi.tistory.com/387)

[http://www.tcpschool.com/java/java_intro_programming](http://www.tcpschool.com/java/java_intro_programming)

[https://wikidocs.net/257](https://wikidocs.net/257)
# 변수 (Variable)
> 프로그래밍언어에서의 변수란, 값을 저장할 수 있는 메모리상의 공간을 의미한다.
> "변수란, 단 하나의 값을 저장할 수 있는 메모리 공간."

# 변수의 선언과 초기화
1. 변수를 선언한 이후부터는 변수를 사용할 수 있으나, 그 전에 반드시 변수를 초기화해야한다.
2. 대입 연산자(=)를 사용한다.
3. 타입이 같은 경우 콤마(,)를 구분자로 여러 변수를 한 줄에 선언하기도 한다.
는 메소드 실행 시에만 사용되고, 메소드가 끝나면 종료되서 없어진다.

# 변수의 명명규칙
+ 대소문자가 구분되며 길이에 제한이 없다.
+ 예약어를 사용해서는 안 된다.
    + true는 예약어라서 사용이 안 된다.
+ 숫자로 시작해서는 안 된다.
+ 특수문자 '_'와 '$'만 허용한다.

# 변수의 타입
> 값의 종류에 따라 값이 저장될 공간의 크기와 저장형식을 정의한 것이 자료형이다.

자료형에는 기본형과 참조형으로 나누어지며, 기본형 변수는 실제 값을 저장하는 반면, 참조형 변수는 어떤 값이 저장되어 있는 주소를 값으로 갖는다.
+ 기본형(논리형, 문자형, 정수형, 실수형 모두 8개)
    + boolean, char, byte, short, int, long, float, double
+ 참조형(8개의 기본형을 제외한 나머지 타입)
+ 참조형은 null 또는 객체의 주소를 값으로 받는다.
    + Date today = new Date(); // 객체를 생성하는 연산자 new의 결과는 객체의 주소다.

# 기본형
+ 논리형 - boolean
    + 기본값(default)은 false다.
    + 1bit만으로 충분하지만, 자바에서 데이터를 다루는 최소단위가 byte이기 떄문에 1byte이다.
+ 문자형 - char
    + 문자를 저장하기 위한 자료형이지만 사실 문자가 아닌 '문자의 유니코드(정수)'가 저장된다.
    + 문자 리터럴 대신 유니코드로 저장할 수 있다.
+ 정수형 - byte, short, int, long
    + 정수형 변수를 선언할 때는 int 타입으로 하고, 더 큰 수를 사용하려면 long을 쓴다.
    + 정수형에서 변수의 값이 표현범위를 벗어나면 오버플로우가 발생한다.
+ 실수형 - float, double
    + 정수형과 달리 실수형에서 오버플로우가 발생하면 변수의 값은 무한대(intinity)가 발생한다.
    + 언더플로우는 실수형으로 표현할 수 없는 아주 작은 값 0이 된다.
    
# 형변환
> 변수 또는 상수의 타입을 다른 타입으로 변환하는 것

# *Reference
+ [자바의 정석]

# 배열(Array)
> 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것을 '배열'이라고 한다.

<pre>
    <code>
        int[] score = new int[5]; // 5개의 int 값을 저장할 수 있는 배열을 생성한다.
    </code>
</pre>

변수 score은 배열을 다루는데 필요한 참조변수일 뿐 값을 저장하기 위한 공간은 아니다.
변수와 달리 배열은 각 저장공간이 연속적으로 배치되어 있다는 특징이 있다.

## 배열의 선언과 생성
> 선언 방법은 원하는 타입의 변수를 선언하고 셥ㄴ수 또는 타입에 배열임을 의미하는 대괄호[]를 붙이면 된다.

### 배열의 생성
>배열을 선언한 다음에는 배열을 생성해야한다. 배열을 선언하는 것은 단지 생성된 배열을 다루기 위한 참조변수를 위한 공간이 만들어질 뿐이고, 배열을 생성해야만 비로소 값을 저장할 수 있는 공간이 만들어지는 것이다.

### 배열의 길이(length)와 인덱스(index)
> 생선된 배열의 각 저장공간을 '배열의 요소'라고 하며, '배열이름[인덱스]'의 형식으로 배열의 요소에 접근한다. 인덱스는 배열의 요소마다 붙여진 일련번호로 각 요소를 구별하는데 사용된다.

+ 주의할 점은 index의 범위를 벗어난 값을 index로 사용하지 않아야 한다.
	+ 왜냐하면 배열의 index로 변수를 많이 사용하는데, 변수의 값은 실행 시에 대입되므로 컴파일러는 이 값의 범위를 확인할 수 없다.
+ 길이가 0인 배열도 생성이 가능하다.
	+ 배열의 길이는 int범위의 양의 정수(0도 포함)이어야 한다.
+ 배열은 한번 생성하면 길이를 변경할 수 없다. '배열이름.length'는 상수다. 즉 값을 읽을 수만 있을 뿐 변경할 수 없다.

### 배열의 길이 변경하기
1. 더 큰 배열을 새로 생성한다.
2. 기존 배열의 내용을 새로운 배열에 복사한다.

## 배열의 초기화
> 배열은 생성과 동시에 자동적으로 자신의 타입에 해당하는 기본값으로 초기화되므로 배열을 사용하기 전에 따로 초기화를 해주지 안항도 되지만, 원하는 값을 저장하려면 각 요소마다 값을 지정해 줘야한다.

+ 배열의 생성과 초기화를 동시에 할 수 있다
	+ (예) int[] score = new int[] {50, 60, 70, 80, 90};
	+ 괄호{} 안에 쉼표로 구분해서 나열하면 되며, 배열의 길이가 자동으로 결정되기 때문에 괄호[] 안에 배열의 길이는 안적어도 된다.
	+ new 타입[]도 생략이 가능하다.

반면 다음과 같이 배열을 선언과 생성을 따로 하는 경우에는 생략할 수 없다.

<pre>
    <code>
        // 1번
        int[] score;
        score = new int[] { /*내용 생략 */ } // new int[] 생략 불가능
        
      //2번
      int add(int[] arr) { /*내용 생략 */ }
      int result = arr(new int[] {/*내용 생략 */ });
       
   </code>
</pre>

### 배열의 출력
> println 메서드 또는 'Arrays.toString(배열이름)'메서드를 사용한다.
> 'Arrays.toString(배열이름)'는 배열의 모든 요소를 '[처섭ㄴ째 요소, 두번째 요소,...]'와 같은 형식의 문자열로 만들어서 반환한다.

### 배열의 복사
> 배열의 복사하는 방법은 두 가지가 있다.

1. 먼저 for문을 이용해서 배열을 복사하는 방법
2. System.arraycopy()를 이용한 배열의 복사. (배열의 복사는  System.arraycopy()가 효과적이다.)

## 배열의 활용


### 임의의 값으로 배열 채우기
<pre>
    <code>
        int[] numArr = new int[10];
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int) (Math.random() * 10));
		}
		System.out.println();
		
		for(int i = 0; i < numArr.length-1; i++) {
			boolean changed = false; // 자리바꿈이 발생했는지를 체크한다.
			for(int j = 0; j < numArr.length-1-i; j++) {
				if(numArr[j] > numArr[j+1]) {
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true;
				}
			} // end j
			
			if(!changed) break;
			
			for(int k = 0; k <numArr.length; k++) {
				System.out.print(numArr[k]);
			}
			System.out.println();
		} // end i
       
   </code>
</pre>


## String 배열
>배열의 타입이 String인 경우에도 int배열의 선언과 생성방법은 다르지 않다.

<pre>
    <code>
        String[] name = new String[3] // 3개의 문자열을 담을 수 있는 배열을 생성한다.
    </code>
</pre>

+ 초기화 역시 int배열과 동일한 방법으로 한다. 배열의 각 요소에 문자열을 지정하면 된다.
+ 또는 괄호{}를 사용해서 간단히 초기화 할 수도 있다.
+ String클래스는 char배열에 기능(메서드)을 추가한 것이다.
+ char배열과 String클래스의 한 가지 중요한 차이가 있는데, String객체(문자열)는 읽을 수만 있을 뿐 내용을 변경할 수 없다.
	+ 값을 변경하면 새로운 문자열이 저장된다.
	
## 다차원 배열
> 2차원 이상의 배열, 즉 다차원 배열도 선언해서 사용할 수 있다.

### 다차원 배열 선언 방법
타입[][] 변수이름;
타입 변수이름[][];
타입[] 변수이름[];





# *Reference
+ [Java의 정석](http://www.yes24.com/Product/Goods/24259565?OzSrank=1)







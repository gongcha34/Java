# 조건문과 반복문 (Conditionals and Loops)
> 프로그램의 흐름을 바꾸는 역할을 하는 문장들을 '제어문(control statement)'이라고 한다.
> 제어문에는 '조건문과 반복문'이 있다.

## 1. 조건문
### if문
> 만일(if) 조건식이 참(true)이면 괄호{} 안의 문장들을 수행하라.
일반적으로 if문에 사용되는 조건식은 비교연산자와 논리연산자로 구성된다.

<pre>
<code>
	if(조건식){
		//조건식이 참(true) 일 때 수행될 문장들을 적는다.
	}
</code>
</pre>

+ 괄호{}를 이용해서 여러 문장들을 하나의 단위로 묶을 수 있는데, 이것을 '블럭'이라고 한다. 블럭 내의 문장들은 탭으로 들여쓰기를 해서 블럭 안에 속한 문장이라는 것을 알기 쉽게 해주는 것이 좋다.

<pre>
<code>
	System.out.println("숫자를 하나 입력하세요.>");

	Scanner scanner = new Scanner (System.in);

	String tmp = scanner.nextLine();
	input = Integer.parseInt(tmp);

	if(input == 0) {
		System.out.println("입력하신 숫자는 0입니다.");
	}

	if(input != 0) {
		System.out.println("입력하신 숫자는 0이 아닙니다.");
		System.out.printf("입력하신 숫자는 %d입니다.",input);
	}
</code>
</pre>

#### if-else문
> 조건식의 결과가 참이 아닐 때, 즉 거짓일 때 else블럭의 문장을 수행하라는 뜻이다.


<pre>
<code>
	if(조건식){
		//조건식이 참(true) 일 때 수행될 문장들을 적는다.
	} else {
		//조건식이 거짓(false) 일 때 수행될 문장들을 적는다.
	}
</code>
</pre>

#### if-else if문
> 한 문장에 여러 개의 조건식을 쓸 수 있는 if-else if문이다.

<pre>
<code>
	if(조건식1){
		// 조건식1 참(true) 일 때 수행될 문장들을 적는다.
	} else if (조건식2) {
		// 조건식2 참(true) 일 때 수행될 문장들을 적는다.
	} else if (조건식3) {
		// 조건식3 참(true) 일 때 수행될 문장들을 적는다.
	} else {
		// 마지막에는 보통 else블럭으로 끝나며, else블럭은 생략가능하다.
		// 위의 어느 조건식도 만족하지 않을 때 수행될 문장들을 적는다.
	}
</code>
</pre>

#### 중첩 if문
> if문의 블럭 내에 또 다른 if문을 포함시키는 것이 가능한데 이것을 중첩 if문이라고 부르며, 중첩의 횟수에는 거의 제한이 없다.

### switch문
> 단 하나의 조건식으로 많은 경우의 수를 처리할 수 있고, 표현도 간결하므로 알아보기 쉽다.

1. 조건식을 계산한다.
2. 조건식의 결과와 일치하는 case문으로 이동한다.
3. 이후의 문장들을 수행한다.
4. break문이나 switch문의 끝을 만나면 switch문 전체를 빠져나간다.

<pre>
<code>
    switch(조건식){
        case 값1 :
            // 조건식의 결과가 값1과 같은 경우 수행될 문장들
            break;
        case 값2 :
            // 조건식의 결과가 값2과 같은 경우 수행될 문장들
            break;
        case 값3 :
            // 조건식의 결과가 값3과 같은 경우 수행될 문장들
            break;
        default :
            // 조건식의 결과와 일치하는 case문이 없을 때 수행될 문장들
    }
</code>
</pre>

#### switch문의 중첩
+ if문처럼 switch문도 중첩이 가능하다. 한 가지 주의할 점은 중첩 switch문에서 break문을 빼지 않게 조심하자.
<pre>
    <code>
    System.out.println("당신의 주민번호를 입력하세요. (011234-111222) >");
    Scanner scanner = new Scanner(System.in);
    String regNo = scanner.nextLine();
    char gender = regNo.charAt(7); // 입력받은 번호의 8번째 문자를 gender에 저장

    switch(gender) {
	case '1': case '3':
	    switch(gender) {
	    case '1':
		System.out.println("당신은 2000년 이전에 출생한 남자입니다.");
		break;
	    case '3':
		System.out.println("당신은 2000년 이후에 출생한 남자입니다.");
	    }
	    break; // 이 break를 빼먹지 않도록 주의
	case '2': case '4':
	    switch(gender) {
	    case '2':
		System.out.println("당신은 2000년 이전에 출생한 여자입니다.");
		break;
	    case '4':
		System.out.println("당신은 2000년 이후에 출생한 여자입니다.");
	    }
	    break; // 이 break를 빼먹지 않도록 주의
	default:
	    System.out.println("유효하지 않은 주민등록번호입니다");
    }
    </code>
</pre>

## 2. 반복문
> 반복문은 어떤 작업이 반복적으로 수행되도록 할 때 사용된다.
> for문이나 while문에 속한 문장은 조건에 따라 한 번도 수해외지 않을 수  있지만 do-while문에
> 속한 문장은 무조건 최소한 한 번은 수행될 것이 보장된다.
> if문과 마찬가지로 조건식을 포함하며, 조건식의 결과가 ture면 참으로, false면 거짓으로 간주한다.

### for문
> for문은 반복 횟수를 알고 있을 때 적합하다. 구조가 조금 복잡하지만 직관적이라 오히려 이해하기 쉽다.

<pre>
    <code>
        for(int i=1;i<=5;i++){ // 초기화; 조건식; 증감식
            System.out.println("I can do it!");
        }
    </code>
</pre>

+ for문의 조건식은 생략이 가능하다 //for(;;){}

### 향상된 for문(enhanced for statement)
> JDK1.5부터 배열과 컬렉션에 저장된 요소에 접근할 때 기존보다 편리한 방법으로 처리할 수 있도록 for문의 새로운 문법이 추가되었다.

<pre>
    <code>
        for(타입 변수명 : 배열 또는 컬렉션){
            // 반복할 문장   
        }
    </code>
</pre>

+ 그러나 향상된 for문은 일반적인 for문과 달리 배열이나 컬렉션에 저장된 요소들을 읽어오는 용도로만 사용할 수 있다는 제약이 있다.

### while문
> for문에 비해 whil문은 구조가 간단하다. if문처럼 조건식과 블럭{}만으로 이루어져 있다.
> 다만 if문과 달리 while문은 조건식이 참인 동안, 즉 조건식이 거짓이 될 떄까지 블럭{} 내의 문장을 반복한다.

<pre>
    <code>
        while(조건식){
            // 조건식의 연산결과가 참(true)인 동안 반복될 문장들을 적는다.
        }
    </code>
</pre>
+ 만일 초기화나 증가식이 필요하지 않은 경우라면, while문이 더 적합하다.
+ while의 조건식은 생략할 수 없다.

### do-while문
>while문의 변형으로 기본적인 구조는 while문과 같으나 조건식과 블럭{}의 순서를 바꿔놓은 것이다.
> 그래서 while문과 반대로 블럭{}을 먼저 수행한 후에 조건식을 평가한다.
> do-while문은 최소한 한번은 수행될 것을 보장한다.

<pre>
    <code>
        do{
            //조건식의 연산결과가 참일 때 수행될 문장들을 적는다.
        }while(조건식)
    </code>
</pre>

### break문
> 앞서 switch문에서 break문에 대해 배워던 것을 기억할 것이다.
> 반복문에서도 break문을 사용할 수 있는데, switch문에서 그랬던 것처럼, break문은 자신이 포함된 가장 가까운 반복문을 벗어난다.
> 주로 if문과 함께 사용되어 특정 조건을 만족하면 반복문을 벗어나도록 한다.

### continue문
> continue문은 반복문 내에서만 사용될 수 있으며, 반복이 진행되는 도중에 continue문을 만나면 반복문의 끝으로 이동하여 다음 반복으로 넘어간다.

### 이름 붙은 반복문
> break문은 근접한 단 하나의 반복문만 벗어날 수 있기 떄문에, 여러 개의 반복문이 중첩된 경우에는 break문으로 중첩 반복문을 완전히 벗어날 수 없다.
> 이 떄는 중첩 반복문 앞에 이름을 붙이고 break문과 continue문에 이름을 지정해 줌으로써 하나 이상의 반복문을 벗어나거나 반복을 건너뛸 수 있다.

<pre>
    <code>
        // for문에 Loop1이라는 이름을 붙였다.
	Loop1 : for(int i = 2; i <= 9; i++) {
		for(int j = 1; j <= 9; j++) {
			if(j==5)
				break Loop1;
				//break;
				//continue Loop1;
				//continue;
			System.out.println(i + "*" + j + "=" + i*j);
		}
		System.out.println();
	}
    </code>
</pre>

# *Reference
+ [자바의 정석]

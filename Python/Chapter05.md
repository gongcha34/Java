# 함수
```
def say_hello():
    print('안녕하세요?')

say_hello()

// 함수 매개변수
def print_max(x, y):
    if x > y:
        print(x)
    elif x == y:
        print('equals')
    else:
        print(y)

print_max(3, 4)

// 전역변수, 지역변수
v = 50

def func(x):
    print('value of x', x)  // 50
    v = 100
    print('value of x', v)  // 100


func(v)
print('value of global v', v)  // 50

# global 키워드
v = 50


def func2(x):
    global v
    print('value of x', x)  // 50
    v = 100
    print('value of x', v)  // 100


func2(v)
print('value of global v', v)  // 100

// 디폴트 인수값

def say_message(message, times=1):  // 마지막 매개변수에다만 디폴트 값을 지정할 수 있다.
    print(message*times)


say_message('안녕하세요1')
say_message('안녕하세요2, ', 4)

// 키워드 인수


def func3(x, y=5, z=10):
    print(x, y, z)

func3(3, 7)
func3(25, z=24)
func3(z=50, x=100)

// 가변인수

def compute_total(initial, *numbers, **keywords):
    count = initial # 10
    for number in numbers:
        count += number # [1, 2, 3]
    for key in keywords:
        count += keywords[key] // keywords[vegetables] = 50, keywords[fruits] = 100
    return count


total = compute_total(10, 1, 2, 3, vegetables=50, fruits=100) // vegetables가 key, 50이 value
print(total)

// return문
def min(x,y):
    if x < y:
        return x
    else
        return y
result = min(10,20)
print(result)

// pass문
def min(x,y):
    pass
min(10,20) // 빈블럭, 실행은 된다!

// DocString
def max(x, y):
    '''
    : param x: 첫번째 숫자
    : param y: 둗번째 숫자
    : return: 두 숫자 중 더 큰 숫자를 반환함
    '''
    if x > y:
        return x
    else:
        return y


result = max(10, 20)
print(result)
print(max.__doc__)


```

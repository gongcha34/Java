# 제어문
## if문
```
number = 23
guess = int(input('숫자를 입력하세요 : '))
if guess == number:
    print('맞습니다')
    print('하지만 상은 없어요.')
elif guess < number:
    print('너무 작습니다')
else:
    print('너무 큽니다..')

```

## while문
```
number = 23
running = True
while running:
    guess = int(input('숫자를 입력하세요 : '))
    if guess == number:
        print('맞습니다')
        print('하지만 상은 없어요.')
        running = False
    elif guess < number:
        print('너무 작습니다')
    else:
        print('너무 큽니다..')
else:
    print('반복문이 종료되었습니다.')
```
else 생략 가능하다.

## for...in문
```
for i in range(1, 5):
    print(i)
else:
    print("반복문이 종료되었습니다.")
print("완료했습니다.")

```
> 시퀀스를 따라서 반복하여 실행
+ 시퀀스에 포함된 각 항목을 하나씩 거쳐가면서 실행한다.
+ range 함수
	+ 1씩 증가한느 숫자의 목록을 반환하는 함수
	+ range(1, 5): [1, 2, 3, 4]
	+ range(1, 5, 2): [1, 3] (2씩 증가함)


## break 문
> while 또는 for..in 문에서 강제로 반복을 종료함
+ else 코드 블록이 실행되지 않음.

## continue 문
> while 또는 for..in문에서 나머지 명령문을 싱행하지 않고 반복문으로 넘어감

























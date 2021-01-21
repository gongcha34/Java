# 모듈
+ 재사용할 수 있는 함수과 전역 변수의 집합
+ 실행 코드도 포함할 수 있다
	+ 모듈이 로드될 때 자동으로 실행된다.
```
def say(name):
return "안녕하세요? {}님!".format(name)
```

## 모듈 사용
```
import mymodule
message = mymodule.say('이름')
print(message)
```
> import 문
+ 모듈을 로드함
	+ 모듈 이름의 네임스페이스(mymodule)를 생성한다.
	+ 새로 생성된 네임스페이스 안에서 모듈의 코드를 실행한다.
	+ 모듈을 호출한 곳에 이 모듈 네임스페이스를 가르키는 이름을 생성한다.
+ 모듈의 함수와 전역 변수 접근
	+ 모듈 네임스페이스.함수(또는 전역 변수)

```
from mymodule import say
message = say('이름')
print(message)
```
> from ... import문
+ 모듈 안에서 특정한 함수나 전역변수를 로드함
+ 모듈 네임스페이스를 지정하지 않고도 해당 함수나 전역변수를 사용할 수 있음
+ 식별자 이름이 충돌할 수 있으므로 가능한 한 사용하지 않는 것이 좋음
+ from ... import *문

```
if __name__ == '__main__':
print(__name__, '모듈은 사용자가 직접 실행하고 있습니다.')
else:
print(__name__,'모듈은 다른 모듈에서 임포트되고 있습니다.')
```
>__name__ 속성
+ 모듈의 이름
+ __main__은 사용자가 직접 실행한 모듈임


## dir 내장 함수
```
print(dir(mymodule))
```
> 모듈에 정의되어 있는 식별자 목록을 반환함
+ 내장 속성
__builtins__, __cached__, __doc__, __file__, __loader__, __name__, __package__, __spec__

## sys 모듈
```
import sys
print('명령행 인수는 :')
for i in sys.argv:
print(i)
print('\nPYTHONEPATH : ',sys.path)
```
+ sys.argv : 명령행 인수 목록
+ sys.path : PYTHONEPATH 환경 변수

# 패키지
> 모듈이 포함되는 계층적 구조
+ __init__.py라는 특별한 파일이 포함된 서브 디렉터리 생성
	+ __all__=['파일명1','파일명1'] 지정
## sys 모듈 사용
+ sys.argv
	+ 명령행 인수 목록
+ sys.path
	+ PYTHONPATH 환경 변수




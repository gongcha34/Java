# 인터페이스

> 맞춤법 검사기 프로그래밍

# 주요 기능
> Sanner에 입력한 값을 find 메서드를 이용해서 단어의 맞춤법 확인하기

# 동작 원리
+ WordProcessor(Main)클래스에 SpellingChecker sc1 = new SpellingCheckerImpl();, Dictionary dic = (SpellingCheckerImpl) sc1; 인스턴스 생성
+ SpellingCheckerImpl 클래스 안에 find 메서드를 실행하여 Sanner 출력값에 따라 SpellingCheckerImpl에 저장된 값들을 비교한다.
+ 올바른 단어이면 그대로 출력하고, 틀린 단어이면 옳은 단어로 수정해주고 틀린 이유를 알려줌, SpellingCheckerImpl 클래스에 없는 단어이면 "저장되지 않은 단어입니다" 출력하기.

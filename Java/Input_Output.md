# IO 기반 입출력 및 네트워킹
## IO 패키지 소개
> 프로그램이 데이터를 입력받을 때에는 입력 스트림, 데이터를 보낼 때에는 출력 스트림이라고 부른다, 프로그램이 네트워크상의 다른 프로그램과 데이터 교환을 하기 위해서는 입력 스트림과 출력스트림이 따로 필요하다.

### java.io 패키지
> 자바의 기본적인 데이터 입출력 API 제공

## InputStream&OutStream

- 바이트 기반 입력 스트림의 최상위 클래스로 추상 클래스이다.
- 주요메서드 중 read()는 더 이상 읽어올 값이 없으면 -1을 리턴한다.
- 스트림을 이용한 뒤 꼭 close()로 마무리한다. (자원을 닫아주는 개념)
- OutStream 주요메서드 중 출력 스트림으로부터 바이트를 보낼 때 flush()를사용하여 잔류하는 모든 바이트를 출력해야한다. (데이터를 완전히 전송함)

# 파일 클래스

- 파일 시스템의 파일을 표현하는 클래스
- 파일 크기, 파일 속성, 파일 이름등의 정보 제공
- 파일 생성 및 삭제 기능 제공
- 디렉토리를 생성하고 디렉토리에 존재하는 파일 리스트를 얻어내는 기능 제공

```
// 파일 객체 생성
File file = new file("C:\\Temp\\file.txt");
// 파일 또는 디렉토리 존재 유무 확인
// 파일이 존재하지 않아서 File 객체는 만들어지기 때문에
// 파일 존재 유무를 확인하는 exists()를 실행한다.
boolean isExist = file.exists();
```

## FileInputStream

- 파일로부터 바이트 단위로 읽어 들일 때 사용
- 그림, 오디오, 비디오, 텍스트 파일등 모든 종류의 파일을 읽을 수 있다.
- 객체 생성 방법

```
// 첫번째 방법
FileInputStream fis = new FileInputStream("C:/Temp/image.gif");
// 두번째 방법
File file = new File("C:/Temp/image.gif");
FileInputStream fis = new FileInputStream(file);

```

- FileInputStream  객체가 생성될 때 파일과 직접 연결
- 만약 파일이 존재하지 않으면 FileNotFoundException 발생
- try-catch문으로 예외 처리 해야함.
- InputStream 하위 클래스이므로 사용 방법이 InputStream 과 동일

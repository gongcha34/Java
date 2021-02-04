#Ajax
> Ajax 웹 브라우저와 웹서버가 내부적으로 데이터 통신을 하게 해주는 통신 방식이다.
```
$.ajax({
url: '주소',
type: 'get 또는 post',
data: {보낼 데이터},
dataType: 'json, xml, script, text 또는 html',
})
.done( function(response) {
	// 성공 시 동작
})
.fail(function( jqXHR, textStatus, error ) { //error: NullPointException등 404는 안뜸!
	alert( "Request failed: " + textStatus ); // 에러 메세지
});
.always(function(response) {
	// 성공하든 실패하든 항상 할 동작
});
```
# JSON
> 자바스크립트의 객체 표현식과 유사한 방식으로 데이터를 주고 받는 방법이다.
```
{
  "users": [
    {"name": "Alice", "age": 10, "gender": "female"},
    {"name": "Bob", "age": 42, "gender": "male"},
    {"name": "Chris", "age": 21, "gender": "male"}
  ]
}
```
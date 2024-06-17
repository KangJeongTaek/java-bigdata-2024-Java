# java

## 자바의 특징
1. 운영 체제에 독립적이다.
   - 자바 가상 머신으로 실행되기 때문에 운영 체제와 상관없이 자바 런타임을 설치환 환경이라면 어디든 실행할 수 있다.
   ![image](https://github.com/KangJeongTaek/java-bigdata-2024-Java/assets/158122796/a22da207-7df7-4ede-b2da-c4805d517cd6)
2. 객체 지향 프로그래밍
   - 먼저 객체를 만들고, 이 객 체를 서로 연결해서 더 큰 프로그램을 완성시키는 기법을 활용한 언어이다.
3. 메모리 자동 정지
   - RAM을 자동 관리하므로, 메모리 관리의 수고스러움을 덜고 핵심 기능 작성에 집중할 수 있다.
4. 무료 라이브러리 풍부
   - 무료로 다운로드해서 사용할 수 있는 오픈 소스 라이브러리가 풍부하다.
  
## JDK 설치
- JDK에는 2 종류가 있다.
  
|구분|Open JDK|Oracle JDK|
|---|---|---|
|라이선스|GNU GPL version 2|Oracle Technology Network License|
|사용료|무료|개발학습용 : 무료, 상업용 : 유료|
|개발 소스 공개 의무|없음|없음|

- [이클립스 재단에서 관리하는 어답티움 사이트]((https://adoptium.net)
- 환경 변수 설정
  - JAVA_HOME 환경 변수를 생성하고 Path 환경 변수 수정
  ```shell
  >java -version
   openjdk version "17.0.3" ....
  ...
  >javac -version
  javac 17.0.3
  ```
- IDE(Visual Studio Code) 설치
  - [Visual Studio Code](https://code.visualstudio.com/)
  - 확장 Extension for Java 설치

## 변수

### 기본형 변수
- 정수형 : byte, short, int ,long
- 실수형 : float, double
- 문자형 : char
- 논리형 : boolean

__String 타입은 자바 기본 타입에 속하지 않는 참조 타입이다.__

### 변수 선언
- 변수는 하나의 값을 저장할 수 있는 메모리 번지에 붙여진 이름
```java
int score; //변수 선언
score =90; //값 대입
```
- __변수가 메모리에 할당되는 것은 변수에 최초로 값이 대입될 때 이다.__
- 변수에 최초로 값을 대입하는 행위를 초기화라고 한다.

### 자동 타입 변환
- 값의 허용 범위가 작은 타입이 허용 범위가 큰 타입으로 되입될 때 발생
```java
byte byteValue = 10;
int intValue = byteValue; //자동 타입 변환됨
```

### 강제 타입 변환
- 큰 허용 범위 타입 -> 작은 허용 범위 타입
```long
long longvalue = 300;
int intValue = (int) longValue;
```

## 연산자

### 부호/증감 연산자

|연산식|설명|
|---|---|
|+|피연산자의 부호 유지|
|-|피연산자의 부호 변경|

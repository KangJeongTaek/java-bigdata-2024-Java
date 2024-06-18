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

- [이클립스 재단에서 관리하는 어답티움 사이트](https://adoptium.net)
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
- 부호 연산자
<table>
  <tr>
    <td colspan="2">연산식</td>
    <td>설명</td>
  </tr>
  <tr>
    <td>+</td>
     <td>피연산자</td>
     <td>피연산자의 부호 유지</td>
  </tr>
   <tr>
      <td>-</td>
      <td>피연산자</td>
      <td>피연산자의 부호 변경</td>
   </tr>
</table>

- 증감 연산자
<table>
  <tr>
    <td colspan="2">연산식</td>
    <td>설명</td>
  </tr>
  <tr>
    <td>++</td>
     <td>피연산자</td>
     <td>피연산자의 값을 1 증가시킴</td>
  </tr>
   <tr>
      <td>--</td>
      <td>피연산자</td>
      <td>피연산자의 값을 1 감소시킴</td>
   </tr>
      <tr>
      <td>피연산자</td>
      <td>--</td>
      <td>다른 연산을 수행한 후에 피연산자의 값을 1증가시킴</td>
   </tr>
      <tr>
      <td>피연산자</td>
      <td>++</td>
      <td>다른 연산을 수행한 후에 피연산자의 값을 1 감소시킴</td>
   </tr>
</table>

- 산술 연산자
<table>
   <tr>
      <td colspan="3">연산식</td>
      <td>설명</td>
   </tr>
   <tr>
      <td>피연산자</td>
      <td>+</td>
      <td>피연산자</td>
      <td>덧셈 연산</td>
   </tr>
      <tr>
      <td>피연산자</td>
      <td>-</td>
      <td>피연산자</td>
      <td>뺄셈 연산</td>
   </tr>
      <tr>
      <td>피연산자</td>
      <td>*</td>
      <td>피연산자</td>
      <td>곱셈 연산</td>
   </tr>
      <tr>
      <td>피연산자</td>
      <td>/</td>
      <td>피연산자</td>
      <td>나눗셈 연산</td>
   </tr>
      <tr>
      <td>피연산자</td>
      <td>%</td>
      <td>피연산자</td>
      <td>나눗셈의 나머지를 산출하는 연산</td>
   </tr>
</table>

### 오버플로우와 언더플로우
- 오버 플로우 : 타입이 허용하는 최대값을 벗어나는 것
- 언더 플로우 : 타입이 허용하는 최소값을 벗어나는 것
  ```java
  byte value = 127;
  value++;               //value 값에 1을 더함
  System.out.println(value); // -128 오버 플로우 발생

  byte value2 = -128;
  value--;   //value 값에 1을 뺌
  System.out.println(value); // 127 언더 플로우 발생
  ```

### 비교 연산자
<table>
   <tr>
      <td>구분</td>
      <td colspan="3">연산식</td>
      <td>설명</td>
   </tr>
   <tr>
      <td rowspan="2">동등 비교</td>
      <td>피연산자1</td>
      <td>==</td>
      <td>피연산자2</td>
      <td>두 피연산자의 값이 같은지를 검사</td>
      <tr>
         <td>피연산자1</td>
         <td>!=</td>
         <td>피연산자2</td>
         <td>두 피연산자의 값이 다른지를 검사</td>
      </tr>
   </tr>
   <tr>
      <td rowspan="4">크기 비교</td>
      <td>피연산자1</td>
      <td>></td>
      <td>피연산자2</td>
      <td>피연산자1이 큰지를 검사</td>
      <tr>
         <td>피연산자1</td>
         <td>>=</td>
         <td>피연산자2</td>
         <td>피연산자1이 크거나 같은지를 검사</td>
      </tr>
      <tr>
         <td>피연산자1</td>
         <td><</td>
         <td>피연산자2</td>
         <td>피연산자1이 작은지를 검사</td>
      </tr>
      <tr>
         <td>피연산자1</td>
         <td><=</td>
         <td>피연산자2</td>
         <td>피연산자1이 작거나 같은지를 검사</td>
      </tr>
   </tr>
</table>


### 논리연산자
1. AND(논리곱) - 피연산자 모두가 true일 경우에만 연산 결과가 true
2. OR(논리합) - 피연산자 중 하나만 true이면 연산 결과는 true
3. XOR(배타적 논리합) - 피연산자가 하나는 true이고 다른 하나가 false일 경우에만 연산 결과가 true
4. NOT(논리부정) - 피연산자의 논리값을 바꿈

### 비트 논리 연산자
1. AND(논리곱) - 두 비트 모두 1일 경우에만 연산 결과가 1
2. OR(논리합) - 두 비트 중 하나만 1이면 연산 결과는 1
3. XOR(배타적 논리합) 두 비트 중 하나는 1이고 다른 하나가 0일 경우 연산 결과는 1
4. NOT(논리부정) - 보수

### 비트 이동 연산자
1. a << b - 정수 a의 각 비트를 b만큼 왼쪽으로 이동. 오른쪽 빈자리는 0으로 채움
2. a >> b - 정수 a의 각 비트를 b만큼 오른쪽으로 이동. __왼쪽 빈자리는 최상위 부호 비트와 같은 값으로 채움__
3. a >>> b - 정수 a의 각 비트를 b만큼 오른쪽으로 이동. __왼쪽 빈자리는 0으로 채움__

### 삼항(조건) 연산자
- 조건식 ? 값 또는 연산식 : 값 또는 연산식
   - 조건식이 true라면 콜론 앞의 피연산자가 선택 false이면 콜론 뒤의 피연산자 선택
 
## 조건문과 반복문
|조건문|반복문|
|---|---|
|if 문, switch문|for 문, while 문, do-while 문|

### if 문
```java
if(조건식){
   실행문;
   실행문;
   ...
}else if(조건식2){
}else{
}
```
- if 문 블록 내부에서 또 다른 if문을 사용할 수 있다. <-- 중첩 if문

### switch 문
```java
switch(변수){
   case 값1:
      break;
   case 값2:
      break;
   default;
}
```

### for 문
- 정해진 횟수만큼 반복
```java
int sum = 0;
for(int i=1;i<=100;i++){
   sum = sum + i;
}
```

### while 문
- 조건식이 true일 경우에 계속해서 반복
```java
while(조건식){
   실행문;
}
```

### do-while 문
- 블록 내부를 먼저 실행시키고 실행 결과에 따라서 반복 실행을 계속할지 결정하는 경우
```java
do{
   실행문
}while(조건식);
```

### break 문
- for 문, while 문, do-while 문을 실행 중지하거나 조건문인 switch 문을 종료할 때 사용
- 제어문에 이름(레이블)을 부여하면 원하는 곳까지 빠져나올 수 있게 만들 수 있다.

### continue 문
- 블록 내부에서 continue 문이 실행되면 for 문의 증감식 또는 while 문, do-while 문의 조건식으로 바로 이동 한다.

# 객체지향 프로그래밍

## 데이터 타입 분류
- 자바의 데이터 타입은 크게 [기본 타입](#변수)과 참조 타입이 있다.
   - 기본 타입은 stack 영역에 저장
   - 참조 타입이란 객체의 번지를 참조하는 타입으로 배열, 열거, 클래스, 인터페이스 타입이 있다.(heap영역에 저장)
  
## 메모리 사용 영역
![image](https://github.com/KangJeongTaek/java-bigdata-2024-Java/assets/158122796/1f654dc0-5f78-41f9-81c6-c7f722de0da5)

### 메소드 영역
- 바이트 파일을 읽은 내용이 저장되는 영역
- 클래스별로 상수, 정적 필드, 메소드 코드, 생성자 코드 등이 저장된다.
### 힙 영역
- 객체가 생성되는 영역
- 객체의 번지는 메소드 영역과 스택 영역의 상수와 변수에서 참조할 수 있다.

### 스택 영역
- 메소드를 호출할 때마다 생성되는 프레임이 저장되는 영역
- 메소드 호출이 끝나면 프레임은 자동 제거 된다.
- 프레임 내부에는 로컬 변수 스택이 있고, 여기에서 기본 타입 변수와 참조 타입 변수가 생성되거 제거된다.

### 참조 타입 변수의 ==, != 연산
- 참조 타입 변수의 값은 객체의 번지이므로 참조 타입 변수의 ==, != 연산자는 ㅓㄴ지를 비교하는 것이 된다. 즉, 동일한 객체를 참조 하는 것인지 확인하는 것이다.

### null과 NullPointerException
- 참조 타입 변수는 아직 번지를 저장하고 있지 않다는 뜻으로 null 값을 가질 수 있다.
- 변수가 null인 상태에서 객체의 데이터나 메소드를 사용하려 하면 __NullPointerException__예외가 발생한다.

### 문자열 타입
- 자바의 문자열은 String 객체로 생성된다.
- 문자열의 비교
   - 내부 문자열만을 비교할 경우에는 String 객체의 equals() 메소드를 사용한다.
- 문자 추출 = charAt()
- 문자열 길이 = length()
- 문자열 대체 = replace()
- 문자열 잘라내기 = substring()
- 문자열 찾기 = indexof()
- 문자열 분리 = split()

### 배열 타입
- 배열은 같은 타입의 값만 관리한다
- 배열의 길이는 늘리거나 줄일 수 없다
- 배열 변수 선언
  ```java
  타입[] 변수;
  타입 변수[];

  int[] intArray;
  double[] doubleArray;
  String[] strArray;

  int intArray[];
  double doubleArray[];
  String strArray[];
  ```
- 값 목록으로 배열 생성
  ```java
  타입[] 변수 = {값0,값1,값2,값3,...}
  String[] season = {"Spring","Summer","Fall","Winter"}

  season[1] = "여름";
  ```
- new 연산자로 배열 생성
  ```java
  타입[] 변수 = new 타입[길이];

  int[] intArray = new int[5];

  String[] names = new String[30];
  ```

- 배열 길이
   ```java
  배열변수.length;
   ```
### 다차원 배열
![image](https://github.com/KangJeongTaek/java-bigdata-2024-Java/assets/158122796/bf6f0873-983c-4c14-943c-0baed6babf26)

```java
변수[1차원인덱스][2차원인덱스][N차원인덱스]
int [][] scores ={
   {80,90,96},
   {76,88}
}
```
- new 연산자로 다차원 배열
```java
타입[][] 변수 = new 타입[1차원수][2차원수];
```


Explain JAVA branch
===
  "Java" branch에 있는 file들에 대한 설명
  
1. Test1

   - 두 개의 실수를 입력받는데 사용자는 command line에 값을 입력해야 한다.
  
   - 값을 입력하지 않은 경우에 대한 경고 메시지를 사용하기 위해 args.length(즉, command line에 입력한 문자의 갯수)가 2가 아닌 경우에 대한 if문을 작성해준다.
  
   - command line으로 입력받은 값은 자료형이 String이므로 double형태로 변환을 시켜줘야 연산이 가능.
    
     - Double.parseDouble() : Double클래스(wrapper class)에 있는 parseDouble() 메소드  
       - **_wrapper class_ : 기초자료형(Integer, Double, Byte, Float, ... )을 클래스로 포장한 것, 기본형 타입을 객체로 변환**  
       - **_java.lang_ 패키지 : import하지 않아도 사용가능 (System, String, wrapper class, ...)**  
  
   - 나눈 결과가 정수인지 확인하려면 %(나머지연산자) 이용하면 된다. 즉, _a % 1_ 값이 0 이라면 a는 정수이다.

   - 출력할 때 진수 형식 맞게 표현
    
     - 10진수(~) : %d
     - 8진수(0~) : %o
     - 16진수(0x~) : %x(%h)
    
   - +.3f : 부호 표기하고, 소수 아래 3자리 표시

---

2. Test3 
   - **bit shift 연산자 _(<<, >> , >>>)_**
     1) x << y  : x를 왼쪽으로 y 비트만큼 이동.  빈자리는 모두 0으로 채워진다.    
     2) x >> y  : x를 오른쪽으로 y 비트만큼 이동. 빈자리는 부호비트와 같은 값으로 채워진다.  
     3) x >>> y : x를 오른쪽으로 y 비트만큼 이동. 빈자리는 모두 0으로 채워진다.  
     - 따라서 값이 음수인지 확인하고 싶은 경우, bit shift 연산자를 이용하여 부호비트(최상위비트)를 판단하면 된다.
     
   - **음수 표현(비트연산자 이용)**
     - '~ a + 1'을 하면 부호는 반대로
   
   - **/와 % 연산자**
     - / : 몫을 구하는 연산
     - % : 나머지 구하는 연산
     
---

3. Test4 
   - **패턴을 출력하는 경우 : 패턴에 대한 일반식을 구하고 이에 따라 반복문(_for문_)을 사용**
   - [실행결과 예시]
     - 3을 입력한 경우,  
     
      ![test4](https://user-images.githubusercontent.com/44759154/48612955-c3f54a00-e9cd-11e8-9270-fad43c575935.JPG)

   - break : 반복문 빠져나오는 기능    
   
     
   







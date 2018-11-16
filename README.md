# Taylor series in Matlab

## Taylor series of cosine function


**Taylor series**

![taylor](https://user-images.githubusercontent.com/44759154/48614994-fb1a2a00-e9d2-11e8-97c7-70316d935f7e.JPG)

---

**Matlab code**
(주의) 매트랩에서 파일명과 main 함수의 이름은 일치시킨다.

  1) _size()_ : matrix의 사이즈를 알려준다. 
     - '[x, y] = size(A)' 을 하면,  x에는 **행의 개수**,    y에는 **열의 개수**가 저장된다.
---     
  2) _zeros()_ : 모든 원소의 값이 0인 행렬 만들어 준다.
---  
  3) _length()_ : 원소의 갯수를 구해준다.
---  
  4) _반복문_
     - **for문**
     
     
       ![for](https://user-images.githubusercontent.com/44759154/48615605-b68f8e00-e9d4-11e8-91ed-cfe3f749a99d.JPG)

       - 제어변수를 이용해 실행문을 작성하고, 제어변수의 값은 시작값부터 끝값까지 설정한 간격에 맞게 변하게 된다.
       
       
     - **while문**
     
     
        ![while](https://user-images.githubusercontent.com/44759154/48615778-29990480-e9d5-11e8-980f-716617ca6103.JPG)
        
       - 조건문을 만족하지 않을 때까지 실행문을 반복한다.

---
  5) _switch문_
    
       ![switch](https://user-images.githubusercontent.com/44759154/48616229-4eda4280-e9d6-11e8-89b0-9e7cb8f52b84.JPG)
       
     - test표현의 값에 따라 다른 실행문이 실행된다.   

---      
  6) _그래프 그리기_
     - **plot** : 연속인 그래프 그리는 경우
       - 그래프 색 
         - b : BLUE
         - g : GREEN
         - r : RED
         - k : BLACK
         
       - 그래프 symbol 모양
         - o : circle
         - s : square
         - p : pentagram
         
       - 선 굵기
         - 'LineWidth', 원하는 굵기(숫자)
         
     - **stem** : 주로 discrete한 경우

---
[_실행예시_]
- a = pi/8, 5번째 미분항까지 더하는 경우
  - 명령창 코드
    
    ![default](https://user-images.githubusercontent.com/44759154/48616379-cad48a80-e9d6-11e8-9dd8-998a43e9e5b3.JPG)
  
  - 그래프 결과
   
    ![default](https://user-images.githubusercontent.com/44759154/48616419-ea6bb300-e9d6-11e8-9df3-3849c96c83fc.JPG)

  

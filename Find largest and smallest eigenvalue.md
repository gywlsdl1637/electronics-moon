# Eigenvalue And Eigenvector

## Concept
   - **Eigenvalue** : 어떤 벡터 {x}에 대해 [M]{x} = b{x} 을 만족한다고 가정하였을 때, **b**를 행렬 M에 대한   _eigenvalue_ 라 한다. 
     cf) **b** 구하는 법 : _det([M]-b[I])=0_ 을 만족하는 b를 구한다.
     - det() : 행렬의 determinant 
     - I : 단위행렬(identiy matrix), 주 대각선의 원소가 모두 1이며 나머지 원소는 모두 0이다.
           ![image](https://user-images.githubusercontent.com/44759154/48930529-77ad8b00-ef34-11e8-95c5-d4ef90a7a579.png)

     - Example) 
       ![image](https://user-images.githubusercontent.com/44759154/48930626-2a7de900-ef35-11e8-99db-031043334d90.png)
       - [M]-b[I] :
    ![image](https://user-images.githubusercontent.com/44759154/48930597-f0ace280-ef34-11e8-8a34-4202f957bd76.png)  
       - det([M]-b[I])
       ![image](https://user-images.githubusercontent.com/44759154/48930717-b4c64d00-ef35-11e8-8cd7-e3731e9e61c9.png)  
       
       따라서, eigenvalue는 -1과 7이다.
    
     
   - **Eigenvector** : 이 때, 벡터 {x}를 _eigenvector_ 라고 한다. (단, zero vector는 불가능)
     cf) zero vector : 벡터 성분이 모두 _zero_ 인 vector
     - Example에서 구한 eigen value값이 7인 경우에 대한 eigenvector 
       ([M]-b[I]){x} = 0에서 
        ![image](https://user-images.githubusercontent.com/44759154/48930981-408ca900-ef37-11e8-9b25-8210c4477684.png)
      즉, x1 = x2이므로 구하고자 하는 eigenvector 
         ![image](https://user-images.githubusercontent.com/44759154/48931033-98c3ab00-ef37-11e8-9335-161dd1f8d09b.png)
    
    - **Symmetric matrix** : transpose(행과 열 성분을 바꿈)한 것과 동일한 square matrix
                             즉, 대각선을 기준으로 성분값이 동일한 matrix
        ![image](https://user-images.githubusercontent.com/44759154/48932029-d414a880-ef3c-11e8-9fc6-b5d688674670.png)

    - **Square matrix** : row와 column의 수가 같은 matrix
___
# Advanced
## Power method : 가장 큰 eigenvalue와 그에 따른 eigenvector를 찾는 반복법
(가장 작은 eigenvalue를 구할 땐 M의 역행렬을 power method에 적용하면 가장 큰 eigenvalue 1/b를 찾으므로 
가장 작은 eigenvalue **b**를 구할 수 있다.) 
  - 방법 :
    1) 초기벡터를 설정(주로 벡터의 성분이 모두 1인 column vector 이용)하여 행렬 M가 곱해준다. 
      cf) 초기벡터
      ![image](https://user-images.githubusercontent.com/44759154/48931354-35d31380-ef39-11e8-965c-07fb11b7159c.png)
    2) 그에 따른 eigenvalue와 eigenvector가 구해준다.
    3) 구한 eigenvector를 다시 행렬 M가 곱해준다.
    4) 위의 과정을 반복하다보면 eigenvalue값이 가장 큰 eigenvalue에 수렴하게 되고, 그에 따라 eigenvector도
     참값에 수렴하게 된다.  
  


___

# Goals (find largest or smallest eigenvalue)
1. eigenvalue와 eigenvector를 구하기 전, 행렬 A가 square matrix이면서 symmetric matrix인지 확인을 한다.
    (아닌 경우에는 error를 이용해 square and symmetric인 matrix를 넣어달라고 출력해준다.)
2. 확인이 끝나면, 사용자로부터 가장 큰 eigenvalue를 찾을지 가장 작은 eigenvalue를 찾을지에 대해 입력값으로 설정을 받도록 해준다.
    (가장 큰 eigenvalue는 1, 가장 작은 eigenvalue는 2를 입력. 이외의 입력에 대해서는 error로 출력)

___

# Code Explanation
  
  
  
___

# Run a Matlab Program 
  - 명령창 코드
  
    ![image](https://user-images.githubusercontent.com/44759154/48931891-1db0c380-ef3c-11e8-8310-1ed40c0aae11.png)  

  - 실행 결과
   
    ![image](https://user-images.githubusercontent.com/44759154/48931910-33be8400-ef3c-11e8-93f1-91ceb970900d.png)

function [eig_val, eig_vec] =  find_eigen(A, es, maxit)
 %행렬 A가 square인지 확인하는 구문
[r, c] = size(A); 
if r == c, fprintf('Square matrix\n');
else 
    error('NOT Square matrix. Please enter Square matrix'); % square matrix가 아니면 error를 띄우고 종료
end

%내장함수 issymmetric을 이용하여 행렬 A가 대칭행렬인지 확인하는 구문
if issymmetric(A) == 1, fprintf('Symmetric matrix\n'); 
else error('NOT Symmetric matrix. Please enter Symmetric matrix'); 
end

%기능 선택 구문
fprintf('원하는 기능을 선택하세요. 가장 큰 eigenvalue(1) or 가장 작은 eigenvalue(2)\n');
n = input('선택 : ');

if n == 1, [eig_val, eig_vec] = power_method(A,es,maxit);    
elseif n == 2
    X = inv(A); %가장 작은 eigenvalue를 찾을 때는 inverse행렬을 power method해줘야함
    [val ,eig_vec] = power_method(X, es, maxit);
    eig_val = 1/val; 
else error('1 또는 2만 입력하세요.\n');
end

end

%가장 큰 eigenvalue를 구하고, eigenvector를 찾는 함수
function [val,vec] = power_method(A,es,maxit)
r = length(A(:,1)); %초기 벡터 생성을 위한 행렬A의 행 길이 변수 생성
initvec = ones(r,1); % 초기 벡터 지정
val = 0;
iter = 0;%반복횟수 저장 변수
ea = 100; %근사상대오차 초기값 지정

    while(1)
            oldval = val;
            result = A * initvec;
            maxval = max(abs(result));
            for k = 1 : length(result)
                %절대값인 큰 게 음수인지 양수인지 판단하여 그에 맞게 eigenvalue로 저장하기 위한 if문
                if (result(k,1) == (-1)*maxval) | (result(k,1) == maxval), finalmax = result(k,1);
                end
            end

            val = finalmax; %절대값이 가장 큰 eigenvalue를 최종값(val)에 대입
            vec = result/finalmax ;
            initvec = vec;
            
            iter = iter+1;
            if iter>=2, ea = abs((val-oldval)/val) * 100; end %두번째 iteration부터 근사상대오차 계산
            if ea <= es | iter >= maxit, break, end %반복횟수 초과 및 허용오차 만족 판단 
    end
end



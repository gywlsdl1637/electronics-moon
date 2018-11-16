function cos_Taylor_sample (x, a, n)
    y= zeros(size(x)); % 1x4 행렬 만들기
    for j=1 : length(x)  % 벡터의 크기(원소의 갯수)  
        y(j) = cos(a);
    
         for i = 1:n  
             y(j)= y(j) + (diff(i,a) * ((x(j)-a)^i) / factorial(i));   
         end
    end
   
   plot(x,y, 'r:o', 'LineWidth',4); % 그래프 색(red), 모양(circle) , 굵기 선택
end

function diff_equation = diff(n,a)  % cos함수 미분하기
    switch mod(n,4) % cos함수는 4번을 기준으로 미분한 결과가 동일하게 나오므로 나머지 함수 사용
        case 0
            diff_equation = cos(a);
        case 1 
            diff_equation = (-1) * sin(a);
        case 2 
            diff_equation = (-1) * cos(a);
        case 3 
            diff_equation = sin(a);
    end
end

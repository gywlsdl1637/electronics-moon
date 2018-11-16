function cos_Taylor_sample (x, a, n)
    y= zeros(size(x)); % 1x4 ��� �����
    for j=1 : length(x)  % ������ ũ��(������ ����)  
        y(j) = cos(a);
    
         for i = 1:n  
             y(j)= y(j) + (diff(i,a) * ((x(j)-a)^i) / factorial(i));   
         end
    end
   
   plot(x,y, 'r:o', 'LineWidth',4); % �׷��� ��(red), ���(circle) , ���� ����
end

function diff_equation = diff(n,a)  % cos�Լ� �̺��ϱ�
    switch mod(n,4) % cos�Լ��� 4���� �������� �̺��� ����� �����ϰ� �����Ƿ� ������ �Լ� ���
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

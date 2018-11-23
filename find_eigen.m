function [eig_val, eig_vec] =  find_eigen(A, es, maxit)
 %��� A�� square���� Ȯ���ϴ� ����
[r, c] = size(A); 
if r == c, fprintf('Square matrix\n');
else 
    error('NOT Square matrix. Please enter Square matrix'); % square matrix�� �ƴϸ� error�� ���� ����
end

%�����Լ� issymmetric�� �̿��Ͽ� ��� A�� ��Ī������� Ȯ���ϴ� ����
%if issymmetric(A) == 1, fprintf('Symmetric matrix\n');

%�����Լ� ������� �ʰ� ��Ī���� Ȯ���ϴ� ����
count = 0;
for i = 1 : r
    for j = 1 : c
        if A(i,j) == A(j,i), count = count +1;
        end
    end
end

if count == r*c, fprintf('Symmetric matrix\n'); 
else error('NOT Symmetric matrix. Please enter Symmetric matrix'); 
end

%��� ���� ����
fprintf('���ϴ� ����� �����ϼ���. ���� ū eigenvalue(1) or ���� ���� eigenvalue(2)\n');
n = input('���� : ');

if n == 1, [eig_val, eig_vec] = power_method(A,es,maxit);    
elseif n == 2
    X = inv(A); %���� ���� eigenvalue�� ã�� ���� inverse����� power method�������
    [val ,eig_vec] = power_method(X, es, maxit);
    eig_val = 1/val; 
else error('1 �Ǵ� 2�� �Է��ϼ���.\n');
end

end

%���� ū eigenvalue�� ���ϰ�, eigenvector�� ã�� �Լ�
function [val,vec] = power_method(A,es,maxit)
r = length(A(:,1)); %�ʱ� ���� ������ ���� ���A�� �� ���� ���� ����
initvec = ones(r,1); % �ʱ� ���� ����
val = 0;
iter = 0;%�ݺ�Ƚ�� ���� ����
ea = 100; %�ٻ������ �ʱⰪ ����

    while(1)
            oldval = val;
            result = A * initvec;
            maxval = max(abs(result));
            for k = 1 : length(result)
                %���밪�� ū �� �������� ������� �Ǵ��Ͽ� �׿� �°� eigenvalue�� �����ϱ� ���� if��
                if (result(k,1) == (-1)*maxval) | (result(k,1) == maxval), finalmax = result(k,1);
                end
            end

            val = finalmax; %���밪�� ���� ū eigenvalue�� ������(val)�� ����
            vec = result/finalmax ;
            initvec = vec;
            
            iter = iter+1;
            if iter>=2, ea = abs((val-oldval)/val) * 100; end %�ι�° iteration���� �ٻ������ ���
            if ea <= es | iter >= maxit, break, end %�ݺ�Ƚ�� �ʰ� �� ������ ���� �Ǵ� 
    end
end



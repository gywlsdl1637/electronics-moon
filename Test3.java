// -1000�ʰ� 1000�̸��� �Ǽ��� �Է¹޾�
//�� �Ǽ��� ������ �����κи� ��� 
// ������ ����ϴ� �������� /, *,% ������� ���� ��Ʈ������ ���, ������� �������� �Ǵ��� �� ��Ʈ������ ���. 
//�� ������ ��, ��, ���� �ڸ��� ������ ���. �� �ڸ��� 0�� ��� ���� ���
 
import java.util.Scanner;

class Test3{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.print("-1000 �ʰ�, 1000 �̸��� �Ǽ� : ");
		double a = s.nextDouble(); //double�� ���� ����
		int a_int = (int)a; //�����κ� 
		System.out.printf("�Է��� �Ǽ��� ���� �κ� : %d\n", a_int);
		int absolute;
		if(a_int >>31 == -1) {absolute = ~(a_int)+1;}   
		//������ ���
		//�ֻ�����Ʈ(��ȣ��Ʈ)�� 1�̹Ƿ� 31bit��ŭ ���������� bit shift�ϸ� -1�� ������
		// '>>'�� ��� ���ڸ��� ��ȣ��Ʈ�� ���� ������ ä����
		//a_int >>> 31 == 1 �� ����
		else absolute = a_int;
	
		int quo,b;
		quo = absolute/100;
		b= absolute %100;
		
		if(quo ==1) System.out.printf("�� ");
		else if (quo == 0) System.out.printf("");
		else System.out.printf("%d�� ",quo);
		
		quo = b/10;
		b = b%10;
		if(quo ==1) System.out.printf("�� ");
		else if (quo == 0) System.out.printf("");
		else System.out.printf("%d�� ",quo);
		
		if(b ==1) System.out.printf("�� ");
		else if (b == 0) System.out.printf("");
		else System.out.printf("%d ",b);
		
		
	}

}
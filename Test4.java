
import java.util.Scanner; //�Է��� �޾ƾ� �ϹǷ� Scanner Ŭ���� ���. import �������.

class Test4{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int n,i,j;
		while(true){ // �ùٸ� ���� �Է��� ������ �ݺ�
			System.out.print("2�̻� 10�̸��� ���� : ");
			n = s.nextInt();
			if(n>=2 && n<10) break;
			System.out.println("[�Է¿���]2�̻� 10�̸��� ������ �Է����ּ���.");
		}
		
		for(i=1;i<=n;i++){
			for(j=1;j<=n-i;j++) System.out.print(" ");
			for(j=1;j<=i;j++) System.out.print(n);
			System.out.println();
		}
		for(i=1;i<n;i++){
			for(j=n-i;j>0;j--) System.out.print(n);
			for(j=1;j<=i;j++) System.out.print(" ");
			System.out.println();
		}
		
		
	}
}

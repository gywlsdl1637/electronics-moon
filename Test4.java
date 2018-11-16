/* 2이상 10미만의 정수 입력받을 때까지 값을 입력받고
   2이상 10미만의 정수에 해당하는 값을 입력하면 패턴에 따라 출력한다.   

*/

import java.util.Scanner; //입력을 받아야 하므로 Scanner 클래스 사용. import 해줘야함.

class Test4{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int n,i,j;
		while(true){ // 올바른 값을 입력할 때까지 반복
			System.out.print("2이상 10미만의 정수 : ");
			n = s.nextInt();
			if(n>=2 && n<10) break;
			System.out.println("[입력오류]2이상 10미만의 정수를 입력해주세요.");
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

// -1000초과 1000미만의 실수를 입력받아
//ⓐ 실수의 절댓값의 정수부분만 출력 
// 절댓값을 출력하는 과정에서 /, *,% 사용하지 말고 비트연산자 사용, 양수인지 음수인지 판단할 때 비트연산자 사용. 
//ⓑ 절댓값을 백, 십, 일의 자리로 나누어 출력. 그 자리가 0인 경우 비우고 출력
 
import java.util.Scanner;

class Test3{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.print("-1000 초과, 1000 미만의 실수 : ");
		double a = s.nextDouble(); //double형 변수 저장
		int a_int = (int)a; //정수부분 
		System.out.printf("입력한 실수의 정수 부분 : %d\n", a_int);
		int absolute;
		if(a_int >>31 == -1) {absolute = ~(a_int)+1;}   
		//음수인 경우
		//최상위비트(부호비트)는 1이므로 31bit만큼 오른쪽으로 bit shift하면 -1과 같아짐
		// '>>'의 경우 빈자리는 부호비트와 같은 값으로 채워짐
		//a_int >>> 31 == 1 과 동일
		else absolute = a_int;
	
		int quo,b;
		quo = absolute/100;
		b= absolute %100;
		
		if(quo ==1) System.out.printf("백 ");
		else if (quo == 0) System.out.printf("");
		else System.out.printf("%d백 ",quo);
		
		quo = b/10;
		b = b%10;
		if(quo ==1) System.out.printf("십 ");
		else if (quo == 0) System.out.printf("");
		else System.out.printf("%d십 ",quo);
		
		if(b ==1) System.out.printf("일 ");
		else if (b == 0) System.out.printf("");
		else System.out.printf("%d ",b);
		
		
	}

}
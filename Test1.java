//처음 받은 수를 2번째 수로 나누기
//두개의 실수를 입력받아 나눈 결과가 정수이면 그 값을 16진수로 표현하고, 아니면 소수 아래 3자리까지 출력
class Test1{
	public static void main(String [] args){
		if(args.length != 2){
			System.out.println("Usage : 두 개의 실수를 입력해주세요.");
			return;
		}
		
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		
		
		double result = a/b;
		double result1 = result%1;
		//if(b==0) System.out.println("0으로 나눈 나머지는 존재하지 않습니다.");
		if(result1==0) System.out.printf("%x",(int)result);
		else System.out.printf("%+.3f",result);
		
	}
}
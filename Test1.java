//ó�� ���� ���� 2��° ���� ������
//�ΰ��� �Ǽ��� �Է¹޾� ���� ����� �����̸� �� ���� 16������ ǥ���ϰ�, �ƴϸ� �Ҽ� �Ʒ� 3�ڸ����� ���
class Test1{
	public static void main(String [] args){
		if(args.length != 2){
			System.out.println("Usage : �� ���� �Ǽ��� �Է����ּ���.");
			return;
		}
		
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		
		
		double result = a/b;
		double result1 = result%1;
		//if(b==0) System.out.println("0���� ���� �������� �������� �ʽ��ϴ�.");
		if(result1==0) System.out.printf("%x",(int)result);
		else System.out.printf("%+.3f",result);
		
	}
}
package level0;

public class Finite_decimal {

	public int solution(int a, int b) {
		//���� a, �и� b 
        b /= gcd(a,b);
        while(b%2==0) {b/=2;}
        while(b%5==0) {b/=5;}
        return b==1?1:2; //2�� 5�� �� �������� 1�̸� ���ѼҼ���.
    }
	//��Ŭ���� ȣ�������� �ִ����� ���ؼ� ��ȯ
	static int gcd(int a,int b) {
		if(a%b==0) {
			return b;
		}else {
			return gcd(b,a%b);
		}
	}

}

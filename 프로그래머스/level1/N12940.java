package level1;
import java.util.*;
public class N12940 {
	//���� : Ǯ�� 2
	public int[] solution2(int n, int m) {
		//��Ŭ���� ȣ������ �̿��� �ִ����� & ����� Ǯ��
		int[] arr = new int[2];
		arr[0]=gcd2(n,m);
		arr[1]=lcd2(n,m);
		return arr;
    }
	//lcd, gcd
	
	public int lcd2(int n,int m) {//�ּ� ����� =  n * m / gcd
		return n/gcd2(n,m)*m;
	}
	public int gcd2(int n,int m) {// �ִ� �����(��Ŭ���� ȣ����)
		if(m==0) return n;
		else {
			return gcd2(m,n%m);
		}
		
	}
	
	public int[] solution(int n, int m) {
        int[] answer = new int[2];
        //�ִ�����, �ּҰ���� ���
        //�ִ����� -> ��Ŭ���� ȣ����
        answer[0]=gcd(n,m);
        answer[1]=lcm(n,m);
        return answer;
    }
	public int gcd(int n,int m) {//��Ŭ���� ȣ������ �̿��� �ִ����� ���ϴ� ���
		if(m == 0){
	        return n;
	    }else{
	        return gcd(m,n%m);
	    }
	}
	public int lcm(int n,int m) {
		return n/gcd(n,m)*m;//���� 1000000������ �ڿ���-> �����÷ο� ����
	}
}

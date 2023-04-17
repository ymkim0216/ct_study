package level1;
import java.util.*;
public class N12940 {
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

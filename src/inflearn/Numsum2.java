package inflearn;

import java.util.Scanner;

public class Numsum2 {
	public static int solution(int n) {
		int cnt=0, sum= 1;//2�� �̻���� ���� => 1
		//���� �� �������� 0�̸� cnt++; 
		int tmp=n-1; // n�� �������� while �� ��ȯ, 2������ �����ϹǷ� -1����
		while(tmp>0) {
			sum++;
			tmp = tmp-sum;
			if(tmp%sum==0) cnt++;
		}
		/*for(int i=2;i<(n/2+1);i++) {
			sum+=i;
			int tmp = n-sum;
			if(sum==n) {
				cnt++; break;
			}
			if(tmp%i==0) cnt++; 
		}*/
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(solution(n));
	}
}

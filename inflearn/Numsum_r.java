package inflearn;

import java.util.Scanner;

public class Numsum_r {
	public static int solution(int n) {
		int cnt=0;
		int ep=0,sum=1,sp=2; // 2개부터 더하기 시작 = sum 1
		int tmp = n-sum;
		while(tmp>0) {
			sum += sp++;
			tmp= n-sum;
			if(tmp%sp==0) cnt++;
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(solution(n));
	}

}

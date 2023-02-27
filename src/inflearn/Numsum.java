package inflearn;
import java.util.*;
public class Numsum {
	public static int solution(int n) {
		int cnt=0, number = 1;
		int[] num = new int[n/2+1];
		for(int i=0;i<num.length;i++) {
			num[i]= number++;
		}
		int ep=0, sum =0;
		for(int sp=0;sp<num.length;sp++) {
			sum += num[sp];
			if(sum==n) cnt++;
			while(sum>=n) {
				sum-=num[ep++];
				if(sum==n) cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(solution(n));
	}
}

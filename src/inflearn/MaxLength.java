package inflearn;

import java.util.Iterator;
import java.util.Scanner;

public class MaxLength {
	public static int solution(int n,int m,int[] arr) {
		int l = 0, cnt=0, sum=0, lt=0;
		for(int rt=0;rt<n;rt++) {
			if(arr[rt]==0) cnt++;
			while(cnt>m) {
				if(arr[lt]==0) { cnt--; }
				lt++;
			}
			l = (l>rt-lt+1)?l:rt-lt+1;
		}
		return l;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();
		int numB = sc.nextInt();
		int[] a = new int[numA];
		for(int i=0;i<numA;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(solution(numA,numB,a));
	}

}

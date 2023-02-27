package inflearn;
import java.util.*;
public class Subsequence {
	public static int solution(int n,int m, int[] arr) {
		int cnt=0;
		int ep = 0, sum = 0; //sw :sliding window
		for(int sp=0;sp<n;sp++) {
			sum += arr[sp];
			if(sum==m) cnt++;
			while(sum>=m) {
				sum-=arr[ep++];
				if(sum==m) cnt++;
			}
		}
		/*while(sp<n&&ep<n) {
			if(ep==n&&sw<m) break;
			sw += arr[ep++];
			if(sw == m) {
				cnt++;
				sw -= arr[sp++];
			}else if(sw>m){
				sw -= arr[sp++];
				if(sw==m) {
					sw -= arr[sp++];
					cnt++;
				}
			}
		}*/
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();
		int numB = sc.nextInt();
		int[] a = new int[numA];
		for(int i=0;i<numA;i++) {
			a[i] = sc.nextInt();
		}
		System.out.print(solution(numA,numB,a));
	}
}

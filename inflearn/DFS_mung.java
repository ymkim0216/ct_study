package inflearn;
import java.util.*;

public class DFS_mung {
	static int n,sum=0;
	static int max=0;
	public static void solution(int L,int[] arr,int w) {
		if(L==n) return;
		else {
			if(sum+arr[L]<=w&&max<sum+arr[L]) {
				max = sum+arr[L];
			}
			sum+=arr[L];
			solution(L+1,arr,w);
			if(sum+arr[L]<=w&&max<sum-arr[L]) {
				max = sum-arr[L];
			}
			sum-=arr[L];
			solution(L+1,arr,w);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		solution(0,arr,w);
		System.out.println(max);
	}

}

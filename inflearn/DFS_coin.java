package inflearn;

import java.util.*;
public class DFS_coin {
	static int n,m,min=Integer.MAX_VALUE;
	public static void DFS(int L,int sum,Integer[] arr) {
		if(L>=min||sum>m)return;
		if(sum==m) {
			min = Math.min(min, L);
		}else {
			for(int i=0;i<n;i++) {
				DFS(L+1,sum+arr[i],arr);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		Integer[] arr = new Integer[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		m = sc.nextInt();
		Arrays.sort(arr,Collections.reverseOrder());
		DFS(0,0,arr);
		System.out.println(min);
	}

}

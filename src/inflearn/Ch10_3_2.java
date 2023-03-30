package inflearn;

import java.util.Scanner;

public class Ch10_3_2 {
	public static int solution(int[] arr,int[] dy,int n) {
		int ans=0;
		dy[0]=1;
		for(int i=1;i<n;i++) {
			int max=0;
			for(int j=i-1;j>=0;j--) {
				if(arr[j]<arr[i]&&dy[j]>max) {
					max = dy[j];
				}
			}
			dy[i]=max+1;
			ans = Math.max(dy[i], ans);
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] dy = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(solution(arr,dy,n));

	}

}

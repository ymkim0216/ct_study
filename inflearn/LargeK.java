package inflearn;

import java.util.*;

public class LargeK {
	public static int solution(int n,int k,int[] arr) {
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		int ans = -1;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int z=j+1;z<n;z++) {
					Tset.add(arr[i]+arr[j]+arr[z]);
				}
			}
		}
		int cnt=0;
		for(int i:Tset) {
			cnt++;
			if(cnt==k) return i;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] =sc.nextInt();
		}
		System.out.println(solution(n,k,arr));
	}
}

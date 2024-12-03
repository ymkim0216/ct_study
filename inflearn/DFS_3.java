package inflearn;
import java.util.*;
public class DFS_3 {
	static int n,m;
	static int ans=0;
	public static void solution(int L,int sum,int time,int[] arr1,int[] arr2) {
		if(time>m) return;
		if(L==n) {
			ans = Math.max(sum, ans);//¹®Á¦ÀÇ max
		}
		else {
			solution(L+1,sum+arr1[L],time+arr2[L],arr1,arr2);
			solution(L+1,sum,time,arr1,arr2);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		m= sc.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
			arr2[i]=sc.nextInt();
		}
		solution(0,0,0,arr1,arr2);
		System.out.println(ans);
	}
}

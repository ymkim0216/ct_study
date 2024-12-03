package inflearn;
import java.util.*;
public class DFS_math2{
	static int n,total=0;
	static boolean flag =false;
	static String ans = "NO";
	public static void DFS(int L,int sum,int[] arr) {
		if(sum>(total/2)||flag==true) return;
		if(L==n) {
			if((total-sum)==sum) {flag = true; ans = "YES"; return;}
		}else {
			DFS(L+1,sum+arr[L],arr);
			DFS(L+1,sum,arr);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt(); total +=arr[i];
		}
		DFS(0,0,arr);
		System.out.println(ans);
	}
}
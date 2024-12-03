package inflearn;
import java.util.*;
public class DFS9 {
	static int n,m;
	static int[] ans;
	public static void DFS(int L,int s) {
		if(L==m) {
			for(int x:ans) System.out.print(x+" ");
			System.out.println();
		}else {
			for(int i=s;i<=n;i++) {
				ans[L]=i;
				DFS(L+1,i+1);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		ans = new int[m];
		DFS(0,1);
		
	}

}

package inflearn;
import java.util.*;
public class DFS_s8 {
	static int n,r;
	public static int DFS(int n,int r) {
		int ans=0;
		if(n==r)return 1;
		if(r==1) return n;
		else {
			ans = DFS(n-1,r-1)+DFS(n-1,r);
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		r = sc.nextInt();
		int ans = DFS(n,r);
		System.out.print(ans);
	}

}

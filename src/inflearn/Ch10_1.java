package inflearn;
import java.util.*;
public class Ch10_1 {
	static int cnt=0;
	static int[] dy;
	public static void DFS(int L,int n) {
		if(L>n) return;
		if(L==n) {
			cnt++;
		}else {
			DFS(L+1,n);
			DFS(L+2,n);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dy = new int[n+1];
		DFS(0,n);
		System.out.println(cnt);

	}

}

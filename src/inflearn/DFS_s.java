package inflearn;
import java.util.*;
public class DFS_s {
	static int n,m;
	static int[] ans;
	static int[] ch;
	public static void solution(int L,int[] arr) {
		if(L==m) {
			for(int x:ans) {
				System.out.print(x+" ");
			}
			System.out.println();
		}else {
			for(int i=0;i<n;i++) {
				if(ch[i]==0) {
					ch[i]=1;
					ans[L]=arr[i];
					solution(L+1,arr);
					ch[i]=0;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m  =sc.nextInt();
		int[] arr = new int[n];
		ch = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();	
		}
		ans = new int[m];
		solution(0,arr);
		
	}
}

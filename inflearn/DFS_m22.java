package inflearn;
import java.util.*;
public class DFS_m22 {
	static int n,m;
	static int[] ch;
	static int[] ans;
	public static void DFS(int L,int[] arr) {
		if(L==m) {
			for(int x:ans) {
				System.out.print(x+" ");
			}
			System.out.println();
		}else {
			for(int i=0;i<n;i++) {
				if(ch[i]==0) {
					ans[L]=arr[i];
					ch[i]=1;
					DFS(L+1,arr);
					ch[i]=0;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m=sc.nextInt();
		ch=new int[n];
		ans = new int[m];
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		DFS(0,arr);
	}

}

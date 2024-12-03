package inflearn;
import java.util.*;
public class DFS_s2 {
	static int n,m;
	static int[] b;
	static int[] p;
	static int[] ch;
	static boolean flag=false;
	public static void DFS(int L,int sum) {
		if(flag) return;
		if(L==n) {
			if(sum==m) {
				for(int x:p) System.out.print(x+" ");
				flag = true;
			}
		}else {
			for(int i=0;i<n;i++) {
				if(ch[i]==0) {
					ch[i]=1;
					p[L]=i+1;
					DFS(L+1,sum+(b[L]*p[L]));
					ch[i]=0;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		b = new int[n];
		p = new int[n];
		ch = new int[n];
		for(int i=0;i<n;i++) {
			b[i] = noc(n-1,i);
		}
		DFS(0,0);
		
	}
	public static int noc(int n,int r) {
		if(r==0||n==r) return 1;
		if(r==1) return n;
		int tmp = noc(n-1,r-1)+noc(n-1,r);
		return tmp;
	}

}

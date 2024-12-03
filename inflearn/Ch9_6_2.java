package inflearn;
import java.util.*;
public class Ch9_6_2 {
	static int[] unf;
	public static int Find(int v) {
		if(v==unf[v]) return unf[v];
		else return unf[v]=Find(unf[v]);
	}
	public static void Union(int a,int b) {
		int x1 = Find(a);
		int x2 = Find(b);
		if(x1!=x2) unf[x1]=x2; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		unf = new int[n+1];
		for(int i=1;i<=n;i++) {
			unf[i]=i;
		}
		for(int i=0;i<m;i++) {
			  int a = sc.nextInt();
			  int b = sc.nextInt();
			  Union(a,b);
		}
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(unf[1]);
		if(Find(a)==Find(b)) System.out.println("YES");
		else System.out.println("NO");

	}

}

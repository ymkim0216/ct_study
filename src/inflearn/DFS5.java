package inflearn;
import java.util.*;

public class DFS5 {
	static int[] check;
	static int n;
	public static void DFS(int l) {
		if(l==n+1) {
			for(int i=1;i<=n;i++) {
				if(check[i]==1) System.out.print(i+" ");
			}
			System.out.println();
		}else {
			check[l]=1;
			DFS(l+1);
			check[l]=0;
			DFS(l+1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		check = new int[n+1];
		DFS(1);
	}

}

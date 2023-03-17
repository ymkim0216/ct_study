package inflearn;
import java.util.*;
public class DFS_p {
	static int m,n;
	static int[] arr;
	public static void DFS(int L) {
		if(L==m) {
			System.out.println(arr[0]+" "+arr[1]);
		}else {
			for(int i=1;i<=n;i++) {
				arr[L]=i;
				DFS(L+1);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m = sc.nextInt();
		int L=0;
		arr = new int[n];
		DFS(0);
	}

}

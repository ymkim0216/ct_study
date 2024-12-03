package inflearn;
import java.util.*;
public class DFS_m2 {
	static int n,m;
	static Stack<Integer> ans2;
	public static void DFS(int L,int[] arr) {
		if(L==m) {
			System.out.println(ans2.elementAt(0)+" "+ans2.elementAt(1));
		}else {
			for(int i=0;i<n;i++) {
				if(ans2.contains(arr[i])) continue;
				ans2.push(arr[i]);
				DFS(L+1,arr);
				ans2.pop();
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m=sc.nextInt();
		ans2 = new Stack<>();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		DFS(0,arr);
	}

}

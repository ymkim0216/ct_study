package inflearn;
import java.util.*;
public class DFSs {
	static int n,m;
	static ArrayList<Integer> ans;
	static int[] arr;
	public static void DFS(int L,int s) {
		if(L==m) {
			for(int x:ans) System.out.print(x+" ");
			System.out.println();
			ans.remove(L-1);
		}else {
			for(int i=s;i<n;i++) {
				ans.add(L,arr[i]);
				DFS(L+1,i+1);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		ans = new ArrayList<>();
		arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		DFS(0,0);
		
	}

}

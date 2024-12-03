package inflearn;
import java.util.*;
import java.util.stream.Stream;
public class DFS_math {
	static ArrayList<Integer> disj;
	static String ans;
	
	public static boolean disjoint(int a) {//true가 서로소.
		boolean cnt=true;
		for(int i=2;i<a;i++) {
			if(a%i==0) cnt=false; break;
		}
		return cnt;
	}
	public static void DFS(int[] arr,int l) {
		if(l==arr.length) return;
		DFS(arr,l+1);
		if(disjoint(arr[l])) {
			disj.add(arr[l]);
			arr[l]=0;
		}
		// arr[l]이 서로소면 0으로 바꿔놓고 list.add
		if(l==0) {
			int sum1 = Arrays.stream(arr).sum();
			int sum2 = disj.stream().mapToInt(i->i).sum();
			if(sum1==sum2) ans = "YES";
			else ans = "NO";
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		disj = new ArrayList<>();
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		DFS(arr,0);
		System.out.println(ans);
	}

}

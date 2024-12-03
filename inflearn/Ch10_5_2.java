package inflearn;
import java.util.*;
public class Ch10_5_2 {
	static int[] dy;
	public static int solution(int n,int m,int[] arr) {
		Arrays.fill(dy, Integer.MAX_VALUE);
		dy[0]=0;
		for(int i=0;i<n;i++) {
			for(int j=arr[i];j<=m;j++) {
				dy[j]=Math.min(dy[j], dy[j-arr[i]]+1);
			}
		}
		return dy[m];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int m = sc.nextInt();
		dy=new int[m+1];
		System.out.println(solution(n,m,arr));

	}

}

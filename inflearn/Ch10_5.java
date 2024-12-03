package inflearn;
import java.util.*;
public class Ch10_5 {
	static int[] dy;
	public static int solution(int n,int m,ArrayList<Integer> arr) {
		for(int i=1;i<=m;i++) {
			if(arr.contains(i)) {dy[i]=1;continue;}
			int min=Integer.MAX_VALUE;
			for(int x=0;x<n;x++) {
				if(i-arr.get(x)>0) {
					min = Math.min(dy[i-arr.get(x)], min);
				}
			}
			dy[i]=min+1;
		}
		return dy[m];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0;i<n;i++) {
			arr.add(sc.nextInt());
		}
		int m = sc.nextInt();
		dy=new int[m+1];
		System.out.println(solution(n,m,arr));
	}

}

package inflearn;
import java.util.*;
public class Decision1 {
	public static int count(int[] arr,int capacity) {
		int cnt=1,sum=0;
		for(int x:arr) {
			if(sum+x>capacity) {
				cnt++;
				sum=x;
			}else sum+=x;
		}
		return cnt;
	}
	public static int solution(int m,int[] arr) {
		int ans = 0;
		int ed = Arrays.stream(arr).sum();
		int st = Arrays.stream(arr).max().getAsInt();
		while(st<ed) {
			int mid =(st+ed)/2;
			if(count(arr,mid)<=m) {
				ans = mid;
				ed = mid-1;
			}else {
				st = mid+1;
			}
		}
		return st;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int m= sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {	arr[i]=sc.nextInt();}
		System.out.println(solution(m,arr));
	}

}

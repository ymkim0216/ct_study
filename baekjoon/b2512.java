package baekjoon;
import java.util.*;
public class b2512 {
	public static long sum(int[] arr,long capacity) {
		long sum=0;
		for(int x:arr) {
			if(x>capacity) {
				sum+=capacity;
			}else sum+=x;
		}
		return sum;
	}
	public static long solution(int[] arr,long m) {
		long ans=0;
		long lt = 0;
		long rt = Arrays.stream(arr).max().getAsInt();
		long mid=0;
		while(lt<=rt) {
			mid =(lt+rt)/2;
			if(sum(arr,mid)<=m) {
				ans = mid;
				lt = mid+1;
			}else rt = mid-1;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		long m = sc.nextLong();
		System.out.println(solution(arr,m));
	}

}

package baekjoon;
import java.util.*;
public class N1920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int m=sc.nextInt();
		for(int i=0;i<m;i++) {
			int x = sc.nextInt();
			int ans = search(arr,x);
			if(ans==-1) System.out.println("0");
			else System.out.println(1);
		}
		
		
	}
	public static int search(int[] arr, int t) {
		int st=0;
		int ed=arr.length-1;
		int mid;
		while(st<=ed) {
			mid = (st+ed)/2;
			if(arr[mid]==t) return 1;
			if(arr[mid]>t) ed = mid-1;
			if(arr[mid]<t) st = mid+1;
		}
		return -1;
	}
}

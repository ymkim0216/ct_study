package inflearn;
import java.util.*;
public class BinarySearch {
	public static int solution(int m,int[] arr) {
		Arrays.sort(arr);
		int n= arr.length;
		int st=0,ed=n-1,mid=(st+ed)/2;
		while(true) {
			mid = (st+ed)/2;
			if(arr[mid]==m) break;
			if(arr[mid]>m) {
				ed=mid-1; //���࿡ mid������ ũ�� mid�� �̹� �������ϱ� �����ϰ� �ٽ� �˻�
			}else {
				st=mid+1; 
			}
		}
		return mid+1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(m,arr));
	}

}

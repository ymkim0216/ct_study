package inflearn;
import java.util.*;
public class Decision2_2 {
	public static int count(int mid,int[] arr) {
		int cnt=1,ep = arr[0];
		for(int x:arr) {
			if(x-ep>=mid) {
				cnt++;
				ep = x;
			}
		}
		return cnt;
	}
	public static int solution(int m,int[] arr) {
		int ans=0;
		Arrays.sort(arr); // 결정 알고리즘에서 탐색을 돌려는 배열은 탐색이 필수이다.
		int rt = Arrays.stream(arr).max().getAsInt();
		int lt=arr[0];
		for(int x:arr) {
			lt = (lt<x)?lt:x;
		}
		int mid=0;
		while(lt<=rt) {
			mid = (lt+rt)/2;
			if(count(mid,arr)>=m) {
				ans = mid;
				lt = mid+1;
			}else rt = mid-1;
		}
		return ans;	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println(solution(m,arr));
	}

}

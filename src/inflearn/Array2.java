package inflearn;
import java.util.*;
public class Array2 {
	public int solution(int n, int[] arr) {
		int ans =1, max = arr[0];//제일큰 사람 맨 앞 초기설정 
		for(int i: arr) {
			if(max<i) {
				ans++;
				max = i;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Array2 ar = new Array2();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(ar.solution(n, arr));
	}

}

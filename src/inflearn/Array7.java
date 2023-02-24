package inflearn;
import java.util.*;
public class Array7 {
	public int solution(int[] arr) {
		int cnt = 1, sum = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				sum += cnt++;
			}else {
				cnt = 1;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Array7 ar = new Array7();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(ar.solution(arr));
	}

}

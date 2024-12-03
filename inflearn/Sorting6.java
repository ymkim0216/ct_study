package inflearn;
import java.util.*;

public class Sorting6 {
	public static String solution(int n,int[] arr) {
		String ans ="";
		int[] c_arr = arr.clone();
		Arrays.sort(c_arr);
		for(int i=0;i<n;i++) {
			if(c_arr[i]!=arr[i]) ans += i+1+" ";
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(n,arr));
	}

}

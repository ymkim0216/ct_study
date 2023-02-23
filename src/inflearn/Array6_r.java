package inflearn;
import java.util.*;
public class Array6_r {
	public static boolean isPrime(int n) {
		if(n<=1) return false;
		if(n==2) return true;
		for(int i=2;i<n;i++) {
			if(n%i==0)return false;
		}
		return true;
	}
	public ArrayList<Integer> solution(int[] arr){
		ArrayList<Integer> result = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			StringBuilder sb = new StringBuilder(String.valueOf(arr[i]));
			sb.reverse();
			int tmp = Integer.valueOf(sb.toString());
			if(isPrime(tmp)) result.add(tmp);
		}
		return result;
	}
	public static void main(String[] args) {
		Array6_r ar = new Array6_r();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i:ar.solution(arr)) {
			System.out.print(i+" ");
		}
		
	}

}

package inflearn;
import java.util.*;
public class Array6 {
	public static boolean isPrime(int n) {
		if(n<=1) return false;
		if(n==2) return true;
		for(int i=2;i<n;i++) {
			if (n%i==0) return false;
		}
		return true;
	}
	public ArrayList<Integer> solution(int[] arr) {
		int[] a = new int[arr.length];
		ArrayList<Integer> result = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			StringBuilder sb = new StringBuilder(String.valueOf(arr[i]));
			sb.reverse();
			a[i] = Integer.valueOf(sb.toString());
		}
		//a[i] == 1 이면 소수count 에서 제외해야함.
		for(int i=0;i<arr.length;i++) {
			if(isPrime(a[i])) {
				result.add(a[i]);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Array6 ar = new Array6();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int x : ar.solution(arr)) {
			System.out.print(x+" ");
		}
	}

}

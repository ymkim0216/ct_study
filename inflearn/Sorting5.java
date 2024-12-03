package inflearn;
import java.util.*;
public class Sorting5 {
	public static String solution(int n,int[] arr) {
		String ans = "U";
		Set<Integer> set = new HashSet<>();
		for(int i:arr) {
			if(set.contains(i)) return "D";
			else {
				set.add(i);
			}
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

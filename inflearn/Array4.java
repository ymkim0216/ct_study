package inflearn;
import java.util.*;
public class Array4 {
	public int[] solution(int n) {
		int[] tmp = new int[n];
		tmp[0] = 1; tmp[1] = 1;
		for(int i=2;i<n;i++) {
			tmp[i] = tmp[i-1] + tmp[i-2];
		}
		return tmp;
	}
	public static void main(String[] args) {
		Array4 ar = new Array4();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i:ar.solution(n)) {
			System.out.printf("%d ",i);
		}
	}

}

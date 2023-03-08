package inflearn;
import java.util.*;
public class DFS2 {
	public static int solution(int n) {
		if(n==0) return 1;
		return solution(n-1)*n;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(solution(n));
	}

}

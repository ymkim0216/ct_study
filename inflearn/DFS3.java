package inflearn;
import java.util.*;
public class DFS3 {
	public static int solution(int n) {
		if(n==1) return 1;
		else if(n==2) return 1;
		else return solution(n-1)+solution(n-2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print(solution(i)+" ");
		}
	}

}

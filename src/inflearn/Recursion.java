package inflearn;
import java.util.*;
public class Recursion {
	public static void solution(int n) {
		if(n==0) { return;}
		solution(n-1);
		System.out.print(n+" "); 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		solution(n);
	}

}

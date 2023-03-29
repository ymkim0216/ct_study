package inflearn;
import java.util.*;
public class C1_1 {
	public static int solution(String s,String c) {
		int cnt=0;
		String a = s.toUpperCase();
		char b = c.toUpperCase().charAt(0);
		for(char k:a.toCharArray()) {
			if(k==b) cnt++;
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String c = sc.nextLine();
		System.out.println(solution(s,c));
	}

}

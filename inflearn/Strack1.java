package inflearn;
import java.util.*;

public class Strack1 {
	public static String solution(String s) {
		String ans = "NO";
		Stack<Character> stk = new Stack<>();
		for(char c:s.toCharArray()) {
			if(c==')') {
				if(stk.isEmpty()) {
					return ans;
				}
				stk.pop();
				continue;
			}
			stk.add(c);
		}
		if(stk.size()==0) ans = "YES";
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(solution(s));
	}

}

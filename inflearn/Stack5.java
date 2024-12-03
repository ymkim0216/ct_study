package inflearn;

import java.util.*;

public class Stack5 {
	public static int solution(String s) {
		int cnt=0;
		String tmp = "";
		Stack<Character> st = new Stack<>();
		String p="z",n;//previous, now
		for(char c:s.toCharArray()) {
			tmp = String.valueOf(p+c);
			if(tmp.equals("()")) {
				st.pop();
				cnt+=st.size();
			}else if(c==')'){
				st.pop();
				cnt++;
			}else {
				st.push(c);
			}
			p = c+"";
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(solution(s));
	}
}

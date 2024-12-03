package inflearn;

import java.util.*;

public class Stack2 {
	public static String solution(String s) {
		String ans = "";
		Stack<Character> stk = new Stack<>();
		for(char c:s.toCharArray()) {
			if(c==')') {
				while(stk.pop()!='(');
			}else {
				stk.push(c);
			}
		}
		for(char c:stk) {
			ans += c;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(solution(s));
	}

}

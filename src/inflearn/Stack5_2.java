package inflearn;

import java.util.*;

public class Stack5_2 {
	public static int solution(String s) {
		int cnt=0;
		Stack<Character> st = new Stack<>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(')  st.push('(');
			else {
				st.pop();
				if(s.charAt(i-1)=='(') cnt+=st.size();
				else cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(solution(s));
	}

}

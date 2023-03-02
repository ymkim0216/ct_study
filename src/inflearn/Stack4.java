package inflearn;
import java.util.*;

//후위연산식 352+*9-

public class Stack4 {
	public static int solution(String s) {
		int ans=0;
		Stack<Integer> stk =new Stack<>();
		for(char c:s.toCharArray()) {
			if(c>='0'&&c<='9') stk.push(c-'0');
			else {
				int a = stk.pop();
				int b = stk.pop();
				switch(c) {
				case '+':
					stk.push(a+b);
					break;
				case '-':
					stk.push(b-a);
					break;
				case '*':
					stk.push(a*b);
					break;
				case '/':
					stk.push(b/a);
					break;
				}
			}
		}
		ans = stk.pop();
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(solution(s));
	}

}

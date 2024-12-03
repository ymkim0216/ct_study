package level2;
import java.util.*;
public class N12909 {
	boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()) {
        	if(c=='(') stack.push(c);
        	else { // ')'ÀÎ °æ¿ì
        		if(stack.size()>0&&stack.peek()=='(') {
        			stack.pop();
        		}else {
        			answer = false;
        			break;
        		}
        		
        	}
        }
        if(stack.size()>0) answer=false;
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

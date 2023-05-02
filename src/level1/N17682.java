package level1;

import java.util.*;

public class N17682 {
	public static int solution(String dartResult) {
		int ans = 0, st = 0, now;

		Stack<Integer> stack = new Stack<>();

		char[] arr = dartResult.toCharArray();
		for (int i = 0; i < dartResult.length(); i++) {
			char c = arr[i];
			if (c == 'S' || c == 'D' || c == 'T') { //점수일 경우
				now = Integer.parseInt(dartResult.substring(st, i));
				if (c == 'D') {
					now = (int) Math.pow(now, 2);
				} else if (c == 'T') {
					now = (int) Math.pow(now, 3);
				}
				stack.push(now);
				st = i + 1;
			} else if (c == '*') { // 인기상
				if(stack.size()<2) {
					now = stack.pop()*2;
					stack.push(now);
				}else{
					int n1 = stack.pop()*2;
					int n2 = stack.pop()*2;
					stack.push(n2); 
					stack.push(n1);
				}
				st = i + 1;
			} else if (c == '#') { //아차상
				now = stack.pop()*(-1);
				stack.push(now);
				st = i + 1;
			}
		}
		ans = stack.stream().mapToInt(i->i).sum();
		return ans;
	}

	public static void main(String[] args) {
		solution("1T2D3D#");
	}

}

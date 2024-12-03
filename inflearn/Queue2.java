package inflearn;
import java.util.*;
public class Queue2 {
	public static String solution(String a,String b) {
		String ans = "YES";
		Queue<Character> qa = new LinkedList<>();
		for(char c: a.toCharArray()) {
			qa.offer(c);
		}
		for(char c:b.toCharArray()) {
			if(qa.isEmpty()) break;
			if(c==qa.peek()) qa.poll();
		}
		if(!qa.isEmpty()) ans = "NO";
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		System.out.println(solution(a,b));
	}

}

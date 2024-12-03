package level1;
import java.util.*;
public class N159994 {
	public static String solution(String[] cards1, String[] cards2, String[] goal) {
		String answer = "Yes";
        Queue<String> c1 = new LinkedList<>();
        Queue<String> c2 = new LinkedList<>();
        Queue<String> cG = new LinkedList<>();
        
        Collections.addAll(c1, cards1);
        Collections.addAll(c2, cards2);
        Collections.addAll(cG, goal);
        
        while(!cG.isEmpty()) {
        	String now = cG.poll();
        	if(!c1.isEmpty()&&c1.peek().equals(now)) c1.poll();
        	else if(!c2.isEmpty()&&c2.peek().equals(now)) c2.poll();
        	else {
        		answer = "No";
        		break;
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		String[] a = {"i", "water", "drink"};
		String[] b = {"want", "to"};
		String[] goal = {"i", "want", "to", "drink", "water"};
		System.out.println(solution(a,b,goal));
	}

}

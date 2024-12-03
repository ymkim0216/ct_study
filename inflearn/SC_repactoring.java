package inflearn;
import java.util.*;
public class SC_repactoring{
	public String solution(String str) {
		String clone = str+" ";
		String answer ="";
		int cnt = 1;
		for(int i=0;i<clone.length()-1;i++) {
			if(clone.charAt(i)==clone.charAt(i+1)) {
				cnt++;
			}else {
				if(cnt>1) {
					answer += clone.charAt(i) + String.valueOf(cnt);
					cnt = 1;
				}else {
					answer += clone.charAt(i);
				}
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		SC_repactoring cp = new SC_repactoring();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(cp.solution(str));
		
	}

}

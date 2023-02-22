package inflearn;
import java.util.*;
public class Password {
	public String solution(String str, int cnt) {
		String[] pw = new String[cnt];
		int[] dc = new int[cnt];
		int tmp = 0;
		String answer ="";
		for(int i=0;i<cnt;i++) {
			pw[i] = str.substring(tmp,tmp+7).replace('#', '1').replace('*', '0');
			dc[i] = Integer.parseInt(pw[i],2);
			tmp +=7;
			answer += (char) dc[i];
		}
		return answer;
	}
	public static void main(String[] args) {
		Password pw = new Password();
		Scanner sc = new Scanner(System.in);
		int cnt = Integer.parseInt(sc.nextLine());
		String str = sc.nextLine();
		System.out.println(pw.solution(str, cnt));
	}

}

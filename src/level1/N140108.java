package level1;
import java.util.*;
public class N140108 {
	public static int solution(String s) {
        int answer = 0;
        char x = s.charAt(0);//첫 문자로 초기화 
        int xcnt = 0, ycnt = 0;
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)==x) {
        		xcnt++;
        	}else {
        		ycnt++;
        	}
        	if(xcnt==ycnt) {
        		answer++;
        		if(i+1<s.length()) {
        			x = s.charAt(i+1);
        		}
        		xcnt=0;
        		ycnt=0;
        	}else {
        		if(i==s.length()-1&&(xcnt!=ycnt)) {
        			answer++;
        		}
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution("a"));

	}

}

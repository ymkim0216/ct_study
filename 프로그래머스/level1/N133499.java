package level1;
import java.util.*;
public class N133499 {
	public static int solution(String[] babbling) {
        int answer = 0;
        String s;
        for(int i=0;i<babbling.length;i++) {
        	s = babbling[i];
        	//연속된 발음은 불가능.
        	//따라서 연속된 발음은 그냥 - 로 지정해서 필터링 해줌
        	s = s.replaceAll("ayaaya", "-");
        	s = s.replaceAll("yeye", "-");
        	s = s.replaceAll("woowoo", "-");
        	s = s.replaceAll("mama", "-");
        	//연속하지 않은 경우
        	s = s.replaceAll("aya", " ");
        	s = s.replaceAll("ye", " ");
        	s = s.replaceAll("woo", " ");
        	s = s.replaceAll("ma", " ");
        	
        	s = s.replaceAll(" ", "");
        	if(s.equals("")) answer++;
        }
        return answer;
    }
	public static void main(String[] args) {
		String[] b = {"aya", "yee", "u", "maa"};
		System.out.println(solution(b));

	}

}

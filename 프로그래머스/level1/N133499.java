package level1;
import java.util.*;
public class N133499 {
	public static int solution(String[] babbling) {
        int answer = 0;
        String s;
        for(int i=0;i<babbling.length;i++) {
        	s = babbling[i];
        	//���ӵ� ������ �Ұ���.
        	//���� ���ӵ� ������ �׳� - �� �����ؼ� ���͸� ����
        	s = s.replaceAll("ayaaya", "-");
        	s = s.replaceAll("yeye", "-");
        	s = s.replaceAll("woowoo", "-");
        	s = s.replaceAll("mama", "-");
        	//�������� ���� ���
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

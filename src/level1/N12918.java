package level1;
import java.util.*;
public class N12918 {
	public boolean solution(String s) {
        boolean answer = true;
        if(s.length()==4||s.length()==6) {
        //���ڸ� ������ true, �ƴϸ� false
        	for(char c : s.toCharArray()) {
        		if(c<'0'||c>'9') answer=false;
        	}
        }else answer=false;
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

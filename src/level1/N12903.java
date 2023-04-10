package level1;
import java.util.*;
public class N12903 {
	//가운데 두 글자 가져오기
	public String solution(String s) {
		int n = s.length();
		StringBuilder sb = new StringBuilder();
		if(n%2==0) {
			sb.append(s.charAt(n/2-1)).append(s.charAt(n/2));
		}else {
			sb.append(s.charAt(n/2));
		}
        return sb.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

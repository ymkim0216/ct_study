package level1;
import java.util.*;
public class N12948 {
	public static String solution(String phone_number) {
        StringBuilder sb =new StringBuilder();
        int l = phone_number.length();
        for(int i=0;i<l-4;i++) {
        	sb.append("*");
        }
        sb.append(phone_number.substring(l-4));
        return sb.toString();
    }
	public static void main(String[] args) {
		System.out.println(solution("01033334444"));
	}

}

package level1;
import java.util.*;
import java.util.stream.Stream;
public class N12917 {
	public String solution(String s) {
		Character[] list = new Character[s.length()];
		for(int i=0;i<s.length();i++) {
			list[i]= s.charAt(i);
		}
		Arrays.sort(list,Collections.reverseOrder());
		StringBuilder sb =new StringBuilder();
		for(char c : list) {sb.append(c);}
        return sb.toString();
    }
	public static void main(String[] args) {
		String s= "Zbcdefg";
		N12917 n = new N12917();
		System.out.println(n.solution(s));

	}

}

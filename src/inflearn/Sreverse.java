package inflearn;
import java.util.*;
public class Sreverse {
	//알파벳만 뒤집기.
	public static void main(String[] args) {
		//특정문자열이 있는위치를 기억해서 그 위치면 ++? no
		//알파벳이면 바꾸고 아니면 넘어가고가 더 클린할듯?
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		char[] b= a.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<b.length;i++) {
			char tmp = b[i];
			if((tmp>='A'&&tmp<='Z')||(tmp>='a'&&tmp<'z')) {
				sb.append(tmp);
			}
		}
		sb.reverse();
		int now = 0;
		for(int i=0;i<b.length;i++) {
			char tmp = b[i];
			if((tmp>='A'&&tmp<='Z')||(tmp>='a'&&tmp<'z')) {
				b[i] = sb.charAt(now++);
				}
			}
		System.out.println(String.valueOf(b));
	}
}

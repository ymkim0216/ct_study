package inflearn;
import java.util.*;
public class Sreverse {
	//���ĺ��� ������.
	public static void main(String[] args) {
		//Ư�����ڿ��� �ִ���ġ�� ����ؼ� �� ��ġ�� ++? no
		//���ĺ��̸� �ٲٰ� �ƴϸ� �Ѿ�� �� Ŭ���ҵ�?
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

package inflearn;
import java.util.*;
public class BS_Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		String b ="";
		for(int i=0;i<a.length();i++) {
			char tmp = a.charAt(i);
			if(tmp>='A'&&tmp<='Z') { //대문자일때
				b += (char)(tmp+32);
			}else {
				b += (char)(tmp-32);
			}
		}
		System.out.println(b);
		return ;
	}

}

package inflearn;
import java.util.*;
public class Longword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		String[] b = a.split(" ");
		int max = b[0].length();
		int now = 0;
		for(int i=0;i<b.length;i++) {
			if(max<b[i].length()) {
				max = b[i].length();
				now = i;
			}
		}
		System.out.println(b[now]);
		return ;
	}

}

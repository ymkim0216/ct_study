package inflearn;
import java.util.*;
public class String10 {
	public int[] solution(String str,char c) {
		int[] count = new int[str.length()];
		int p = 1000;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==c) {
				p=0;
			}else {
				p +=1;
				count[i] = p;
			}
		}
		p =1000;
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i)==c) {
				p=0;
				count[i] = p;
			}else {
				p+=1;
				count[i] = Math.min(count[i], p);
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String10 s = new String10();
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char b = sc.next().charAt(0);
		int[] tmp = s.solution(a,b);
		for(int i: tmp) {
			System.out.print(i+" ");
		}
	}

}

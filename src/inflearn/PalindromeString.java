package inflearn;

import java.util.Scanner;

public class PalindromeString {
	public String solution(String str) {
		str = str.toUpperCase();
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		if(str.equals(sb.toString())) {
			return "YES";
		}else {
			return "NO";
		}
	}
	
	public static void main(String[] args) {
		PalindromeString ps = new PalindromeString();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(ps.solution(str));
		return ;
	}

}

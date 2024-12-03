package inflearn;

import java.util.Scanner;

public class Palindrome2 {
	public String solution(String str) {
		String answer = "NO";
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp= new StringBuilder(str).reverse().toString();
		if(str.equals(tmp)) {
			answer = "YES";
		}
		return answer;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome2 pd = new Palindrome2();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(pd.solution(str));
	}

}

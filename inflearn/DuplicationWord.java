package inflearn;

import java.util.Scanner;

public class DuplicationWord {
	public String solution(String str) {
		String dw = "";
		for(int i=0;i<str.length();i++) {
			if(dw.contains(str.charAt(i)+"")) {
				continue;
			}else {
				dw += str.charAt(i);
			}
		}
		return dw;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicationWord d = new DuplicationWord();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(d.solution(str));
		return ;
		
	}

}

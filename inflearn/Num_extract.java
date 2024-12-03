package inflearn;

import java.util.Scanner;

public class Num_extract {
	public int solution(String str) {
		str = str.replaceAll("[^0-9]","");
		return Integer.valueOf(str);
	}
	public static void main(String[] args) {
		Num_extract m = new Num_extract();
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		System.out.println(m.solution(tmp));
	}

}

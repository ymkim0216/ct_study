package inflearn;

import java.util.*;

public class CaptainHashMap {
	public static char solution(int n,String s) {
		char answer = '0';
		int max = Integer.MIN_VALUE;
		HashMap<Character,Integer> map = new HashMap<>();
		for(char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		for(char c:map.keySet()) {
			if(map.get(c)>max) {
				max = map.get(c);
				answer = c;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		System.out.println(solution(n,s));
	}
}

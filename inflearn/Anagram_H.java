package inflearn;
import java.util.*;
public class Anagram_H {
	public static String solution(String a,String b) {
		String answer = "NO";
		HashMap<Character,Integer> mapa = new HashMap<>();
		HashMap<Character,Integer> mapb = new HashMap<>();
		for(char x:a.toCharArray()) {
			mapa.put(x, mapa.getOrDefault(x,0)+1);
		}
		for(char x:b.toCharArray()) {
			mapb.put(x, mapb.getOrDefault(x,0)+1);
		}
		if(mapa.equals(mapb)) {
			answer = "YES";
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		System.out.println(solution(a,b));
	}

}

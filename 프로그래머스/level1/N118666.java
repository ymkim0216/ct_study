package level1;

import java.util.*;

public class N118666 {
	public String solution(String[] survey, int[] choices) {
		StringBuilder sb = new StringBuilder();
		Map<Character, Integer> map = new HashMap<>();
		setting(map);
		for (int i = 0; i < survey.length; i++) {
			if (choices[i] <= 3) {
				map.put(survey[i].charAt(0), map.get(survey[i].charAt(0)) + 4 - choices[i]);
			} else if (choices[i] > 4) {
				map.put(survey[i].charAt(1), map.get(survey[i].charAt(1)) + choices[i] - 4);
			}
		}
		// rt/cf/jm/an
		sb.append(logic('R','T',map));
		sb.append(logic('C','F',map));
		sb.append(logic('J','M',map));
		sb.append(logic('A','N',map));
		return sb.toString();
	}

	public String logic(Character a, Character b, Map<Character, Integer> map) {
		if (map.get(a) >= map.get(b)) {
			return a + "";
		} else if (map.get(a) < map.get(b)) {
			return b + "";
		}
		return "";
	}

	public void setting(Map<Character, Integer> map) {
		map.put('R', 0);
		map.put('T', 0);
		map.put('C', 0);
		map.put('F', 0);
		map.put('J', 0);
		map.put('M', 0);
		map.put('A', 0);
		map.put('N', 0);
	}

	public static void main(String[] args) {
		String[] a = {"TR", "RT", "TR"};
		int[] b = {7, 1, 3};
		N118666 T = new N118666();
		System.out.println(T.solution(a, b));

	}

}

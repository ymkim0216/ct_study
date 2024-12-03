package level1;

import java.util.*;

public class N131128 {
	public static String solution(String X, String Y) {
		Map<Character, Integer> mx = new HashMap<>();
		Map<Character, Integer> my = new HashMap<>();
		Map<Character, Integer> result = new TreeMap<>(Comparator.reverseOrder());

		for (char c : X.toCharArray()) {
			mx.put(c, mx.getOrDefault(c, 0) + 1);
		}
		for (char c : Y.toCharArray()) {
			my.put(c, my.getOrDefault(c, 0) + 1);
		}

		Iterator it = mx.entrySet().iterator();
		int min;
		while (it.hasNext()) {
			Map.Entry<Character, Integer> e = (Map.Entry) it.next();
			char tmp = e.getKey();
			if (my.containsKey(tmp)) {
				min = Math.min(my.get(tmp), e.getValue());
				result.put(tmp, min);
			}
		}
		StringBuilder sb = new StringBuilder();
		it = result.entrySet().iterator();
		if (!it.hasNext())
			sb.append("-1");
		if (result.size() == 1 && result.containsKey('0')) {
			sb.append('0');
		} else {
			while (it.hasNext()) {
				Map.Entry<Character, Integer> e = (Map.Entry) it.next();
				String s = e.getKey()+"";
				sb.append(s.repeat(e.getValue()));
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String a = "100";
		String b = "234560";
		System.out.println(solution(a, b));

	}

}

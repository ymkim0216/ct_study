package level1;

import java.util.*;

public class N42576 {
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        //완주하지 못한 사람은 한명
        Map<String,Integer> map = new HashMap<>();
        for(String s:completion) {
        	map.put(s, map.getOrDefault(s, 0)+1);
        }
        for(String s:participant) {
        	if(map.containsKey(s)) {
        		if(map.get(s)-1==0) {
        			map.remove(s);
        		}else {
        			map.put(s, map.get(s)-1);
        		}
        	}else {
        		answer = s;
        		break;
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		String[] a = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] b= {"josipa", "filipa", "marina", "nikola"};
		System.out.println(solution(a,b));

	}

}

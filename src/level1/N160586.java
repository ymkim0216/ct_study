package level1;
import java.util.*;
public class N160586 {	
	public static int[] solution(String[] keymap, String[] targets) {
		Map<Character,Integer> map = new HashMap<>();
		int cnt=0;
		for(int i=0;i<keymap.length;i++) {
			cnt=0;
			for(int j=0;j<keymap[i].length();j++) {
				cnt++;
				int min = Math.min(map.getOrDefault(keymap[i].charAt(j),cnt),cnt);
				map.put(keymap[i].charAt(j),min);
			}
		}
        int[] answer = new int[targets.length];
        for(int i=0;i<answer.length;i++) {
        	int sum =0;
        	for(char c : targets[i].toCharArray()) {
        		if(map.containsKey(c)) {
        			sum+=map.get(c);
        		}else {
        			sum=-1;
        			break;
        		}
        	}
        	answer[i]=sum;
        }
        return answer;
    }
	public static void main(String[] args) {
		String[] a = {"AA"};
		String[] b= {"B"};
		System.out.println(Arrays.toString(solution(a,b)));

	}

}

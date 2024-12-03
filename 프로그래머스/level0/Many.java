package level0;
import java.util.*;
public class Many {
	public static int solution(int[] array) {
        int max=-1, premaxindex=-1;
        int answer=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int x:array) {
        	map.put(x, map.getOrDefault(x, 0)+1);
        }
        for(Integer key:map.keySet()) {
        	if(map.get(key)>max) {
        		max = map.get(key);
        		answer = key;
        	}else if(map.get(key)==max) {
        		premaxindex=key;
        	}
        }
        if(map.get(answer)==map.get(premaxindex)) {
        	return -1;
        }
        return answer;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1, 2, 3, 3, 3, 4
		int[] arr = {0};
		System.out.println(solution(arr));
	}

}

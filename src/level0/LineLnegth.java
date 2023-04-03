package level0;
import java.util.*;
public class LineLnegth {
	public int solution(int[][] lines) {
       int ans =0;
       Map<Integer,Integer> map = new HashMap<>();
       for(int[] line:lines) {
    	   int min = Math.min(line[0], line[1]);
    	   int max = Math.max(line[0],line[1]);
    	   for(int i=min;i<=max;i++) {
    		   map.put(i, map.getOrDefault(i, 0)+1);
    	   }
       }
       for(int key:map.keySet()) {
    	   if(map.get(key)>=2) {
    		   ans++;
    	   }
       }
       return ans;
    }
	public static void main(String[] args) {
		LineLnegth l = new LineLnegth();
		int[][] arr = 	{{0, 5}, {3, 9}, {1, 10}};
		System.out.println(l.solution(arr));

	}

}

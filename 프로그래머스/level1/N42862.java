package level1;
import java.util.*;
public class N42862 {
	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        ArrayList<Integer> lo = new ArrayList<>();
        ArrayList<Integer> re = new ArrayList<>();
        for(int i=0;i<lost.length;i++) {
        	lo.add(lost[i]);
        }
        for(int i=0;i<reserve.length;i++) {
        	re.add(reserve[i]);
        }
        Integer pre, next;
        //ÃÑ N¸í
        for(int x:reserve) {
        	if(lo.contains((Integer)x)) {
        		lo.remove((Integer)x);
        		re.remove((Integer)x);
        	}
        }
        Collections.sort(lo);
        Collections.sort(re);
		for (int x : re) {
			Integer target = -1;
			pre = x - 1;
			next = x + 1;
			if (lo.contains(pre)) {
				target = pre;
			} else if (lo.contains(next)) {
				target = next;
			}

			if (target != -1) {
				lo.remove(target);
				re.remove(target);
			}
		}
        
        
        return answer-lo.size();
    }
	public static void main(String[] args) {
		int n=5;
		int[] a= {4,5};
		int[] b= {3,4};
		
		System.out.println(solution(n,a,b));
	}

}

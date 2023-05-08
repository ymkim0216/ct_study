package level1;
import java.util.*;
import java.util.stream.Collectors;
public class N133502 {
	public static int solution(int[] ingredient) {
        int cnt=0;
        ArrayList<Integer> list = new ArrayList<>(
        		Arrays.stream(ingredient).boxed().collect(Collectors.toList()));
        
        for(int i=0;i<list.size()&&list.size()>3;i++) {
        	if(i>2&&list.get(i)==1
        			&&list.get(i-1)==3
        			&&list.get(i-2)==2
        			&&list.get(i-3)==1) {
        		list.remove(i);
        		list.remove(i-1);
        		list.remove(i-2);
        		list.remove(i-3);
        		cnt++;
        		i-=4;
        	}
        }
        
        return cnt;
    }
	public static void main(String[] args) {
		int[] a = {1,1,2,3,1,2,3,1,2,3,1,2,3,1};
		System.out.println(solution(a));
	}

}

package level1;
import java.util.*;
public class N12910 {
	public static int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int a:arr) {
        	if(a%divisor==0) {
        		list.add(a);
        	}
        }
        Collections.sort(list);
        return list.stream().mapToInt(i->i).toArray();
    }
	public static void main(String[] args) {
		int[] arr= {1,3,5,6,2,10};
		int[] ans = solution(arr,2);
		System.out.println(Arrays.toString(ans));

	}

}

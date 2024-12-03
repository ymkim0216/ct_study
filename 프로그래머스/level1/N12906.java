package level1;
import java.util.*;
public class N12906 {
	public int[] solution(int []arr) {
        int pre=arr[0];
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int i=1;i<arr.length;i++) {
        	if(arr[i]!=pre) list.add(arr[i]);
        	pre=arr[i];
        }
        return list.stream().mapToInt(i->i).toArray();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

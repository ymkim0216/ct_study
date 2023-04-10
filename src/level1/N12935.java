package level1;
import java.util.*;
public class N12935 {
	//가장 작은 수 제외하고 return
	static Integer min=Integer.MAX_VALUE;
	public static int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.stream(arr).forEach(i->{min=Math.min(min, i);list.add(i);});
        list.remove(min);
        if(list.size()==0) list.add(-1); 
        return list.stream().mapToInt(i->i).toArray();
    }
	public static void main(String[] args) {
		int[] arr ={3,12,2,5,9};
		for(int i:solution(arr)) {
			System.out.print(i+" ");
		}

	}

}

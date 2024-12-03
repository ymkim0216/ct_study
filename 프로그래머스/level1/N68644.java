package level1;
import java.util.*;
public class N68644 {
	static Set<Integer> ans;
	static int[] select;
	public static int[] solution(int[] numbers) {//결과로 나올 수 있는 합들 모두 오름차순 출력
		ans= new HashSet<>();
		select = new int[2];
		DFS(0,0,numbers);
		int[] result= ans.stream().mapToInt(i->i).toArray();
		Arrays.sort(result);
        return result;
    }
	public static void DFS(int L,int s,int[] numbers) {
		if(L==2) {
			ans.add(select[0]+select[1]);
		}else {
			for(int i=s;i<numbers.length;i++) {
				select[L]=numbers[i];
				DFS(L+1,i+1,numbers);
			}
		}
	}
	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		int[] ans = solution(numbers);
		for(int i:ans) {
			System.out.print(i +" ");
		}
	}

}

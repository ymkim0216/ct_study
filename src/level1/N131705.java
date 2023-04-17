package level1;
import java.util.*;
public class N131705 {
	static int[] select;
	static int cnt=0;
	public static int solution(int[] number) {
        select = new int[3];
        DFS(0,number,0);
        return cnt;
    }
	public static void DFS(int L,int[] number,int s) {
		if(L==3) {
			if(Arrays.stream(select).sum()==0) cnt++;
		}else {
			for(int i=s;i<number.length;i++) {
				select[L]=number[i];
				DFS(L+1,number,i+1);
			}
		}
	}
	public static void main(String[] args) {
		int[] arr2 = {-2, 3, 0, 2, -5};
		System.out.println(solution(arr2));

	}

}

package level1;
import java.util.*;
public class N12982_2 {
	public static int solution(int[] d, int budget) {
		Arrays.sort(d);
		//앞부터 budget 전까지 더하면 됨.
		int sum=0,cnt=0;
		for(int i=0;i<d.length;i++) {
			if(sum+d[i]>budget) {
				break;
			}else {
				sum+=d[i];
				cnt++;
			}
		}
		
		return cnt;
	}
	public static void main(String[] args) {
		int[] list = { 2,3,4,5,6,9 };
		System.out.println(solution(list, 15));

	}

}

package level0;
import java.util.*;
public class N_12931 {
	public static int solution(int n) {
        int ans = 0;
        while(n>0) {
        	ans += n%10;
        	n=n/10;
        }
        return ans;
    }
	public static void main(String[] args) {
		System.out.println(solution(123));
	}

}

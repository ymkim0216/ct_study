package level1;
import java.util.*;
public class N12932 {
	public static int[] solution(long n) {
		String sn = String.valueOf(n);
		int[] ans = new int[sn.length()];
		for(int i=0;i<ans.length;i++) {
			ans[i]=sn.charAt(ans.length-i-1)-'0';
		}
        return ans;
    }
	public static void main(String[] args) {
		System.out.println(solution(12345));
	}

}

package level1;
import java.util.*;
public class N12933 {
	public static long solution(long n) {
        char[] c = String.valueOf(n).toCharArray();
        Integer[] arr = new Integer[c.length];
        for(int i=0;i<c.length;i++) {
        	arr[i]=c[i]-'0';
        }
        Arrays.sort(arr,Collections.reverseOrder());
        String s ="";
        for(int a:arr) {
        	s+=a;
        }
        long ans =Long.valueOf(s);
        return ans;
    }
	public static void main(String[] args) {
		long n = 11742;
		System.out.println(solution(n));
	}

}

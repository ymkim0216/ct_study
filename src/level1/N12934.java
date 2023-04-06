package level1;
import java.util.*;
public class N12934 {
	public long solution(long n) {
        long ans = -1;
        double tmp = Math.sqrt(n);
        if((int)tmp-tmp==0) {
        	long k = (int)tmp+1;
        	ans = k*k;
        }
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

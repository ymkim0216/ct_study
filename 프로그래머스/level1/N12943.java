package level1;
import java.util.*;
public class N12943 {
	public static int solution(int num) {
		if(num==1) return 0;
		int cnt=0;
		long ans = num;
		while(cnt<500) {
			if(ans==1) return cnt;
			if(ans%2==0) {
				ans/=2;
			}else {
				ans*=3;//숫자가 커서 범위 이외의 값도 고려해야함.
				ans++;
			}
			cnt++;
		}
        return -1;
    }
	public static void main(String[] args) {
		System.out.println(solution(626331));
	}

}

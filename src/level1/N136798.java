package level1;
import java.util.*;
public class N136798 {
	public int solution(int number, int limit, int power) {
        int ans = 1;
        for(int i=2;i<=number;i++) {
        	if(count(i)>limit) ans+=power;
        	else ans+=count(i);
        }
        return ans;
    }
	public int count(int num) {
		int cnt=0;
		for(int i=1;i*i<=(num);i++) {
			if(i*i==num) cnt++;
			else if(num%i==0) cnt+=2;
		}
		return cnt;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N136798 t = new N136798();
		System.out.println(t.solution(5,3,2));
	}

}

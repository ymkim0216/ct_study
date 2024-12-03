package level0;
import java.util.*;
public class Hate3 {
	public static int solution(int n) {	
        int ans=0;
        int e=0;
        for(int i=1;i<=n;i++) {
        	ans++;
        	String s = ans +"";
        	while(s.contains("3")||ans%3==0) {
        		ans++;
        		s = ans +"";
        	}
        	e++;
        	System.out.println("E : "+e+", ans : "+ans);
        }
        return ans;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(solution(n));
	}

}

package level1;
import java.util.*;
public class N12947 {
	//자릿수 합으로 나눠지면 true,아니면 false
	public static boolean solution(int x) {
        boolean ans = false;
        int result=0;
        int now=x;
        while(now>0) {
        	result= result+(now%10);
        	now = now/10;
        }
        System.out.println(result);
        if(x%result==0) {
        	ans=true;
        }
        return ans;
    }
	public static void main(String[] args) {
		System.out.println(solution(23));

	}

}

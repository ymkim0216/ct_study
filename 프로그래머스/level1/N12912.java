package level1;
import java.util.*;
public class N12912 {
	public static long solution(int a, int b) {
        long answer = 0;
        if(a==b) return a;
        else if(b<a) {
        	int tmp = a; a=b; b=tmp;
        }
        for(int i=a;i<=b;i++) {
        	answer+=i;
        }
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(5,3));
	}

}

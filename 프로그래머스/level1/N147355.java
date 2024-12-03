package level1;
import java.util.*;
public class N147355 {
	public static int solution(String t, String p) {
		//p보다 작거나 같은것 count
        int answer = 0;
        long x =Long.parseLong(p);
        for(int i=0;i<t.length()-p.length()+1;i++) {
        	Long y = Long.parseLong(t.substring(i,i+p.length()));
        	System.out.println(y);
        	if(x>=y)answer++;
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("3141592","271"));
	}

}

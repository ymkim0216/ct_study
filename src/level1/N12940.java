package level1;
import java.util.*;
public class N12940 {
	public int[] solution(int n, int m) {
        int[] answer = new int[2];
        //최대공약수, 최소공배수 출력
        //최대공약수 -> 유클리드 호제법
        answer[0]=gcd(n,m);
        answer[1]=lcm(n,m);
        return answer;
    }
	public int gcd(int n,int m) {//유클리드 호제법을 이용한 최대공약수 구하는 방법
		if(m == 0){
	        return n;
	    }else{
	        return gcd(m,n%m);
	    }
	}
	public int lcm(int n,int m) {
		return n/gcd(n,m)*m;//범위 1000000이하의 자연수-> 오버플로우 방지
	}
}

package level1;
import java.util.*;
public class N12940 {
	public int[] solution(int n, int m) {
        int[] answer = {};
        //최대공약수, 최대공배수 출력
        //최대공약수를 어케 구하더랄ㅇ...
        return answer;
    }
	public int gcd(int n,int m) {//유클리드 호제법을 이용한 최대공약수 구하는 방법
		if(m == 0){
	        return n;
	    }else{
	        return gcd(b, a%b);
	    }
	}
}

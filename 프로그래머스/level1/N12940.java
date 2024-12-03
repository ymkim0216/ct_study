package level1;
import java.util.*;
public class N12940 {
	//복습 : 풀이 2
	public int[] solution2(int n, int m) {
		//유클리드 호제법을 이용한 최대공약수 & 공배수 풀이
		int[] arr = new int[2];
		arr[0]=gcd2(n,m);
		arr[1]=lcd2(n,m);
		return arr;
    }
	//lcd, gcd
	
	public int lcd2(int n,int m) {//최소 공배수 =  n * m / gcd
		return n/gcd2(n,m)*m;
	}
	public int gcd2(int n,int m) {// 최대 공약수(유클리드 호제법)
		if(m==0) return n;
		else {
			return gcd2(m,n%m);
		}
		
	}
	
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

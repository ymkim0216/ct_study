package level0;

public class Finite_decimal {

	public int solution(int a, int b) {
		//분자 a, 분모 b 
        b /= gcd(a,b);
        while(b%2==0) {b/=2;}
        while(b%5==0) {b/=5;}
        return b==1?1:2; //2와 5가 다 나눠져서 1이면 유한소수임.
    }
	//유클리드 호제법으로 최대공약수 구해서 반환
	static int gcd(int a,int b) {
		if(a%b==0) {
			return b;
		}else {
			return gcd(b,a%b);
		}
	}

}

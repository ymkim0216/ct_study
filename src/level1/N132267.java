package level1;
import java.util.*;
public class N132267 {
	public static int solution(int a, int b, int n) {
        int answer = 0;
        int remainder =0;
        //�� a���� �������ָ� �ݶ� b���� �ش�
        while(n>=a) {
        	answer += (n/a)*b;
        	remainder = n%a;
        	n= (n/a)*b;
        	n += remainder;
        }
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(5,3,21));

	}

}

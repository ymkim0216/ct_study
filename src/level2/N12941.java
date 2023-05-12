package level2;
import java.util.*;
public class N12941 {
	public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Integer[] B_I = Arrays.stream(B).boxed().toArray(Integer[]::new);
        Arrays.sort(B_I,Collections.reverseOrder());
        
        for(int i=0;i<A.length;i++) {
        	answer += (A[i]*B_I[i]);
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

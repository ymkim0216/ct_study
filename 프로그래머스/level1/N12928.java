package level1;

public class N12928 {
	public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n;i++) {
        	if(n%i==0) answer+=i;
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

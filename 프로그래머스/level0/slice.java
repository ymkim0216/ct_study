package level0;

public class slice {

	public static int solution(int M, int N) {
        int answer = 0;
        if (M==1&&N==1) {
        	answer =0;
        }else if(M==1) {
        	answer = N-1;
        }else if(N==1) {
        	answer = M-1;
        }else {
        	answer = (M-1)+(M*(N-1));
        }
        //if, else �Ⱦ��� M�� N�� ũ�⸦ ���ؼ� ������ �ٲ㼭 ����ص� ��.
        return answer;
    }

}

package level2;

import java.util.Arrays;

public class N70129 {
	public int[] solution(String s) {
        int[] answer = new int[2];
        StringBuilder sb = new StringBuilder(s);
        int cnt=0,zero =0;
        while(!sb.toString().equals("1")) {
        	cnt++;
        	int size = 0;
        	for(char c:sb.toString().toCharArray()) {
        		if(c=='0') zero++;
        		else size++;
        	}
        	sb.setLength(0);
        	sb.append(Integer.toBinaryString(size));
        }
        answer[0]=cnt; answer[1]=zero;
        return answer;
    }
	public static void main(String[] args) {
		N70129 T = new N70129();
		System.out.println(Arrays.toString(T.solution("01110")));

	}

}

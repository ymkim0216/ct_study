package level1;

public class N12916 {
	boolean solution(String s) {
        boolean answer = true;
        s= s.toUpperCase();
        int pcnt=0,ycnt=0;
        for(char c:s.toCharArray()) {
        	if(c=='P') pcnt++;
        	if(c=='Y') ycnt++;
        }
        if(pcnt!=ycnt) answer = false;
        return answer;
    }
	public static void main(String[] args) {
		N12916 n = new N12916();
		System.out.println(n.solution("pPoooyY"));

	}

}

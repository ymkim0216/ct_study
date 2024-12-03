package level0;
import java.util.*;
public class QuizOX {
	public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int cnt=0;
        for(String s:quiz) {
        	String[] math = s.split(" ");
        	int a = Integer.parseInt(math[0]);
        	int b = Integer.parseInt(math[2]);
        	int result = Integer.parseInt(math[4]);
        	String oper = math[1];
        	if(oper.equals("+")) {
        		if(result==(a+b)) answer[cnt]="O";
        		else answer[cnt]="X";
        	}else if(oper.equals("-")) {
        		if(result==(a-b)) answer[cnt]="O";
        		else answer[cnt]="X";
        	}
        	cnt+=1;
        }
        return answer;
    }
	public static void main(String[] args) {
		String[] quiz = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
		String[] arr = solution(quiz);
		for(String ans : arr) {
			System.out.print(ans+" ");
		}
		
	}

}

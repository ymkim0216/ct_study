package level0;

public class character_coordinate {

	public static int[] solution(String[] keyinput, int[] board) {
		//max, min => board/2�� ����.
        int[] answer = {0,0}; //�ʱ� ��ġ [0,0]
        for(String s:keyinput) {
        	switch(s) {
        	case "up":
        		if(answer[1]==(board[1]/2)) {
        			break;
        		}else {answer[1]+=1;}
        		break;
        	case "down":
        		if(answer[1]==(-board[1]/2)) {
        			break;
        		}else {answer[1]-=1;}
        		break;
        	case "right":
        		if(answer[0]==(board[0]/2)) {
        			break;
        		}else {answer[0]+=1;}
        		break;
        	case "left":
        		if(answer[0]==(-board[0]/2)) {
        			break;
        		}else {answer[0]-=1;}
        		break;
        	}
        }
        return answer;
    }

}

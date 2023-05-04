package level1;
import java.util.*;
public class N64061 {
	public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        int size = board.length;
        Stack<Integer> stack = new Stack<>();
        //moves
        for(int i=0;i<moves.length;i++) {
        	int x = moves[i]-1;
        	for(int j=0;j<size;j++){
        		if(board[j][x]==0) continue;
        		else {
        			if(!stack.isEmpty()&&board[j][x]==stack.peek()) {
        				answer+=2;
        				stack.pop();
        			}else {
            			stack.push(board[j][x]);
        			}
        			board[j][x]=0;
        			break;
        		}
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		int[][] b = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] move = {1,5,3,5,1,2,1,4};
		System.out.println(solution(b,move));
	}

}

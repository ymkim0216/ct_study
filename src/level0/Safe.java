package level0;
import java.util.*;
public class Safe {
	public class Point{
		public int x,y;
		Point(int x,int y){
			this.x=x;
			this.y=y;
		}
	}
	public int solution(int[][] board) {
        int ans = 0;
        int[] x = {1,1,1,0,0,-1,-1,-1};
        int[] y = {1,0,-1,1,-1,1,0,-1};
        ArrayList<Point> bomb = new ArrayList<>();
        for(int i=0;i<board.length;i++) {
        	for(int j=0;j<board[0].length;j++) {
        		if(board[i][j]==1) {
        			Point a = new Point(i,j);
        			bomb.add(new Point(i,j));
        		}
        	}
        }
        for(Point p:bomb) {
        	for(int i=0;i<x.length;i++) {
        		int tmpx = p.x+x[i];
        		int tmpy = p.y+y[i];
        		if(tmpx>=0&&tmpy>=0&&tmpx<board[0].length&&tmpy<board.length) {
        			board[tmpx][tmpy]=1;
        		}
        	}
        }
        for(int i=0;i<board.length;i++) {
        	for(int j=0;j<board[0].length;j++) {
        		if(board[i][j]==0) {
        			ans++;
        		}
        	}
        }
        return ans;
    }
	public static void main(String[] args) {
	}

}

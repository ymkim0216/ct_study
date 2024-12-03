package inflearn;
import java.util.*;
public class DFS_s14 {
	static int n,cnt=0;
	static int[][] board;
	static int[][] loc = {{0,1},{0,-1},{1,0},{-1,0},{1,1},{1,-1},{-1,1},{-1,-1}};
	public static void DFS(int x,int y) {
		for(int i=0;i<8;i++) {
			int tx = x+loc[i][0];
			int ty = y+loc[i][1];
			if(tx>=0&&tx<n&&ty>=0&&ty<n&&board[tx][ty]==1) {
				board[tx][ty]=0;
				DFS(tx,ty);
			}
		}
	}
	public static void solution(int[][] board) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(board[i][j]==1) {
					cnt++;
					board[i][j]=0;
					DFS(i,j);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		board= new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				board[i][j] = sc.nextInt();
			}
		}
		solution(board);
		System.out.println(cnt);
	}

}

package baekjoon;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class N2178 {
	static int[][] board;
	static int n,m;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static int[][] ch;
	//최소칸수 : BFS ( 경우의 수 : DFS ) ( 최소 거리 : BFS )
	public static void BFS(int x,int y) {
		Queue<Point> q = new LinkedList<>();
		q.offer(new Point(x,y));
		board[x][y]=0;//0 : 이동할 수 없는 칸, 1 : 이동 가능한 칸
		ch[x][y]=1;
		while(!q.isEmpty()) {
			Point p = q.poll();
			for(int i=0;i<4;i++) {
				int tx = p.x+dx[i];
				int ty = p.y+dy[i];
				if(tx>=1&&tx<=m&&ty>=1&&ty<=n&&board[ty][tx]==1) {
					q.offer(new Point(tx,ty));
					board[ty][tx]=0;
					ch[ty][tx]=ch[p.y][p.x]+1;
				}
			}
		}
		return;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		board = new int[n+1][m+1];
		ch=new int[n+1][m+1];
		sc.nextLine();
		for(int i=1;i<=n;i++) {
			String tmp=sc.nextLine();
			for(int j=1;j<=m;j++) {
				board[i][j]=tmp.charAt(j-1)-'0';
			}
		}
		BFS(1,1);
		System.out.println(ch[n][m]);
	}
	static class Point{
		public int x,y;
		Point(int x,int y){
			this.x=x;
			this.y=y;
		}
	}
}

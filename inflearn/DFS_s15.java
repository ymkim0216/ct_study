package inflearn;
import java.util.*;

public class DFS_s15 {
	static int n,m,sum=0,min=Integer.MAX_VALUE;
	static int[][] board;
	static ArrayList<Point> list;
	static Point[] ans;
	public static void DFS(int L,int s) {
		if(L==list.size()-m) {
			sum=0;
			for(Point p : ans) {
				board[p.x][p.y] = 0;
			}
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(board[i][j]==1) {
						sum+=solution(ans,i,j);
					}
				}
			}
			min = Math.min(sum, min);
			for(Point p : ans) {
				board[p.x][p.y] = 2;
			}
		}else {
			for(int i=s;i<list.size();i++) {
				ans[L]=list.get(i);
				DFS(L+1,i+1);
			}
		}
		
	}
	public static int solution(Point[] ans,int x,int y) {
		int dismin = Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(board[i][j]==2) {
					int dis = Math.abs(x-i)+Math.abs(y-j);
					dismin = Math.min(dismin, dis);
				}
			}
		}
		return dismin;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		board= new int [n][n];
		list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				board[i][j]=sc.nextInt();
				if(board[i][j]==2) list.add(new Point(i,j));
			}
		}
		ans = new Point[list.size()-m];
		DFS(0,0);
		System.out.println(min);
	}

}

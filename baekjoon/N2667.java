package baekjoon;
import java.util.*;
public class N2667 {
	static int n,cnt=0;
	static int[][] ch;
	static int[][] board;
	static int[] dx={-1,1,0,0};
	static int[] dy={0,0,-1,1};
	public static void DFS(int i,int j) {
		for(int a=0;a<4;a++) {
			int x = i+dx[a];
			int y = j+dy[a];
			if(x>=0&&x<n&&y>=0&&y<n&&board[x][y]==1) {
				board[x][y]=0;
				DFS(x,y);
			}
		}
	}
	
	public static int[] solution() {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(board[i][j]==1) {
					cnt=0;
					DFS(i,j);
					list.add(cnt);
				}
			}
		}
		return list.stream().mapToInt(i->i).toArray();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		board = new int[n][n];
		ch=new int[n][n];
		sc.nextLine();
		for(int i=0;i<n;i++) {
			String s = sc.nextLine();
			for(int j=0;j<n;j++) {
				board[i][j] = s.charAt(j)-'0';
			}
		}
		int[] ans=solution();
		Arrays.sort(ans);
		System.out.println(ans.length);
		for(int i:ans) {
			System.out.println(i);
		}
	}

}

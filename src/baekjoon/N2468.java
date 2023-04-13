package baekjoon;
import java.io.*;
import java.util.*;
public class N2468 {
	static int n;
	static Set<Integer> h;
	static int[] dx= {0,0,1,-1};
	static int[] dy= {1,-1,0,0};
	static int[][] board;
	public static void BFS(int x,int y,int height,int[][] copy) {
		Queue<Point> q = new LinkedList<>();
		q.offer(new Point(x,y));
		copy[y][x]=0;
		while(!q.isEmpty()) {
			Point tmp = q.poll();
			for(int i=0;i<4;i++) {
				int tx = tmp.x+dx[i];
				int ty = tmp.y+dy[i];
				if(tx>=0&&tx<n&&ty>=0&&ty<n&&copy[ty][tx]>height) {
					copy[ty][tx]=0;
					q.offer(new Point(tx,ty));
				}
			}
		}
	}
	public static int solution(int height) {
		int cnt=0;
		int[][] copy= new int[n][n];
		for(int i=0; i<n; i++){//깊은 복사
            System.arraycopy(board[i], 0, copy[i], 0, n);
        }
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(copy[i][j]>height) {
					BFS(j,i,height,copy);
					cnt++;
				}
			}
		}
		return cnt;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		board = new int[n][n];
		h= new HashSet<>();
		StringTokenizer st;
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<n;j++) {
				int k = Integer.parseInt(st.nextToken());
				board[i][j]=k;
				h.add(k);
			}
		}
		h.add(0);
		h.add(1);//높이가 1이라서 물에 잠기지 않는 경우.
		int max=Integer.MIN_VALUE;
		for(int height:h) {
			max = Math.max(max, solution(height));
		}
		System.out.println(max);
	}
	static class Point{
		public int x,y;
		Point(int x,int y){
			this.x=x;
			this.y=y;
		}
	}

}

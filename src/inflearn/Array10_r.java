package inflearn;
import java.util.*;
public class Array10_r {
	public int solution(int n,int[][] arr) {
		int[] dx = {-1,0,0,1};
		int[] dy = {0,-1,1,0}; //ÁÂÇ¥ À§Ä¡
		int cnt = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				boolean flag = true;
				for(int k=0;k<dx.length;k++) {
					int x = i+dx[k];
					int y = j+dy[k];
					if(x>=0&&x<n&&y>=0&&y<n&&arr[i][j]<arr[x][y]) {
						flag = false;
						break;
					}
				}
				if(flag) cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		Array10_r ar = new Array10_r();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.print(ar.solution(n,arr));
	}

}

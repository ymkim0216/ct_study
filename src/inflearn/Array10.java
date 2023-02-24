package inflearn;
import java.util.*;

public class Array10 {
	public int solution(int n, int[][] arr) {
		int[][] grid = new int[n+2][n+2];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				grid[i+1][j+1] = arr[i][j];
			}
		}
		int cnt = 0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				int k = grid[i][j];
				if(k>grid[i-1][j]&&k>grid[i][j-1]&&k>grid[i+1][j]&&k>grid[i][j+1])
					cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		Array10 ar = new Array10();
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

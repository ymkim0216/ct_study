package inflearn;
import java.util.*;
public class Array12 {
	public int solution(int n,int m, int[][] arr) {
		int cnt =0;
		for(int i=0;i<n;i++) {//학생수 n만큼 돈다.
			ArrayList<Integer> list = new ArrayList<>();
			for(int j=i+1;j<n;j++) { // 첫 테스트를 기준으로 i 뒤에 있는 학생들 다 list추가
				list.add(arr[0][j]);
			}
			int now = arr[0][i];
			for(int j=1;j<m;j++) {
				for(int k=0;k<n;k++) {
					if(arr[j][k]!=now) {
						list.remove(Integer.valueOf(arr[j][k]));
					}else {
						break;
					}
				}
			}
			cnt += list.size();
		}
		return cnt;
	}
	public static void main(String[] args) {
		//학생수 N, 테스트 횟수 M
		Array12 ar = new Array12();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //테스트 횟수 ( 행 ) 
		int m = sc.nextInt(); // 학생 수 ( 열 )
		int[][] arr = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.print(ar.solution(n,m,arr));
	}

}

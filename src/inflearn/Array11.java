package inflearn;
import java.util.*;
public class Array11 {
	public int solution(int[][] arr) {
		int cnt = 0, captain = 0, max = 0;
		int[] same = new int[arr.length];
		for(int i=1;i<arr.length;i++) {
			cnt =0;
			for(int j=1;j<arr.length;j++) {
				for(int k=1;k<6;k++) {
					if(arr[i][k]==arr[j][k]) {cnt++; break;}
				}
			}
			same[i] = cnt;
		}
		for(int i=1;i<same.length;i++) {
			if(same[i]>max) {
				max = same[i];
				captain = i;
			}
		}
		return captain;
	}
	public static void main(String[] args) {
		Array11 ar = new Array11();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n+1][6];
		for(int i=1;i<arr.length;i++) {
			for(int j=1;j<6;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.print(ar.solution(arr));
	
	}

}

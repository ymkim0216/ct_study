package inflearn;
import java.util.*;
public class Array9 {
	public int solution(int[][] arr) {
		int max = 0; //�ڿ��� ���� ( 1�̻��� ��� ���� )
		int diaA = 0, diaB = 0;
		for(int i=0;i<arr.length;i++) {// �� & ���� max
			diaA += arr[i][i]; // diaA => ��->�� �밢��
			diaB += arr[i][arr.length-i-1]; //��->�� �밢��
			int sumA = 0;
			int sumB = 0;
			for(int j=0;j<arr[i].length;j++) {
				sumA += arr[i][j]; // ��
				sumB += arr[j][i]; // ��
			}
			int tmp = Math.max(sumA, sumB);
			if(tmp>max) max = tmp;
		}
		max = (max < Math.max(diaA, diaB)) ? Math.max(diaA,diaB) : max;
		return max;
	}
	public static void main(String[] args) {
		Array9 ar = new Array9();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.print(ar.solution(arr));
	}

}

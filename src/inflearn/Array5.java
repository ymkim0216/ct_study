package inflearn;
import java.util.*;
public class Array5 {
	public int solution(int n) {
		if(n<2) return -1;
		int[] arr = new int[n+1];//i�� ��ġ�ľ� => n+1
		int count =0;
		for(int i=2;i<=n;i++) {
			if(arr[i]==1) continue;//0�ΰ�츸 �ϸ�Ǳ���..
			count++;
			for(int j=i;j<=n;j=j+i) {
				arr[j] =1;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Array5 ar = new Array5();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(ar.solution(n));
	}

}

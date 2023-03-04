package inflearn;
import java.util.*;
public class Sorting2 {
	public static int[] solution(int n,int[] arr) {
		// 버블정렬
		// 큰 값이 보글보글 맨 뒤로 올라간다.
		
		for(int i=n-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(arr[j+1]<arr[j]) {
					int tmp=arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i:solution(n,arr)) {
			System.out.print(i+ " ");
		}
	}
}

package inflearn;
import java.util.*;
public class Sorting1 {
	public static int[] solution(int n,int[] arr) {
		//주소값을 이용해 가져왔기 때문에 arr반환해도 됨
		//선택정렬 : 최솟값을 앞으로 가져오는 정렬
		for(int i=0;i<n-1;i++) { //마지막 값은 자동으로 정렬되어 있으므로 제외
			int min=arr[i];//현재 값으로 초기화
			int tmp=i;
			for(int j=i+1;j<n;j++) {
				if(min>arr[j]) {
					min=arr[j];
					tmp=j;
				}
			}
			arr[tmp] = arr[i];
			arr[i] = min;
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

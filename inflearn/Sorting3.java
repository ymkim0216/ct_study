package inflearn;
import java.util.*;
public class Sorting3 {
	public static int[] solution(int n,int[] arr) {
		int j;
		for(int i=1;i<n;i++) {
			int tmp = arr[i];
			for(j=i-1;j>=0;j--) {//뒤부터 돌아서 큰게 있으면 뒤로 다 밀어버리고
				if(arr[j]>tmp) {
					arr[j+1] = arr[j];
				}else{
					break; //작거나 같은게 있으면 break;해서 j자리를 저장 
				}
			}
			arr[j+1] = tmp; //지금 j자리는 나보다 같거나 작은값 -> 다음자리에 tmp를 넣어줘야 알맞다.
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

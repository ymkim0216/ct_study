package inflearn;
import java.util.*;
public class Ch10_3 {
	public static int solution(int[] arr,int[] dy,int n) {
		int max = 0;
		dy[0]=1;
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i]) {
					dy[i]= dy[j]+1>dy[i]?dy[j]+1:dy[i];
					max = max>dy[i]?max:dy[i];
				}
			}
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] dy = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(solution(arr,dy,n));

	}

}

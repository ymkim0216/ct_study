package inflearn;
import java.util.*;
public class Sorting4_2 {
	public static int[] solution(int n,int arr[]) {
		int[] cache = new int[n];
		for(int x:arr) {
			int pos = -1;
			for(int j=0;j<n;j++) {
				if(x==cache[j]) pos = j;
			}
			if(pos==-1) { //새로운 값이 cache에 없으면
				for(int j=n-1;j>0;j--) {
					cache[j]=cache[j-1];
				} 
			}else { //새로운 값이 있으면 pos가 위치 지정. pos이전값들을 다 땡기면 됨
				for(int j=pos;j>0;j--) {
					cache[j]=cache[j-1];
				}
			}
			cache[0] = x;
		}
		return cache;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();//캐시 크기
		int m = sc.nextInt();// 계산횟수
		int[] arr = new int[m];
		for(int i=0;i<m;i++) { //계산 순서
			arr[i]=sc.nextInt();
		}
		for(int i:solution(n,arr)) {
			System.out.print(i+ " ");
		}
	}

}

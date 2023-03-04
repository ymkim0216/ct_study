package inflearn;

import java.util.*;

public class Sorting5_2 {
	public static String solution(int n,int[] arr) {
		String ans = "U";
		int j;
		//arr정렬(선택정렬)
		for(int i=1;i<n;i++) {
			int tmp = arr[i]; //tmp에 지금 정렬할 숫자 임시 저장
			int pos = 0; //pos는 tmp가 넣어져야할 위치
			for(j=i-1;j>=0;j--) { //정렬된 배열에서 만약 tmp보다 큰게 있다면 위치 저장
				if(tmp<arr[j]) arr[j+1] = arr[j];
				else break;
			}
			arr[j+1] = tmp;
		}
		for(int i=0;i<n-1;i++) {
			if(arr[i]==arr[i+1]) return "D";
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(n,arr));
	}

}

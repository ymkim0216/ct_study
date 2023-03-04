package inflearn;

import java.util.Scanner;

public class Sorting4 {
	public static int[] solution(int n,int[] arr) {
		String type="false"; //같은값이 없다.
		int now=0;
		int[] cache = new int[n];//캐시 생성
		for(int i=0;i<arr.length;i++) {
			int tmp = arr[i];// 지금 값을 저장 i의 값
			for(int j=0;j<n;j++) { //같은 값을 가진게 있나 확인.
				if(arr[i]==cache[j]) {
					type = "true";
					now = j;
				}
			}
			switch(type) {
			case "true":
				//위치는 now에 저장되어 있음
				for(int j=now-1;j>=0;j--) {
					cache[j+1]=cache[j];
				}
				cache[0] = tmp;
				type = "false";
				break;
			case "false":
				for(int j=n-2;j>=0;j--) { // 뒤부터 시작해서 cache[j]=cache[j-1]해도 됨. j=n-1,j>0
					cache[j+1] = cache[j];
				}//뒤에서부터 순차적으로 돌면 앞의 값을 저장할 필요가 없음.
				cache[0] = tmp;
				break;
			}
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

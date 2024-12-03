package baekjoon;
import java.util.*;
import java.io.*;
public class N2579 {
	static int n;
	public static int solution(int[] arr) {
		int[] score = new int[n+1];
		//초깃값 설정
		score[1]=arr[1];
		score[2]=arr[2]+arr[1];
		score[3] = Math.max(arr[1], arr[2]) + arr[3];
		//score계산
		for(int i=4;i<=n;i++) {
			score[i] = Math.max(score[i-2], arr[i-1]+score[i-3])+arr[i];
		}
		for(int i:score) {
			System.out.println(i);
		}
		return score[n];
	}
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		int[] arr = new int[n+1];
		for(int i=1;i<=n;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println(solution(arr));
	}

}

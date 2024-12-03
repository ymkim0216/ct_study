package inflearn;
import java.util.*;
public class Array8 {
	public int[] solution(int[] arr) {
		int[] rank = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			rank[i] = 1;
			for(int k=0;k<arr.length;k++) {
				if(arr[i]<arr[k]) rank[i]++;
			}
		}
		return rank;
	}
	public static void main(String[] args) {
		Array8 ar = new Array8();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i:ar.solution(arr)) {
			System.out.print(i+" ");
		}
	}

}

package inflearn;
import java.util.*;
public class Array3 {
	public char solution(int a,int b) {
		char result = '0';
		if(a==b) {
			result = 'D';
		}else if(a==1&&b==3) {
			result = 'A';
		}else if(a==3&&b==1) {
			result = 'B';
		}else if(a<b) {
			result = 'B';
		}else {
			result = 'A';
		}
		return result;
	}
	public static void main(String[] args) {
		Array3 ar = new Array3();
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] arrA = new int[cnt];
		int[] arrB = new int[cnt];
		for(int i=0;i<cnt;i++) {
			arrA[i] = sc.nextInt();
		}
		for(int i=0;i<cnt;i++) {
			arrB[i] = sc.nextInt();
		}
		for(int i=0;i<cnt;i++) {
			System.out.println(ar.solution(arrA[i], arrB[i]));
		}
	}

}

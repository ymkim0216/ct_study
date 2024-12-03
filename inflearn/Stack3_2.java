package inflearn;

import java.util.Scanner;
import java.util.Stack;

public class Stack3_2 {
	public static int solution(int[][] board,int[] moves) {
		int cnt = 0;
		Stack<Integer> stk = new Stack<>();
		for(int pos:moves) {
			for(int i=0;i<board.length;i++) {
				if(board[i][pos-1]!=0) {
					int tmp = board[i][pos-1];
					board[i][pos-1] = 0;
					if(!stk.isEmpty()&&stk.peek()==tmp) {
						cnt+=2;
						stk.pop();
					}
					else stk.push(tmp);
					break;
				}
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int m = sc.nextInt();
		int[] arr2 = new int[m];
		for(int i=0;i<m;i++) {
			arr2[i] = sc.nextInt();
		}
		
		System.out.println(solution(arr,arr2));
	}

}

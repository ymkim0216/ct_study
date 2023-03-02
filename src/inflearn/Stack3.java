package inflearn;
import java.util.*;
public class Stack3 {
	public static int solution(int n,int m,int[][] arr,int[] arr2) {
		int cnt = 0;
		Stack<Integer>[] stk = new Stack[n];
		for(int i=0;i<n;i++) {
			stk[i] = new Stack<>();
		}
		for(int i=n-1;i>=0;i--) {
			for(int j=0;j<n;j++) {
				if(arr[i][j]!=0) {
					stk[j].push(arr[i][j]);
				}
			}
		}
		Stack<Integer> blank = new Stack<>();
		
		for(int i=0;i<m;i++) {
			int k=arr2[i]-1;//arrÀ§Ä¡ 
			
			if(!stk[k].isEmpty()) {
				if(blank.isEmpty()) blank.push(stk[k].pop());
				else if (blank.peek()==stk[k].peek()) {
					blank.pop();
					stk[k].pop();
					cnt+=2;
				}else {
					blank.push(stk[k].pop());
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
		
		System.out.println(solution(n,m,arr,arr2));
	}

}

package inflearn;
import java.util.*;
public class Queue1 {
	public static int solution(int n,int m) {
		int ans=0;
		Queue<Integer> q = new LinkedList<>();
		for(int i=0;i<n;i++) {
			q.offer(i+1);
		}
		int cnt=0;
		while(q.size()!=1) {
			cnt++;
			if(cnt==m) {
				q.poll();
				cnt=0;
			}else {
				q.offer(q.poll());
			}
		}
		ans = q.peek();
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(solution(n,m));
	}

}

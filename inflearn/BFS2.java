package inflearn;
import java.util.*;
public class BFS2 {
	public static int BFS(int n,int m) {
		int[] dis= { 1,-1,5};
		int[] ch = new int[10001]; //체크배열
		Queue<Integer> q = new LinkedList<>();
		ch[n]=1;
		q.offer(n);
		int L = 0;
		while(!q.isEmpty()) {
			int len = q.size();
			for(int i=0;i<len;i++) {
				int tmp = q.poll();
				for(int j=0;j<3;j++) {
					int nx = tmp+dis[j];
					//if (nx==m) return ++L;
					if(nx>=1&&nx<=10000&&ch[nx]==0) {
						q.offer(nx);
						ch[nx] =1;
					}
				}
			}
			L++;
			if( q.contains(m)) break;
		}
		return L;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m =sc.nextInt();
		System.out.println(BFS(n,m));
	}

}

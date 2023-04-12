package baekjoon;
import java.util.*;
public class N1697_BFS {
	static int[] ch;
	public static int BFS(int n,int k) {
		Queue<Integer> q=new LinkedList<>();
		q.offer(n);
		while(!q.isEmpty()) {
			int now = q.poll();
			if(now==k) break;
			int[] tmp = {1,-1,now};
			for(int i=0;i<3;i++) {
				int x = now+tmp[i];
				if(x>=0&&x<=100000&&ch[x]==0) {//0이라는 의미 : 한번도 안왔다
					ch[x]=ch[now]+1;
					q.offer(x);
				}
			}
		}
		return ch[k];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		ch=new int[100001];
		System.out.println(BFS(n,k));
	}

}

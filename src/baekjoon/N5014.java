package baekjoon;
import java.util.*;
public class N5014 {
	static int f,u,d;
	static int[] ch;
	public static int BFS(int s,int g) {//start, goal
		Queue<Integer> q=new LinkedList<>();
		q.offer(s);
		ch[s]=0;
		while(!q.isEmpty()) {
			int now = q.poll();
			if(now==g) break;
			if(range(now+u)) {
				ch[now+u]=ch[now]+1;
				q.add(now+u);
			}
			if(range(now-d)) {
				ch[now-d]=ch[now]+1;
				q.add(now-d);
			}
		}
		return ch[g];
		
	}
	public static boolean range(int k) {
		boolean ans = false;
		if(k>=1&&k<=f&&ch[k]==-1) {
			ans = true;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		f = sc.nextInt();
		int s = sc.nextInt();
		int g = sc.nextInt();
		u = sc.nextInt();
		d= sc.nextInt();
		ch=new int[f+1];
		Arrays.fill(ch, -1);
		int ans = BFS(s,g);
		if(ans==-1) System.out.print("use the stairs");
		else {System.out.println(ans);}
	}

}

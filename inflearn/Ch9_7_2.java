package inflearn;
import java.util.*;
public class Ch9_7_2 {
	static ArrayList<ArrayList<Edge>> list;
	static int ch[];
	public static int solution(Edge e) {
		int sum=0;
		PriorityQueue<Edge> pQ = new PriorityQueue<>();
		pQ.add(e);
		while(!pQ.isEmpty()) {
			Edge now = pQ.poll();
			if(ch[now.v]!=1) {
				ch[now.v]=1;
				sum+=now.cost;
				for(Edge tmp:list.get(now.v)) {
					pQ.add(tmp);
				}
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		list= new ArrayList<>();
		ch = new int[n+1];
		for(int i=0;i<=n;i++) {
			list.add(new ArrayList<>());
		}
		for(int i=0;i<m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			list.get(a).add(new Edge(b,c));
			list.get(b).add(new Edge(a,c));
		}
		System.out.println(solution(new Edge(1,0)));
		
		

	}
	static class Edge implements Comparable<Edge>{
		public int v,cost;
		Edge(int v,int cost){
			this.v=v; this.cost=cost;
		}
		@Override
		public int compareTo(Edge e) {
			return this.cost-e.cost;
		}
	}

}

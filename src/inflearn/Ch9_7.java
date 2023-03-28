package inflearn;
import java.util.*;
public class Ch9_7 {
	static ArrayList<Edge> list;
	static int[] unf;
	public static int Find(int v) {
		if(v==unf[v])return unf[v];
		else return unf[v]=Find(unf[v]);
	}
	public static void Union(int a,int b) {
		int fa = Find(a);
		int fb= Find(b);
		if(fa!=fb) unf[fa]=fb;
	}
	public static int solution() {
		int sum=0;
		for(Edge e:list) {
			if(Find(e.v1)!=Find(e.v2)) {
				Union(e.v1,e.v2);
				sum+=e.cost;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //v개수
		int m = sc.nextInt(); //간선 개수
		unf = new int[n+1];
		list = new ArrayList<>();
		for(int i=1;i<=n;i++) {
			unf[i]=i;
		}
		for(int i=0;i<m;i++) {
			int a = sc.nextInt(); int b=sc.nextInt();int c= sc.nextInt();
			list.add(new Edge(a,b,c));
		}
		Collections.sort(list);
		System.out.println(solution());

	}
	static class Edge implements Comparable<Edge>{
		public int v1,v2,cost;
		Edge(int v1,int v2,int cost){
			this.v1=v1;
			this.v2=v2;
			this.cost = cost;
		}
		@Override
		public int compareTo(Edge e) {
			return this.cost-e.cost;
		}
	}
}

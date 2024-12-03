package inflearn;
import java.util.*;
public class DFS8 {
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;
	static int cnt;
	public static void DFS(int a,int b) {
		if(a==b) {cnt++; return;}
		ch[a]=1;
		ArrayList<Integer> list = graph.get(a);
		Iterator it = list.iterator();
		while(it.hasNext()) {
			int tmp = (int)it.next();
			if(ch[tmp]==1) continue;
			DFS(tmp,b);
			ch[tmp] =0;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		ch = new int[n+1];
		for(int i=0;i<=n;i++) {
			graph.add(new ArrayList<Integer>());
		}
		for(int i=0;i<m;i++) {
			graph.get(sc.nextInt()).add(sc.nextInt());
		}
		ch = new int[n+1];
		DFS(3,4);
		System.out.println(cnt);
		
	}

}

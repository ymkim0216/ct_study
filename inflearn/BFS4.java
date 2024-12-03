package inflearn;
import java.util.*;

public class BFS4 {
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;
	static int L;
	public static int BFS(int v) {
		Queue<Integer> q = new LinkedList<>();
		L=0;
		q.offer(1);
		ch[1]=1;
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i=0;i<size;i++) {
				int tmp = q.poll();
				Iterator<Integer> it = graph.get(tmp).iterator();
				while(it.hasNext()) {
					int k = it.next();
					if(k==v) return L+1;
					q.offer(k);
				}
			}
			L++;
		}
		return L;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		graph = new ArrayList<>();
		int n = sc.nextInt();
		int m= sc.nextInt();
		ch = new int[n+1];
		for(int i=0;i<=n;i++) {
			graph.add(new ArrayList<Integer>());
		}
		for(int i=0;i<m;i++) {
			graph.get(sc.nextInt()).add(sc.nextInt());
		}
		for(int i=2;i<=n;i++) {
			System.out.println(i+" : "+ BFS(i));
		}

	}

}


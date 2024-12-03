package inflearn;
import java.util.*;
public class BFS4_2 {
	static ArrayList<ArrayList<Integer>> list;
	static int[] ch;
	static int[] dis;
	
	public static void BFS() {
		Queue<Integer> q = new LinkedList<>();
		q.offer(1);
		ch[1]=1;
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i=0;i<size;i++) {
				int tmp = q.poll();
				//iterator 안사용하고  foreach문 사용하는 것이 효율이 좋음.
				//for(int x:list.get(tmp)){ ~~}
				Iterator<Integer> it = list.get(tmp).iterator();
				while(it.hasNext()) {
					int k = it.next();
					if(ch[k]==0) {
						q.offer(k);
						ch[k]=1;
						dis[k]=dis[tmp]+1;
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int m = sc.nextInt();
		ch = new int[n+1];
		dis = new int[n+1];
		list = new ArrayList<>();
		for(int i=0;i<=n;i++) {
			list.add(new ArrayList<Integer>());
		}
		for(int i=0;i<m;i++) {
			list.get(sc.nextInt()).add(sc.nextInt());
		}
		BFS();
		for(int i=2;i<dis.length;i++) {
			System.out.println(i+" : "+dis[i]);
		}
	}

}

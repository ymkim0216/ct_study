package inflearn;
import java.util.*;
public class BFS3 {
	static Node root;
	public static int BFS(int n,Node node) {
		Queue<Node> q = new LinkedList<>();
		q.offer(node);
		int L=0;
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i=0;i<size;i++) {
				Node tmp = q.poll();
				if(tmp.ln==null&&tmp.rn==null) return L;
				if(tmp.ln!=null) q.offer(tmp.ln);
				if(tmp.rn!=null) q.offer(tmp.rn);
			}
			L++;
		}
		return 0;
	}
	public static void main(String[] args) {
		root = new Node(1);
		root.ln = new Node(2);
		root.rn = new Node(3);
		root.ln.ln = new Node(4);
		root.ln.rn = new Node(5);
		System.out.println(BFS(0,root));
	}

}

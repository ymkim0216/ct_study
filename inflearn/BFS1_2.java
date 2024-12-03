package inflearn;
import java.util.*;
public class BFS1_2 {
	static Node root;
	public static void solution(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		int L = 0;
		while(!q.isEmpty()) {
			int size = q.size();
			System.out.println("L : "+L);
			for(int i=0;i<size;i++) {
				Node tmp = q.poll();
				if(tmp.ln!=null) q.offer(tmp.ln);
				if(tmp.rn!=null) q.offer(tmp.rn);
				System.out.print(tmp.data+" ");
			}
			L++;
			System.out.println();
		}
	}
	public static void main(String[] args) {
		root = new Node(1);
		root.ln = new Node(2);
		root.rn = new Node(3);
		root.ln.ln = new Node(4);
		root.ln.rn = new Node(5);
		root.rn.ln = new Node(6);
		root.rn.rn = new Node(7);
		
		solution(root);
	}

}

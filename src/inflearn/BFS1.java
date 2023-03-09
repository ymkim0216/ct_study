package inflearn;
import java.util.*;

class Node2{
	int data;
	Node2 ln;
	Node2 rn;
	Node2(int data){
		this.data = data;
		ln=rn=null;
	}
}
public class BFS1 {
	static Node2 root;
	public static void BFS(Node2 node) {
		Queue<Node2> q = new LinkedList<>();
		q.offer(node);
		int L = 0;
		while(!q.isEmpty()) {
			int len = q.size();
			System.out.println("L:"+L);
			for(int i=0;i<len;i++) {
				Node2 tmp = q.poll();
				System.out.print(tmp.data+" ");
				if(tmp.ln != null) q.offer(tmp.ln);
				if(tmp.rn != null) q.offer(tmp.rn);
			}
			L++;
			System.out.println();
		}
	}
	public static void main(String[] args) {
		root = new Node2(1);
		root.ln = new Node2(2);
		root.rn = new Node2(3);
		root.ln.ln = new Node2(4);
		root.ln.rn = new Node2(5);
		root.rn.ln = new Node2(6);
		root.rn.rn = new Node2(7);
		
		BFS(root);
		
	}

}

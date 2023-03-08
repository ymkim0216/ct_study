package inflearn;
import java.util.*;
class Node{
	int data;
	Node ln,rn;
	Node(int val){
		this.data = val;
		ln=rn=null;
	}
}
public class DFS4 {
	Node root;
	public void DFS_1(Node n) { //전위 순회 출력
		if(n ==null) return;
		System.out.print(n.data + " ");
		DFS_1(n.ln);
		DFS_1(n.rn);
	}
	public void DFS_2(Node n) { //중위 순회 출력
		if(n==null) return;
		DFS_2(n.ln);
		System.out.print(n.data + " ");
		DFS_2(n.rn);
	}
	public void DFS_3(Node n) { //후위 순회 출력
		if(n==null) return;
		DFS_3(n.ln);
		DFS_3(n.rn);
		System.out.print(n.data + " ");
	}
	public static void main(String[] args) {
		DFS4 tree = new DFS4();
		tree.root = new Node(1);
		tree.root.ln = new Node(2);
		tree.root.rn = new Node(3);
		tree.root.ln.ln = new Node(4);
		tree.root.ln.rn = new Node(5);
		tree.root.rn.ln = new Node(6);
		tree.root.rn.rn = new Node(7);
		tree.DFS_1(tree.root);
		System.out.println();
		tree.DFS_2(tree.root);
		System.out.println();
		tree.DFS_3(tree.root);
	}

}

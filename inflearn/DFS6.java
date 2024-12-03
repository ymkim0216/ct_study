package inflearn;
import java.util.*;
public class DFS6 {
	static Node root;
	public static int DFS(int L,Node node) {
		//min =0으로 고정 ( 길이 최소는 0이니까)
		if(node.ln==null&&node.rn==null) return L;
		else return Math.min(DFS(L+1,node.ln), DFS(L+1,node.rn));
	}
	public static void main(String[] args) {
		root = new Node(1);
		root.ln = new Node(2);
		root.rn = new Node(3);
		root.ln.ln = new Node(4);
		root.ln.rn = new Node(5);
		root.rn.ln = new Node(6);
		root.rn.rn = new Node(7);
		int L=0;
		System.out.println(DFS(L,root));
		
	}

}

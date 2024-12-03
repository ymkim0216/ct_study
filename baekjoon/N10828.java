package baekjoon;
import java.util.*;
import java.io.*;
public class N10828 {
	static int[] stack=new int[10001];
	static int pos=-1;
	static int size=0;
	public static void main(String[] agrs) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String method;
		StringTokenizer st;
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			method = st.nextToken();
			if(method.equals("push")) {
				push(Integer.parseInt(st.nextToken()));
			}
			else if(method.equals("pop")) {
				sb.append(pop()+"\n");
			}
			else if(method.equals("size")) {
				sb.append(size()+"\n");
			}
			else if(method.equals("empty")) {
				sb.append(empty()+"\n");
			}
			else if(method.equals("top")) {
				sb.append(top()+"\n");
			}
		}
		System.out.println(sb.toString());
	
	}
	/*push X: ���� X�� ���ÿ� �ִ� �����̴�.
	pop: ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
	size: ���ÿ� ����ִ� ������ ������ ����Ѵ�.
	empty: ������ ��������� 1, �ƴϸ� 0�� ����Ѵ�.
	top: ������ ���� ���� �ִ� ������ ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
	*/
	public static void push(int x) {
		size++;
		stack[++pos]=x;
	}
	public static int pop() {
		if(size==0) return -1;
		size-=1;
		return stack[pos--];
	}
	public static int size() {
		return size;
	}
	public static int empty() {
		if(size>0) return 0;
		else return 1;
	}
	public static int top() {
		if(size==0) return -1;
		else return stack[pos];
	}
}

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
	/*push X: 정수 X를 스택에 넣는 연산이다.
	pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	size: 스택에 들어있는 정수의 개수를 출력한다.
	empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
	top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
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

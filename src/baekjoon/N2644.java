package baekjoon;
import java.util.*;
public class N2644 {
	static int res=-1;
	static int[] ch; //check
	static ArrayList<ArrayList<Integer>> list;
	public static void DFS(int a,int b,int cnt) {
		if(a==b) {
			res=cnt; return;
		}
		else {
			ch[a]=1;
			ArrayList<Integer> tmp = list.get(a);
			for(int i:tmp) {
				if(ch[i]==0) {
					DFS(i,b,cnt+1);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ch=new int[n+1];
		int a = sc.nextInt();
		int b = sc.nextInt();
		int m = sc.nextInt();
		list= new ArrayList<>();
		for(int i=0;i<=n;i++) {
			list.add(new ArrayList<>());
		}
		for(int i=0;i<m;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			list.get(x).add(y);
			list.get(y).add(x);
		}
		DFS(a,b,0);
		System.out.println(res);
	}

}

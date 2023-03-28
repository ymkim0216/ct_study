package inflearn;
import java.util.*;
public class Ch9_6 {
	static int n,m;
	static ArrayList<ArrayList<Integer>> list;
	static String ans ="NO";
	static boolean flag = false;
	static int[] ch;
	public static void solution(int c,int d) {
		if(flag) return;
		if(c==d) {ans = "YES"; flag = true;}
		else {
			for(int tmp:list.get(c)) {
				if(ch[tmp]==0) {
					ch[tmp]=1;
					solution(tmp,d);
					ch[tmp]=0;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m=sc.nextInt();
		list = new ArrayList<>();
		for(int i=0;i<=n;i++) {
			list.add(new ArrayList<>());
		}
		for(int i=0;i<m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			list.get(a).add(b);
			list.get(b).add(a);
		}
		int c = sc.nextInt();
		int d = sc.nextInt();
		ch = new int[n+1];
		solution(c,d);
		System.out.println(ans);
		

	}

}

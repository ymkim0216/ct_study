package inflearn;
import java.util.*;
public class DFS7 {
	static int[][] graph;
	static int[] ch;
	static int cnt=0;
	
	public static void DFS(int a,int b) {
		if(a==b){
			cnt++;
			return;
		}
		ch[a] = 1;
		for(int i=1;i<graph[a].length;i++) {
			if(ch[i]==1) continue;
			if(graph[a][i]==1)  {
				DFS(i,b);
				ch[i] = 0;
			}
			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		graph = new int[n+1][n+1];
		for(int i=0;i<m;i++) {
			graph[sc.nextInt()][sc.nextInt()]=1;
		}
		ch = new int[n+1];
		DFS(1,5);
		System.out.println(cnt);
		
	}

}

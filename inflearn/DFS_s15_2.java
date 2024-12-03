package inflearn;
import java.util.*;

public class DFS_s15_2 {
	static int n,m,min=Integer.MAX_VALUE;
	static ArrayList<Point> pl,hl;
	static int[] pos;
	static void DFS(int L,int s) {
		if(L==m) {
			int sum=0;
			for(Point hp : hl) {
				int dis=Integer.MAX_VALUE;
				for(int i:pos) {
					int tmpd = Math.abs(hp.x-pl.get(i).x)+Math.abs(hp.y-pl.get(i).y);
					dis = Math.min(dis, tmpd);
				}
				sum+=dis;
			}
			min = Math.min(min, sum);
		}else {
			for(int i=s;i<pl.size();i++) {
				pos[L] = i;
				DFS(L+1,i+1);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		pl = new ArrayList<>();
		hl = new ArrayList<>();
		pos = new int[m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				int k=sc.nextInt();
				if(k==2) pl.add(new Point(i,j));
				else if(k==1) hl.add(new Point(i,j));
			}
		}
		DFS(0,0);
		System.out.println(min);
	}

}

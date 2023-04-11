package baekjoon;
import java.util.*;
public class N7569 {
	static int m,n,h,max=0;
	static ArrayList<Point> tomato;
	static int[][][] box;
	static int[][][] day;
	static int[] dx= {0,0,0,0,1,-1};
	static int[] dy= {1,-1,0,0,0,0};
	static int[] dz= {0,0,1,-1,0,0};
	
	public static void BFS() {
		Queue<Point> q = new LinkedList<>();
		for(Point p:tomato) {
			q.add(p);
		}
		while(!q.isEmpty()) {
			Point p = q.poll();
			for(int i=0;i<6;i++) {
				int tmpz = p.z+dz[i];
				int tmpy = p.y+dy[i];
				int tmpx = p.x+dx[i];
				if(tmpz>=0&&tmpz<h&&tmpy>=0&&tmpy<n&&tmpx>=0&&tmpx<m&&box[tmpz][tmpy][tmpx]==0) {
					day[tmpz][tmpy][tmpx]=day[p.z][p.y][p.x]+1;
					box[tmpz][tmpy][tmpx]=1;
					max = Math.max(max, day[tmpz][tmpy][tmpx]);
					q.add(new Point(tmpx,tmpy,tmpz));
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		m=sc.nextInt();//가로
		n=sc.nextInt();//세로
		h=sc.nextInt();//높이
		tomato=new ArrayList<>();
		box = new int[h][n][m];
		day = new int[h][n][m];
		for(int z=0;z<h;z++) {
			for(int y=0;y<n;y++) {
				for(int x=0;x<m;x++) {
					int num = sc.nextInt();
					box[z][y][x]=num;
					if(num==1) tomato.add(new Point(x,y,z));
				}
			}
		}
		int cnt = 0;
		BFS();
		cnt=max;
		for(int z=0;z<h;z++) {
			for(int y=0;y<n;y++) {
				for(int x=0;x<m;x++) {
					if(box[z][y][x]==0) cnt=-1;
				}
			}
		}
		System.out.println(cnt);
		
		
	}
	static class Point{
		public int x,y,z;
		Point(int x,int y,int z){ this.x=x; this.y=y;this.z=z;}
	}

}

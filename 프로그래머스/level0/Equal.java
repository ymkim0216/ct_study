package level0;
import java.util.*;
public class Equal {
	static class Point{
		public int x,y;
		Point(int x,int y){this.x=x;this.y=y;}
	}
	public int solution(int[][] dots) {
		int ans=0;
		int[] ch = new int[4];
		Stack<Point> st = new Stack<>();
		for(int i=0;i<dots.length;i++) {
			ch[i]=1;
			for(int j=i+1;j<dots.length;j++){
				ch[j]=1;
				int dx = dots[j][0]-dots[i][0];
				int dy = dots[j][1]-dots[i][1];
				double l1 = dx/(double)dy;
				for(int k=0;k<4;k++) {
					if(ch[k]==0) {
						st.add(new Point(dots[k][0],dots[k][1]));
					}
				}
				Point p1 = st.pop();
				Point p2 = st.pop();
				double l2 = (p2.x-p1.x)/(double)(p2.y-p1.y);
				if(l1==l2) return 1;
				ch[j]=0;
			}
			ch[i]=0;
		}
		return ans;
    }
	public static void main(String[] args) {
		int[][] arr = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};
		Equal e = new Equal();
		System.out.println(e.solution(arr));
	}

}

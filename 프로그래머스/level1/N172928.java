package level1;

import java.util.*;

public class N172928 {
	public int[] solution(String[] park, String[] routes) {
		// S : 시작, O : 이동가능 통로, X : 장애물
		int[][] direct = {{-1,0},{1,0},{0,1},{0,-1}};
		// 북 ( N ), 남 ( S ), 동 ( E ), 서 ( W )
		int x = -1, y = -1; //시작 위치
		for (int i = 0; i < park.length; i++) {
			for (int j = 0; j < park[i].length(); j++) {
				if (park[i].charAt(j) == 'S') {
					x = i;
					y = j;
					break;
				}
			}
			if(x!=-1&&y!=-1) break;
		}
		int dir;
		boolean flag = false;
		for(String s:routes) {
			int tx=x,ty=y;
			if(s.charAt(0)=='N') {
				dir = 0;
			}else if(s.charAt(0)=='S'){
				dir = 1;
			}else if(s.charAt(0)=='E') {
				dir = 2;
			}else {
				dir = 3;
			}
			for(int i=0;i<s.charAt(2)-'0';i++) {
				int tmpx = x+ direct[dir][0];
				int tmpy = y+direct[dir][1];
				if(tmpx>=0&&tmpy>=0&&tmpx<park.length&&tmpy<park[i].length()&&park[tmpx].charAt(tmpy)!='X') {
					x = tmpx;
					y = tmpy;
				}else {
					flag = true;
					break;
				}
			}
			if(flag) {
				x = tx; y = ty;
				flag = false;
			}
		}
		return new int[] {x,y};
	}

	public static void main(String[] args) {
		N172928 T = new N172928();
		String[] a = {"SOO","OOO","OOO"};
		String[] b = {"E 2","S 2","W 1"};
		System.out.println(Arrays.toString(T.solution(a,b)));
	}

}

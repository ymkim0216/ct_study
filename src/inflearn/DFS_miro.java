package inflearn;
import java.util.*;
public class DFS_miro {
	static int[][] miro;
	static int[][] pos = {{0,1},{0,-1},{-1,0},{1,0}};
	static int cnt;
	public static void DFS(int x,int y) {
		if(x==7&&y==7) {
			cnt++;
		}
		else {
			for(int i=0;i<4;i++) {
				int tmpx = x+pos[i][0];
				int tmpy = y+pos[i][1];
				if(tmpx>=1&&tmpx<=7&&tmpy>=1&&tmpy<=7&&miro[tmpx][tmpy]==0) {
					miro[tmpx][tmpy]=1;//왔던길을 다시가면 안되니까 1로 지정해서 막아준다.
					DFS(tmpx,tmpy);
					miro[tmpx][tmpy]=0;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		miro = new int[8][8];
		for(int i=1;i<8;i++) {
			for(int j=1;j<8;j++) {
				miro[i][j]=sc.nextInt();
			}
		}
		miro[1][1] = 1;
		DFS(1,1);
		System.out.println(cnt);
	}

}

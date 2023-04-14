package baekjoon;
import java.util.*;
import java.io.*;
public class N14503 {
	static int n,m,cnt=1;//���� �ڸ� count 1
	static int[][] board;
	static int[] dr = {-1,0,1,0};//��,��,��,��
	static int[] dc = {0,1,0,-1};
	public static void DFS(int r,int c,int d) {//��ǥ, ����
		//û�� �ɶ� (d�� �������� iterator �ؾ���.)
		int td=d;
		for(int i=0;i<4;i++) {
			td = position(td);
			int tr = r+dr[td];
			int tc = c+dc[td];
			if(tr>=1&&tc>=1&&tr<n-1&&tc<m-1&&board[tr][tc]==0) {
				board[tr][tc]=-1;//û�� ��
				cnt++;
				DFS(tr,tc,td);
				return;
			}
		}
		//û�� �� ���� ������
		if(td==d) {
			td= d>1? d-2:d+2;
			int tr = r+dr[td];
			int tc = c+dc[td];
			if(tr>=1&&tc>=1&&tr<n-1&&tc<m-1&&board[tr][tc]!=1){//���� �ƴϸ� ����
				DFS(tr,tc,d);
			}	
		}
		//�ڰ� ���̸� return
		return;
		
	}
	public static int position(int d) {
		if(d-1<0) return 3;
		else return d-1;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		board = new int[n][m];
		//��ǥ, ����(0: ��, 1:��, 2:��, 3:��) (r,c), d
		st = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<m;j++) {
				board[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		board[r][c]=-1;
		DFS(r,c,d);
		System.out.println(cnt);
	}

}

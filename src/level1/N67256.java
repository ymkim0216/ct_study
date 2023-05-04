package level1;
import java.util.*;
public class N67256 {
	static int[][] keypad = {{1,2,3},{4,5,6},{7,8,9},{-10,0,10}};
	static int[][] lo = {{0,1},{0,-1},{1,0},{-1,0}};
	
	public static String solution(int[] numbers, String hand) {
        int left=-10,right=10;//마지막 위치 저장 : 초기 위치 *(-10) 과 #(10)
        StringBuilder sb = new StringBuilder();
         // false : 왼쪽 true : 오른쪽
        for(int x:numbers) {
        	boolean direction = false;
        	if(x==1||x==4||x==7) {
        		direction=false;
        	}else if(x==3||x==6||x==9) {
        		direction=true;
        	}else {
        		int L = BFS(left,x); //왼쪽에서의 거리
        		int R = BFS(right,x);//오른쪽에서의 거리
        		System.out.println(x+":"+L+","+R);
        		if(L==R) {
        			if(hand.equals("left")) {
        				direction=false;
        			}else {
        				direction=true;
        			}
        		}else if(L<R){
        			direction=false;
        		}else {
        			direction=true;
        		}
        	}
        	if(!direction) {
        		sb.append("L");
        		left = x;
        	}else {
        		sb.append("R");
        		right = x;
        	}
        }
        return sb.toString();
    }
	
	public static int BFS(int start,int target) {
		if(start==target) return 0;
		Queue<Integer> q = new LinkedList<>();
		int[][] check = new int[4][3];
		q.offer(start);
		while(!q.isEmpty()) {
			int now = q.poll();
			if(now==0||now==-10||now==10) {
				if(now==0) now=11;
				else if(now==-10) now = 10;
				else now = 12;
			}
			int nx = (now-1)/3;
			int ny = (now-1)%3;
			
			int cnt= check[nx][ny];
			for(int i=0;i<4;i++) {
				int tmpx = nx + lo[i][0];
				int tmpy = ny + lo[i][1];
				if(tmpx>=0&&tmpy>=0&&tmpx<4&&tmpy<3&&check[tmpx][tmpy]==0) {
					if(keypad[tmpx][tmpy]==target) return cnt+1;
					else {
						q.offer(keypad[tmpx][tmpy]);
						check[tmpx][tmpy]=(cnt+1);
					}
				}
			}
		}
		return check[(target-1)/3][(target-1)%3];
	}
	public static void main(String[] args) {
		int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		String hand = "right";
		System.out.println(solution(n,hand));
		System.out.println("LLRLLRLLRL");
	}

}

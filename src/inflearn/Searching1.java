package inflearn;
import java.util.*;
class Point{
	Integer x;
	Integer y;
	Point(Integer x,Integer y){
		this.x= x;
		this.y=y;
	}
}
public class Searching1 {
	public static int[][] solution(int n,int[][] arr){
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				Point now = new Point(arr[j][0],arr[j][1]);
				Point next = new Point(arr[j+1][0],arr[j+1][1]);
				int ans = now.x.compareTo(next.x);
				switch(ans) {
				case -1:
					break;
				case 0:
					if(now.y.compareTo(next.y)==1) {}
					else break;
				case 1:
					arr[j+1][0] = now.x;
					arr[j+1][1] = now.y;
					arr[j][0] = next.x;
					arr[j][1] = next.y;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][2];
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) arr[i][j] = sc.nextInt();
		}
		solution(n,arr);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i][0] +" "+arr[i][1]);
		}
	}

}

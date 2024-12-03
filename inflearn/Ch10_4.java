package inflearn;
import java.util.*;
public class Ch10_4 {
	public static int solution(Brick[] arr,int[] dy) {
		Arrays.sort(arr);
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			int max =0;
			//무게가 나보다 커야함. + 나보다 max값이 커야함. (area값은 정렬된 상태)
			for(int j=i-1;j>=0;j--) {
				if(arr[i].w<arr[j].w&&dy[j]>max) {
					max = dy[j];
				}
			}
			dy[i]=max+arr[i].h;
			ans = Math.max(dy[i], ans);
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dy = new int[n];
		Brick[] arr = new Brick[n];
		for(int i=0;i<n;i++) {
			arr[i]= new Brick(sc.nextInt(),sc.nextInt(),sc.nextInt());
		}
		System.out.println(solution(arr,dy));
	}
	static class Brick implements Comparable<Brick>{
		public int area,h,w;
		Brick(int area,int h,int w){
			this.area=area;
			this.h=h;
			this.w=w;
		}
		@Override
		public int compareTo(Brick b) {
			return b.area-this.area;
		}
		
	}

}

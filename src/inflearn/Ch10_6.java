package inflearn;
import java.util.*;
public class Ch10_6 {
	static int[] dy;
	public static int solution(int n,int m,Quiz[] arr) {
		int max=0;
		Arrays.sort(arr); //time기준으로 오름차순 정렬
		for(int i=0;i<n;i++) {//arr의 time을 기준으로 루프를 돈다.
			//냅색 알고리즘에서 개수가 유한개이면 뒤에서부터 돌아야지 중복이 안된다
			//10 5라면 앞에서 부터 돌면 dy[10]일때는 10점짜리 문제 두개를 풀 수 있으므로
			//중복처리됨=> 뒤에서 부터 돌아야지 중복처리안됨!
			for(int j=m;j>=arr[i].t;j--) {
				dy[j]=Math.max(dy[j], dy[j-arr[i].t]+arr[i].s);
			}
		}
		return dy[m];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Quiz[] arr = new Quiz[n];
		for(int i=0;i<n;i++) {
			arr[i]=new Quiz(sc.nextInt(),sc.nextInt());
		}
		dy=new int[m+1];
		System.out.println(solution(n,m,arr));
	}
	static class Quiz implements Comparable<Quiz>{
		public int s,t;//score,time
		Quiz(int s,int t){
			this.s=s;
			this.t=t;
		}
		@Override
		public int compareTo(Quiz q) {
			return this.t-q.t;
		}
	}

}

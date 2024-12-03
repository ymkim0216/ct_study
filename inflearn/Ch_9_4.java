package inflearn;
import java.util.*;
public class Ch_9_4 {
	static public int solution(Speech[] arr,int n) {
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
		Arrays.sort(arr);
		int max = arr[0].d;
		int sum=0;

		int j=0;
		for(int i=max;i>=1;i--) {
			for(;j<n;j++){
				System.out.println(arr[j].p+": "+arr[j].d);
				if(arr[j].d<i) break;
				else pQ.offer(arr[j].p);
			}
			if(!pQ.isEmpty()) sum+= pQ.poll();
		}
		return sum;
	}
	static public void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		Speech[] arr = new Speech[n];
		for(int i=0;i<n;i++) {
			arr[i] = new Speech(sc.nextInt(),sc.nextInt());
		}
		System.out.println(solution(arr,n));
		
	}
	static class Speech implements Comparable<Speech>{
		public int p,d;//pay,day
		Speech(int p,int d){
			this.p=p;
			this.d=d;
		}
		@Override
		public int compareTo(Speech s) {
			return s.d-this.d;
		}
	}
	
}

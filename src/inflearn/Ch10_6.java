package inflearn;
import java.util.*;
public class Ch10_6 {
	static int[] dy;
	public static int solution(int n,int m,Quiz[] arr) {
		int max=0;
		Arrays.sort(arr); //time�������� �������� ����
		for(int i=0;i<n;i++) {//arr�� time�� �������� ������ ����.
			//���� �˰��򿡼� ������ ���Ѱ��̸� �ڿ������� ���ƾ��� �ߺ��� �ȵȴ�
			//10 5��� �տ��� ���� ���� dy[10]�϶��� 10��¥�� ���� �ΰ��� Ǯ �� �����Ƿ�
			//�ߺ�ó����=> �ڿ��� ���� ���ƾ��� �ߺ�ó���ȵ�!
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

package inflearn;
import java.util.*;

public class Decision1_2 {
	public static int count(int mid,int[] arr) {
		int cnt = 1;
		int sum=0;
		for(int x:arr) {
			if(sum+x>mid) {
				cnt++;
				sum=x;
			}else sum+=x;
		}
		return cnt;
	}
	public static int solution(int m,int[] arr) {
		int mid=0,ans=0;
		int lt=Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();
		while(lt<=rt) {
			mid = (lt+rt)/2;
			if(count(mid,arr)<=m) {
				ans = mid;//��� mid���� ����Ǵµ� count<=3�� �����ϴ� ���� ����Ǿ����.
				rt = mid-1;//���� ans�� ���� �����ؾ��� �ùٸ� ���� ���� �� �ִ�.
			}else lt = mid+1;
		}
		System.out.println(lt + ", "+rt+", "+mid);
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int m= sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {	arr[i]=sc.nextInt();}
		System.out.println(solution(m,arr));
	}

}

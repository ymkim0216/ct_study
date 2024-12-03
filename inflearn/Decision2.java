package inflearn;
import java.util.*;
public class Decision2 {
	public static int count(int mid,int[] arr) {
		int cnt=1,ep=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]-ep>=mid) {
				cnt++;
				ep=arr[i];
			}
		}
		return cnt;
	}
	public static int solution(int m,int[] arr) {
		int ans =0;
		Arrays.sort(arr);
		int rt = Arrays.stream(arr).max().getAsInt();
		int lt= 1;
		int mid=0;//�� �������� ��ȿ������ ��� �����ϴ����� �߿�
		while(lt<=rt) {
			mid=(lt+rt)/2;
			if(count(mid,arr)>=m) { //count�� m�� �Ѵ´ٴ� �ǹ̴� ���� ���Ƿ� ������ �����ؼ� 3���� 
				ans = mid;//����� �ִٴ� �ǹ� == ��ȿ�ϴٴ� �ǹ���.
				lt = mid+1;//�ִ��� ���ϴϱ� ��ȿ�� mid ���ĸ� ���Ѵ�.
			}else rt= mid-1; 
		}
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

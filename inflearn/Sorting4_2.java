package inflearn;
import java.util.*;
public class Sorting4_2 {
	public static int[] solution(int n,int arr[]) {
		int[] cache = new int[n];
		for(int x:arr) {
			int pos = -1;
			for(int j=0;j<n;j++) {
				if(x==cache[j]) pos = j;
			}
			if(pos==-1) { //���ο� ���� cache�� ������
				for(int j=n-1;j>0;j--) {
					cache[j]=cache[j-1];
				} 
			}else { //���ο� ���� ������ pos�� ��ġ ����. pos���������� �� ����� ��
				for(int j=pos;j>0;j--) {
					cache[j]=cache[j-1];
				}
			}
			cache[0] = x;
		}
		return cache;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();//ĳ�� ũ��
		int m = sc.nextInt();// ���Ƚ��
		int[] arr = new int[m];
		for(int i=0;i<m;i++) { //��� ����
			arr[i]=sc.nextInt();
		}
		for(int i:solution(n,arr)) {
			System.out.print(i+ " ");
		}
	}

}

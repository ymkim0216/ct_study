package inflearn;
import java.util.*;
public class Sorting1 {
	public static int[] solution(int n,int[] arr) {
		//�ּҰ��� �̿��� �����Ա� ������ arr��ȯ�ص� ��
		//�������� : �ּڰ��� ������ �������� ����
		for(int i=0;i<n-1;i++) { //������ ���� �ڵ����� ���ĵǾ� �����Ƿ� ����
			int min=arr[i];//���� ������ �ʱ�ȭ
			int tmp=i;
			for(int j=i+1;j<n;j++) {
				if(min>arr[j]) {
					min=arr[j];
					tmp=j;
				}
			}
			arr[tmp] = arr[i];
			arr[i] = min;
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i:solution(n,arr)) {
			System.out.print(i+ " ");
		}
	}

}

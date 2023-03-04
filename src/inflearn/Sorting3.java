package inflearn;
import java.util.*;
public class Sorting3 {
	public static int[] solution(int n,int[] arr) {
		int j;
		for(int i=1;i<n;i++) {
			int tmp = arr[i];
			for(j=i-1;j>=0;j--) {//�ں��� ���Ƽ� ū�� ������ �ڷ� �� �о������
				if(arr[j]>tmp) {
					arr[j+1] = arr[j];
				}else{
					break; //�۰ų� ������ ������ break;�ؼ� j�ڸ��� ���� 
				}
			}
			arr[j+1] = tmp; //���� j�ڸ��� ������ ���ų� ������ -> �����ڸ��� tmp�� �־���� �˸´�.
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

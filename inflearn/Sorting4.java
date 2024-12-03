package inflearn;

import java.util.Scanner;

public class Sorting4 {
	public static int[] solution(int n,int[] arr) {
		String type="false"; //�������� ����.
		int now=0;
		int[] cache = new int[n];//ĳ�� ����
		for(int i=0;i<arr.length;i++) {
			int tmp = arr[i];// ���� ���� ���� i�� ��
			for(int j=0;j<n;j++) { //���� ���� ������ �ֳ� Ȯ��.
				if(arr[i]==cache[j]) {
					type = "true";
					now = j;
				}
			}
			switch(type) {
			case "true":
				//��ġ�� now�� ����Ǿ� ����
				for(int j=now-1;j>=0;j--) {
					cache[j+1]=cache[j];
				}
				cache[0] = tmp;
				type = "false";
				break;
			case "false":
				for(int j=n-2;j>=0;j--) { // �ں��� �����ؼ� cache[j]=cache[j-1]�ص� ��. j=n-1,j>0
					cache[j+1] = cache[j];
				}//�ڿ������� ���������� ���� ���� ���� ������ �ʿ䰡 ����.
				cache[0] = tmp;
				break;
			}
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

package level0;

import java.util.Arrays;

public class N_sort {
	//n�� �������� sort. ������ �� ���� ū���� �տ� ������.
	//n�� ���� sort�ϰ� n���ϴ� ���
	public int[] solution(int[] numlist, int n) {
        int[] n_clone = new int[numlist.length];
        int n_length=numlist.length;
        for(int i=0;i<n_length;i++) {
        	n_clone[i]=numlist[i]-n;
        }
        for(int i=0;i<n_length-1;i++) {
        	for(int j=i+1;j<n_length;j++) {//�� ������ ���̶� ���ؼ� �÷��� (��������)?
        		int a = Math.abs(n_clone[i]);
        		int b= Math.abs(n_clone[j]);
        		if(a>b) { //������ ������ ũ�� �ڸ� �ٲ�
        			int temp = n_clone[i];
        			n_clone[i]=n_clone[j];
        			n_clone[j]=temp;
        		}else if(a==b) {//������ ū ���� ������ ������
        			if(n_clone[i]<n_clone[j]) {
        				int temp = n_clone[i];
            			n_clone[i]=n_clone[j];
            			n_clone[j]=temp;
        			}
        		}
        	}
        	
        }
        for(int i=0;i<n_length;i++) {//n������ ������
        	n_clone[i] +=n;
        }
        return n_clone;
    }

}

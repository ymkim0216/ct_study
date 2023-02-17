package level0;

import java.util.Arrays;

public class EM_rank {

	public static int[] solution(int[][] score) {//��,�� ������� rank
        double[] answer = new double[score.length];
        //double�� ���ҽ� ���������� �߷����� 1,2 , 1,1 => �Ȱ��� ��հ��� ��ȯ.
        int[] rank = new int[score.length];
        for(int i=0;i<answer.length;i++) {
        	answer[i]= (double)(score[i][0]+score[i][1])/2; //��� ����
        }
        for(int i=0;i<answer.length;i++) {
        	rank[i] = 1;
        	for(int j=0;j<answer.length;j++) {
        		if(answer[i]<answer[j]) { //������ j��ȯ�ϴ� ���� �� ũ�� rank+1����.
        			rank[i]++;
        		}
        	}
        }
        return rank;
    }

}

package level0;

import java.util.Arrays;

public class EM_rank {

	public static int[] solution(int[][] score) {//영,수 평균으로 rank
        double[] answer = new double[score.length];
        //double로 안할시 나머지값은 잘려나감 1,2 , 1,1 => 똑같은 평균값을 반환.
        int[] rank = new int[score.length];
        for(int i=0;i<answer.length;i++) {
        	answer[i]= (double)(score[i][0]+score[i][1])/2; //평균 저장
        }
        for(int i=0;i<answer.length;i++) {
        	rank[i] = 1;
        	for(int j=0;j<answer.length;j++) {
        		if(answer[i]<answer[j]) { //나보다 j순환하는 값이 더 크면 rank+1해줌.
        			rank[i]++;
        		}
        	}
        }
        return rank;
    }

}

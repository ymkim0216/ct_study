package level0;

import java.util.Arrays;

public class N_sort {
	//n을 기준으로 sort. 같을시 두 값중 큰값이 앞에 오도록.
	//n을 빼고 sort하고 n더하는 방식
	public int[] solution(int[] numlist, int n) {
        int[] n_clone = new int[numlist.length];
        int n_length=numlist.length;
        for(int i=0;i<n_length;i++) {
        	n_clone[i]=numlist[i]-n;
        }
        for(int i=0;i<n_length-1;i++) {
        	for(int j=i+1;j<n_length;j++) {//나 이후의 값이랑 비교해서 올려줌 (버블정렬)?
        		int a = Math.abs(n_clone[i]);
        		int b= Math.abs(n_clone[j]);
        		if(a>b) { //차이의 절댓값이 크면 자리 바꿈
        			int temp = n_clone[i];
        			n_clone[i]=n_clone[j];
        			n_clone[j]=temp;
        		}else if(a==b) {//같으면 큰 수를 앞으로 보내줌
        			if(n_clone[i]<n_clone[j]) {
        				int temp = n_clone[i];
            			n_clone[i]=n_clone[j];
            			n_clone[j]=temp;
        			}
        		}
        	}
        	
        }
        for(int i=0;i<n_length;i++) {//n뺐으니 더해줌
        	n_clone[i] +=n;
        }
        return n_clone;
    }

}

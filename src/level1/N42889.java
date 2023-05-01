package level1;

import java.util.*;

public class N42889 {

	public static int[] solution(int N, int[] stages) {
		int[] ans = new int[N]; 
		double[] result = new double[N];//실패율
		int[] clear = new int[N+1]; //도달한 횟수
		int[] nonclear = new int[N+1];  //클리어 X
		
		for(int i=0;i<stages.length;i++) {
			int tmp = stages[i]-1;
			for(int j=0;j<tmp;j++) {
				clear[j]+=1;
			}
			nonclear[tmp]+=1;
		}
		for(int i=0;i<N;i++) {
			ans[i]=i+1;
			if(clear[i]==0) result[i]=0;
			result[i]= (double) nonclear[i]/clear[i];
		}
		for(int i=N-1;i>=0;i--) {
			for(int j=0;j<i;j++) {
				if(result[j]<result[j+1]) {
					double tmp1 = result[j];
					result[j]=result[j+1];
					result[j+1] = tmp1;
					
					int tmp2 = ans[j];
					ans[j] = ans[j+1];
					ans[j+1] = tmp2;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = {2, 1, 2, 6, 2, 4, 3, 3};
		int n = 5;
		for(int i:solution(n,arr)) {
			System.out.print(i+", ");
		}
	}

}

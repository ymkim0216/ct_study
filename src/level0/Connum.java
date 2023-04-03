package level0;
import java.util.*;
public class Connum {
	public static int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = (total/num)-((num-1)/2);
        for(int i=0;i<num;i++) {
        	answer[i]=start++;
        }
        /*int sum=0,cnt=0;
        for(int i=total;;i--) {
        	sum=0;
        	cnt=0;
        	for(int j=i;j>i-num;j--) {
        		answer[cnt++]=j;
        		sum+=j;
        	}
        	if(sum==total) {
        		Arrays.sort(answer);
        		return answer;
        	}
        }*/
        return answer;
    }
	public static void main(String[] args) {
		for(int k:solution(4,14)) {
			System.out.print(k+" ");
		}
	}

}

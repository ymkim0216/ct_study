package level0;

import java.util.Arrays;

public class Triangle_2 {

	public static void main(String[] args) {
		int a[] = {11,7};
		System.out.print(solution(a));
	}
	public static int solution(int[] sides) {
		//변이 두개 주워질때 가능한 나머지 변의 개수는?
		//1. 나머지가 가장 긴 변일때, 2. 두개중 하나가 큰 변일때
        int count = 0;
        Arrays.sort(sides); //두번째가 더 긴 변
        for(int i=1;i<=sides[1];i++) {
        	if(sides[0]+i>sides[1]) {
        		count++;
        	}
        }
        for(int i=sides[1]+1;i<sides[0]+sides[1];i++) {
        	count++;
        }
        return count;
    }

}

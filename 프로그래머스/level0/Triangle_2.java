package level0;

import java.util.Arrays;

public class Triangle_2 {

	public static void main(String[] args) {
		int a[] = {11,7};
		System.out.print(solution(a));
	}
	public static int solution(int[] sides) {
		//���� �ΰ� �ֿ����� ������ ������ ���� ������?
		//1. �������� ���� �� ���϶�, 2. �ΰ��� �ϳ��� ū ���϶�
        int count = 0;
        Arrays.sort(sides); //�ι�°�� �� �� ��
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

package level0;
import java.util.*;
public class Next_Num {
	public static int solution(int[] common) {
        //2���� ���� ��
        //���� ���� ������ -> ��������
        //���� �ٸ��� -> ������
        int sub1 = common[1]-common[0]; // ��
        int sub2 = common[2]-common[1];
        if(sub1!=sub2) {
        	int x = common[2]/common[1];
        	return x*common[common.length-1];
        }else {
        	return sub1+common[common.length-1];
        }
    }
	public static void main(String[] args) {
		int[] arr = {2,4,8};
		System.out.println(solution(arr));

	}

}

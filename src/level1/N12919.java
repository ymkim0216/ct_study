package level1;
import java.util.*;
public class N12919 {
	public static String solution(String[] seoul) {
        int index=0;
	    for(int i=0;i<seoul.length;i++) {
	    	if(seoul[i].equals("Kim")) index=i;
	    }
        return "�輭���� "+index+"�� �ִ�";
    }
	public static void main(String[] args) {
		String[] arr= {"Kim","sor"};
		System.out.println(solution(arr));
		
	}

}

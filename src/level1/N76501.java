package level1;
import java.util.*;
public class N76501 {
	public static int solution(int[] absolutes, boolean[] signs) {
        int ans = 0;
        for(int i=0;i<signs.length;i++) {
        	if(signs[i]==true) {
        		ans +=absolutes[i];
        	}else {
        		ans -=absolutes[i];
        	}
        }
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package level2;
import java.util.*;
public class N12939 {	
	public String solution(String s) {
        String[] list = s.split(" ");
        int min=Integer.MAX_VALUE; int max = Integer.MIN_VALUE;
        for(String s1: list) {
        	min = Math.min(min, Integer.parseInt(s1));
        	max = Math.max(max, Integer.parseInt(s1));
        }
        return min+" "+max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

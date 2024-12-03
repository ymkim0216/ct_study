package level1;
import java.util.*;
public class N134240 {
	//1, 3, 4, 6
	//1223330333221
	
	public static String solution(int[] food) {
		StringBuilder sb = new StringBuilder();
        String answer = "";
        for(int i=1;i<food.length;i++) {
        	food[i]=food[i]/2;
        	sb.append(Integer.toString(i).repeat(food[i]));
        }
        return sb.toString()+"0"+sb.reverse().toString();
    }
	public static void main(String[] args) {
		int[] food= {1,3,4,6};
		System.out.println(solution(food));

	}

}
